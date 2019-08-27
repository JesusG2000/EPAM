package by.etc.strings.string_builder;
// Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
// Случай, когда самых длинных слов может быть несколько, не обрабатывать
public class TaskEight {

    public static void main(String[] args) {

        String builder = "Glad to see you my little brother , how are you?";
        String[]divide=builder.split("[ ]");
        String max=divide[0];
        for(int i = 0  ; i < divide.length ; i++){
            if(max.length()<divide[i].length()){
                max=divide[i];
            }
        }
        System.out.println(max);


    }
}
