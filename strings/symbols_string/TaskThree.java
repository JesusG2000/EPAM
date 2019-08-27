package by.etc.strings.symbols_string;
// В строке найти количество цифр.
public class TaskThree {

    public static void main(String[] args) {

        String mas = "8 800 55 35 35 it is more easy 22";
        int counter=0;
        String[] divide = mas.split("");
        for(String s : divide){
            if(Character.isDigit(s.charAt(0))){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
