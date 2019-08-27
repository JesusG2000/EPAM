package by.etc.strings.regular_expression;

import java.util.regex.*;
//Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текcтом
// три различных операции: отсортировать абзацы nо количеству предложений; в каждом предложении отсортировать
// слова по длине; отсортировать лексемы в предложeнии по убыванию количества вхождений заданного cимвола, а в
// случае равенства – по алфавиту.
    public class TaskOne {

    public static void main(String[] args) {

        String text = "Keith  recently came back from Test trip to Chicago, Illinois." +
                "This midwestern metropolis is found along the shore of Lake Michigan." +
                "During his visit, Keith spent Test lot of time exploring the city to visit important landmarks and monuments." +
                "\n" +
                "Keith loves baseball, and he made sure to take Test visit to Wrigley Field." +
                "\n" +
                "In the stadium, Keiith and the other fans cheered " +
                "Keith was happy that the Cubs won with Test score of 5-4.";



        System.out.println(sortByWords("[A-Za-z0-9\\n]+|\\.", text));
        System.out.println(sortByParagraph("\n", text));
        System.out.println(sortByLex("\\.", text,'i'));


    }
    private static String [] initialisation(String []mas , int size){
        for (int i = 0; i < size; i++) {
            mas[i] = "";
        }
        return mas;
    }

    static String sortByWords(String regex, String text) {
        String newText = "";
        String[] saveWords = new String[text.length()];
        Pattern checkRegex = Pattern.compile(regex);
        Matcher matcher = checkRegex.matcher(text);
        int counter = 0;

        initialisation(saveWords,text.length());

        while (matcher.find()) {
            saveWords[counter] = matcher.group();
            if (matcher.group().equals(".") || matcher.group().equals("?") || matcher.group().equals("!")) {
                sortByWordLenght(saveWords);
                newText = addText(newText, saveWords);
                counter = 0;
            }
            counter++;
        }
        return newText;

    }

    private static String addText(String newText, String[] saveWords) {
        for (String add : saveWords) {
            if (!add.equals("")) {
                newText += add + " ";
            }
        }
        return newText;
    }

    private static String[] sortByWordLenght(String[] saveWords) {
        for (int i = 0; i < saveWords.length; i++) {
            for (int y = 0; y < saveWords.length; y++) {
                if ((saveWords[i].length() > saveWords[y].length())) {
                    String replace = saveWords[i];
                    saveWords[i] = saveWords[y];
                    saveWords[y] = replace;
                }
            }
        }
        return saveWords;
    }

    static String sortByParagraph(String regex, String text) {
        String newText = "";
        text += "\n";

        int[] countOfSentence = new int[text.length()];
        String[] saveParagraph = new String[text.length()];
        Pattern checkRegex = Pattern.compile(regex);
        Matcher matcher = checkRegex.matcher(text);
        int counter = 0;
        int start = 0;
        int pointCounter = 0;

        initialisation(saveParagraph,text.length());

        while (matcher.find()) {
            saveParagraph[counter] = text.substring(start, matcher.end());
            System.out.println(matcher.group());
            Matcher secondMather = Pattern.compile("\\.").matcher(saveParagraph[counter]);
            while (secondMather.find()) {
                countOfSentence[pointCounter]++;
            }
//            System.out.println("Start index = " + matcher.start());
//            System.out.println("End index = " + matcher.end())
            start = matcher.start();
            counter++;
            pointCounter++;
        }
        sortParagraph(saveParagraph, countOfSentence);

        newText = addText(newText, saveParagraph);
        return newText;

    }

    private static String[] sortParagraph(String[] saveParagraph, int[] countOfSentence) {
        for (int i = 0; i < countOfSentence.length; i++) {
            for (int y = 0; y < countOfSentence.length; y++) {
                if ((countOfSentence[i] > countOfSentence[y])) {
                    int replaceInt = countOfSentence[i];
                    countOfSentence[i] = countOfSentence[y];
                    countOfSentence[y] = replaceInt;

                    String replaceStr = saveParagraph[i];
                    saveParagraph[i] = saveParagraph[y];
                    saveParagraph[y] = replaceStr;
                }
            }
        }
        return saveParagraph;
    }

    static String sortByLex(String regex, String text, char symbol) {
        String newText = "";
        String[] saveSentences = new String[text.length()];
        String[] saveWords = new String[text.length()];
        int[] saveCountOfSymbol = new int[text.length()];
        Pattern checkRegex = Pattern.compile(regex);
        Matcher sentence = checkRegex.matcher(text);
        int maxCountOfSymbols;
        int counter = 0;
        int start = 0;

        initialisation(saveSentences,text.length());
        initialisation(saveWords,text.length());

        while (sentence.find()) {
            int wordCount = 0;
            saveSentences[counter] = text.substring(start, sentence.end());
            Matcher word = Pattern.compile("(?i)(\\w*" + symbol + "+\\w*)").matcher(saveSentences[counter]);

            while (word.find()) {
                int symbolCount = getSymbolCount(word,symbol);
                saveCountOfSymbol[wordCount] = symbolCount;
                saveWords[wordCount] = word.group();
                wordCount++;
            }

            sortWordsLikeSymbols(wordCount,saveCountOfSymbol,saveWords);
            sortCountOFSymbols(wordCount,saveCountOfSymbol);
            maxCountOfSymbols = saveCountOfSymbol[0];
            sortWordByTheNumberOfTokens(maxCountOfSymbols,wordCount,saveWords,saveCountOfSymbol);

            newText+=add(saveWords);
            start = sentence.start();
            counter++;
        }

        return newText;


    }

    private static String add(String[] saveWords) {
        String newText="";
        newText = addText(newText, saveWords);

        newText += "\n";

        return newText;
    }

    private static String[] sortWordByTheNumberOfTokens(int maxCountOfSymbols, int wordCount, String[] saveWords, int[] saveCountOfSymbol) {
        for (int i = 0; i < wordCount; i++) {
            for (int y = 0; y < wordCount; y++) {
                if ((saveWords[i].toLowerCase().charAt(0) > saveWords[y].toLowerCase().charAt(0)) &&
                        saveCountOfSymbol[y] == maxCountOfSymbols && saveCountOfSymbol[i] == maxCountOfSymbols) {
                    String replaceStr = saveWords[i];
                    saveWords[i] = saveWords[y];
                    saveWords[y] = replaceStr;
                }
            }
            if (saveCountOfSymbol[i] != maxCountOfSymbols) {
                maxCountOfSymbols--;
            }
        }
        return saveWords;
    }

    private static String[] sortWordsLikeSymbols(int wordCount, int[] saveCountOfsymbol, String[] saveWords) {
        for (int i = 0; i < wordCount; i++) {
            for (int y = 0; y < wordCount; y++) {
                if (saveCountOfsymbol[i] > saveCountOfsymbol[y]) {
                    int replaceInt = saveCountOfsymbol[i];
                    saveCountOfsymbol[i] = saveCountOfsymbol[y];
                    saveCountOfsymbol[y] = replaceInt;

                    String replaceStr = saveWords[i];
                    saveWords[i] = saveWords[y];
                    saveWords[y] = replaceStr;
                }
            }
        }
        return saveWords;
    }

    private static int[] sortCountOFSymbols(int wordCount, int[] saveCountOfsymbol) {
        for (int i = 0; i < wordCount; i++) {
            for (int y = 0; y < wordCount; y++) {
                if (saveCountOfsymbol[i] > saveCountOfsymbol[y]) {
                    int replaceInt = saveCountOfsymbol[i];
                    saveCountOfsymbol[i] = saveCountOfsymbol[y];
                    saveCountOfsymbol[y] = replaceInt;
                }
            }
        }
        return saveCountOfsymbol;
    }

    private static int getSymbolCount(Matcher word, char symbol) {
        int symbolCount=0;
        for (int i = 0; i < word.group().length(); i++) {
            if (word.group().charAt(i) == symbol) {
                symbolCount++;
            }
        }
        return symbolCount;
    }
}

