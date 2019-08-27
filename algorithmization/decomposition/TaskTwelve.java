package by.etc.algorithmization.decomposition;

import java.util.Scanner;

//Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
// элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
//
public class TaskTwelve {

    public static void main(String[] args) {

        int mas[];
        int k;
        int n;

        k=15;
        n=3;
        System.out.println("Write array's size");
        mas=new int[new Scanner(System.in).nextInt()];
        if(n*mas.length>=k) {
            makeMas(k, n, mas);
            for (int i = 0; i < mas.length; i++) {
                System.out.print(mas[i] + " ");
            }
        }else{
            System.out.println("Something is wrong");
        }


    }

    static int [] makeMas(int sum , int limit , int[] mas){
          int sumInMas=0;
          int i=-1;
          boolean stop=false;
          while(!stop){
              i++;
              mas[i]=(int)(Math.random()*(limit+1));
              sumInMas+=mas[i];
              if(mas.length-1==i ){
                  if( sumInMas==sum) {
                      stop = true;
                  }else{
                      i=-1;
                      sumInMas=0;
                  }
              }

          }


        return mas;
    }
}
