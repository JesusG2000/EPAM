package by.etc.strings.regular_expression;
//Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий тег
// , закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskTwo {
    private static int saveStartTextPosition;

    public static void main(String[] args) {
        String text = getText("D:\\IdeaProjects\\BasicsTasks\\src\\by\\etc\\strings\\regular_expression\\person_data.xml");
        System.out.println(getData(text));


    }

    static String getText(String wayToFile) {
        StringBuilder text = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(wayToFile)));
            while (reader.read() != -1) {
                text.append(reader.readLine()).append("\n");
            }
            reader.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
        return text.toString();
    }

    static String getData(String text) {
        String data="";
        // <\w+\s*(\s*id=".+"|)?\s*>
        // </\w+\s*>
        // >.+</
        // <\w+\s*/>
        Pattern devideText = Pattern.compile("<\\w+\\s*(\\s+id=\".+\"|)?\\s*>");
        Matcher matcher = devideText.matcher(text);

        while (matcher.find()) {
            String openTag = matcher.group().trim();
            String closeTag = findCloseTag(openTag, text);
            String tagContent = findTagContent(openTag, closeTag, text);
            data+=openTag+"-open tag"+"\n(\n"+tagContent+"\n)\n"+closeTag+"-close tag\n_____________________________\n";

        }
       data+=findTagWithOutBody(text);
        return data;
    }

    static String findTagWithOutBody(String text) {
        String tags="";
        Pattern devideText = Pattern.compile("<\\w+\\s*/>");
        Matcher matcher = devideText.matcher(text);

        while (matcher.find()) {
            tags+=matcher.group()+"-tag without body\n";
        }
        return tags;
    }

    static String findTagContent(String openTag, String closeTag, String text) {

        int start = findStart(openTag, text);
        int end = findEnd(closeTag, text, start);
        //System.out.println(start+" "+end);


        return text.substring(start, end);
    }

    static int findStart(String openTag, String text) {
        String word = "";
        int start = 0;
        for (int i = saveStartTextPosition; i < text.length(); i++) {
            if (text.charAt(i) == '<') {
                while (text.charAt(i) != ('>')) {
                    word += text.charAt(i);
                    i++;
                }
                word += ">";
                i++;
            }
            if (word.equals(openTag)) {
               // System.out.print(openTag);
                start = i;
                saveStartTextPosition = i;
                break;
            } else {
                word = "";
            }

        }
        return start;

    }

    static int findEnd(String closeTag, String text, int start) {
        String word = "";
        int end = 0;
        int beginEnd = 0;
        for (int i = start; i < text.length(); i++) {
            if (text.charAt(i) == '/') {
                beginEnd = i - 1;
                word = "<" +word;
                while (text.charAt(i) != ('>')) {
                    word += text.charAt(i);
                    i++;
                }
                word += ">";
               // System.out.println("\nword = "+word+" close tag = "+closeTag+"\n");
            }

            if (word.equals(closeTag)) {
               // System.out.print(closeTag);
                end = beginEnd;
                break;
            } else {
                word = "";
            }

        }
        return end;
    }

    static String findCloseTag(String openTag, String text) {
        Pattern devideText = Pattern.compile("</\\w+\\s*>");
        Matcher matcher = devideText.matcher(text);
        String closeTag = "";

        if (openTag.matches("<\\w+\\s+(|id=\".+\")?>")) {
            openTag = openTag.substring(0, openTag.indexOf(" ")) + ">";
        }
        while (matcher.find()) {
            String fullCloseTag = matcher.group();
            closeTag=fullCloseTag;
            if(fullCloseTag.matches("</\\w+\\s+>")) {
                fullCloseTag = fullCloseTag.substring(0, fullCloseTag.indexOf(" ")) + ">";
            }
            if (fullCloseTag.substring(2, fullCloseTag.length() - 1).equals(openTag.substring(1, openTag.length() - 1))) {
                break;
            }
        }
        return closeTag;
    }

}
