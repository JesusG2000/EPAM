package by.etc.algorithmization.decomposition;
//Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр
public class TaskEleven {

    public static void main(String[] args) {

        System.out.println(whereMore(1050,45637));
    }
    static int whereMore(int one , int two) {
        return (one + "").length() == (two + "").length() ? 0 : (one + "").length() > (two + "").length() ? one : two;
    }
}
