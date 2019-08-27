package by.etc.algorithmization.decomposition;

import java.util.Scanner;

//. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6]. Пояснение.
// Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m.
public class TaskEight {

    public static void main(String[] args) {

        int mas[];
        int k;
        int m;


        mas=new int[10];

        for(int i = 0 ; i < mas.length; i++){
            mas[i]=(int)(Math.random()*90+10);
            System.out.print(mas[i]+" ");
        }

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write k");
        k=scanner.nextInt();
        System.out.println("Write m");
        m=scanner.nextInt();



        if(Math.abs(k-m)==3 && k>=0 && m>=0) {
            System.out.println(sum(k, m, mas));
        }else{
            System.out.println("Size between k and m  must be 3 , k>=0 , m>=0");
        }
    }

    static int sum(int k , int m , int[] mas){
        int sum=0;
        if(k>m){
            int swap=k;
            k=m;
            m=swap;
        }
        for(int i = k ; i<m;i++){
            sum+=mas[i];
        }
        return sum;
    }
}
