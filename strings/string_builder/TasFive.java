package by.etc.strings.string_builder;
// Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
public class TasFive {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Glad to see you my little brother , how are you?");
        int counter=0;
        for(int i = 0 ;  i < builder.length() ; i++){
            if(builder.charAt(i)=='a'){
                counter++;
            }
        }
        System.out.println(counter);

    }
}
