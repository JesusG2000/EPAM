package by.etc.strings.string_builder;
// Проверить, является ли заданное слово палиндромом.
public class TaskThree {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Level");
       if(builder.toString().toLowerCase().equals(builder.reverse().toString().toLowerCase())){
           System.out.println("palindrome");
       }else{
           System.out.println("no");
        }

    }
}
