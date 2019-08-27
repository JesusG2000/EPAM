package by.etc.algorithmization.sort;

import java.util.Arrays;
import java.util.Scanner;

// Сортировка вставками.
// Дана последовательность чисел
// . Требуется переставить числа в порядке возрастания. Делается это следующим образом. Пусть
// - упорядоченная последовательность, т. е. . Берется следующее число  и вставляется в последовательность так,
// чтобы новая последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1
// до n не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить с
// помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
public class TaskFive {

    public static void main(String[] args) {

        int[] mas;


        mas = new int[]{1, 34, 2456, 12, 22, 5, 7, 4, 88, -1,88};

        for(int i = 0 ;  i< mas.length-1 ; i++){
            if(mas[i]>mas[i+1]){
                int index =binarySearch(mas,i+1);
                insert(mas,index,mas[i+1],i+1);

            }
        }
        System.out.println(Arrays.toString(mas));



    }

    static int[] insert(int []mas, int index,int number , int numberIndex) {
        for (int i = numberIndex; i > index; i--) {
            mas[i] = mas[i - 1];
        }
        mas[index] = number;
        return mas;
    }

    static int binarySearch(int[] mas, int index) {
        int left = 0;
        int right = index;
        int middle;
        int key = 0;
        while (right != -1 && left != -1) {
            middle = (left + right) / 2;
            if (middle == mas.length - 1) {
                return middle;
            }
            if (mas[middle] <= mas[index] && mas[middle + 1] >= mas[index]) {
                key = middle+1;
                break;
            } else {
                if (mas[middle] >= mas[index]) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }

            }


        }
        return key;
    }
}

