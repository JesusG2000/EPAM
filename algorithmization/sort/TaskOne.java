package by.etc.algorithmization.sort;

import java.util.Arrays;

// Заданы два одномерных массива с различным количеством элементов и натуральное число k.
// Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
// при этом не используя дополнительный массив
public class TaskOne {


    public static void main(String[] args) {

         int[] masOne;
         int[] masTwo;
         int[] unionMas;
         int k;

        masOne = new int[]{1,2,3,4,5};
        masTwo = new int[]{10,11,12,13,14,15,16,17,18};
        k=0;

        if(k>=0 &&k<masOne.length-1){
            unionMas= new int[masOne.length+masTwo.length];
            for(int i = 0 ,y=0,z=0;i< unionMas.length ;i++){
                if(i>k&&i<=k+masTwo.length){
                    unionMas[i]=masTwo[y];
                    y++;
                }else{
                    unionMas[i]=masOne[z];
                    z++;
                }
                System.out.println(unionMas[i]+" ");
            }
        }else{
            System.out.println("You can't do that");
        }


    }
}
