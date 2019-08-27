package by.etc.basic_of_software.cycle;

import java.util.Scanner;

public class TaskTwo {
    //Вычислить значения функции на отрезке [а,b] c шагом h:

    public static void main(String[] args) {

        int from;
        int to;
        double step;
        double sum;

        sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write from:");
        from=scanner.nextInt();
        System.out.println("Write to:");
        to=scanner.nextInt();
        System.out.println("Write step:");
        step=scanner.nextDouble();

        for(double i= from ; i<=to ; i+=step){
            if(i>2){
                sum+=i;
            }else{
                sum-=i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
