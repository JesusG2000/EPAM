package by.etc.algorithmization.decomposition;

import java.util.Scanner;

// Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел:
public class TaskOne {

    public static void main(String[] args) {

        int firstNumber;
        int secondNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write first number");
        firstNumber=scanner.nextInt();
        System.out.println("Write second number");
        secondNumber=scanner.nextInt();
        System.out.println(nok(firstNumber,secondNumber));



    }
    static int nod(int one, int two){
        int number=0;
        for(int i = 1 ;  i<= one ; i++){
            if(one%i==0 && two%i==0){
                number=i;
            }
        }
        return number;
    }
    static int nok(int one , int two){
        return one*two/nod(one,two);
    }
}
