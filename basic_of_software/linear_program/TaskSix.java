package by.etc.basic_of_software.linear_program;

import java.util.Scanner;

public class TaskSix {
    //Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
    //принадлежит закрашенной области, и false — в противном случае:
    public static void main(String[] args) {
        int x;
        int y;

        boolean[][] check = {
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, true , true , true , true , false, false, false, false, false, false},
                {false, false, false, false, true , true , true , true , false, false, false, false, false, false},
                {false, false, false, false, true , true , true , true , false, false, false, false, false, false},
                {false, false, false, false, true , true , true , true , false, false, false, false, false, false},
                {false, false, true , true , true , true , true , true , true , true , false, false, false, false},
                {false, false, true , true , true , true , true , true , true , true , false, false, false, false},
                {false, false, true , true , true , true , true , true , true , true , false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false}};


        Scanner scanner = new Scanner(System.in);
        System.out.println("Write x: ");
        x=scanner.nextInt();
        System.out.println("Write y: ");
        y=scanner.nextInt();
        System.out.println(check[6-y][5+x]);



    }
}
