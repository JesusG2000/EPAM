package by.etc.basic_of_software.branching;

import java.util.Scanner;

public class TaskFive {
    //Вычислить значение функции

    public static void main(String[] args) {

        int x;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write x: ");
        x=scanner.nextInt();

        if(x<=3){
            System.out.println(Math.pow(x,2)-3*x+9);
        }else{
            System.out.println(Math.pow(Math.pow(x,3)+6,-1));
        }
    }
}
