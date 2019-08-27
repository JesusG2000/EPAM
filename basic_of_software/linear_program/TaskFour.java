package by.etc.basic_of_software.linear_program;

public class TaskFour {
    //. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
    //дробную и целую части числа и вывести полученное значение числа
    public static void main(String[] args) {

        double number;
        double wholeNumber;

        number = 941.183;
        wholeNumber = (int) (number);
        number = number * 1000 % 1000 + wholeNumber / 1000;
        System.out.println(number);


    }
}
