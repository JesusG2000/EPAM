package linear_program;

public class Task21 {
    public static void main(String[] args) {
        double number;
        double wholeNumber;

        number = 941.183;
        wholeNumber = (int) (number);
        number = number * 1000 % 1000 + wholeNumber / 1000;
        System.out.println(number);
    }
}
