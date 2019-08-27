package by.etc.strings.string_builder;
// Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
// восклицательным или вопросительным знаком. Определить количество предложений в строке X.
public class TaskTen {

    public static void main(String[] args) {

        String text="Hi Mark.\nHi Liza.\nHow old are you?\nI won't say it for you!";
        int countOfSentence=0;
        String []divide=text.split("");
        for(String s:divide){
            if(s.equals(".")||s.equals("?")||s.equals("!")){
                countOfSentence++;
            }
        }
        System.out.println("countOfSentence = " + countOfSentence);
    }
}
