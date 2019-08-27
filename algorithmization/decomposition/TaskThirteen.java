package by.etc.algorithmization.decomposition;

import java.util.Scanner;

// Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). Найти
// и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
// Для решения задачи использовать декомпозицию.
public class TaskThirteen {

    public static void main(String[] args) {

        int n;

        System.out.println("Write digital");
        n=new Scanner(System.in).nextInt();
        findTwins(n,2*n);

    }

    static void findTwins(int from, int to) {
        int first = 0;
        int second = 0;
        int counter = 0;
        boolean primeNumber;
        for (int i = from; i <= to; i++) {
            primeNumber = true;
            for (int y = 2; y < i; y++) {
                if (i % y == 0) {
                    primeNumber = false;
                    break;
                }
            }
            if (primeNumber) {
                counter++;
                if (counter == 1) {
                    first = i;
                } else {
                    second = i;
                    if (first + 2 == second) {
                        System.out.println(first + " " + second);
                    }
                    counter = 0;
                }
            }
        }
    }
}
