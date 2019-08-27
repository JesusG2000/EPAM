package by.etc.strings.symbols_string;
//В строке найти количество чисел.
public class TaskFour {

    public static void main(String[] args) {
        boolean check;
        String mas = "8 800 55 35 35 it is more easy 22";
        int counter=0;
        String[] divide = mas.split(" ");
        for(String s : divide){
            String[] anotherDivide = s.split("");
            check=true;
            for (String value : anotherDivide) {
                if (!Character.isDigit(value.charAt(0))) {
                    check = false;
                    break;
                }

            }
            if(check){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
