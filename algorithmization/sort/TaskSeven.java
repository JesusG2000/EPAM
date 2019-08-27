package by.etc.algorithmization.sort;
// Пусть даны две неубывающие последовательности действительных чисел
//Требуется указать те места, на которые нужно вставлять элементы последовательности
// в первую последовательность так, чтобы новая последовательность оставалась возрастающей.
public class TaskSeven {

    public static void main(String[] args) {
        int[] masOne;
        int[] masTwo;
        int count = 0;
        int size;


        masOne = new int[]{1, 1, 3, 4, 7, 9, 17, 19, 22, 55};
        masTwo = new int[]{-1,0,1,2,5,8,11,23,50,90};
        size = masOne.length;

        for (int i = 0; i < masTwo.length; i++) {
            for (int y = 0; y < masOne.length - 1; y++) {
                if (masTwo[i] < masOne[y]) {
                    System.out.println("index = " + y + " number = " + masTwo[i]);
                    count++;
                    break;
                }
                if (masTwo[i] > masOne[y] && masTwo[i] <= masOne[y + 1]) {
                    System.out.println("index = " + (y + 1) + " number = " + masTwo[i]);

                    count++;
                    break;
                }
            }
        }
        for (int i = count; i < masTwo.length; i++) {
            System.out.println("index = " + size + " number = " + masTwo[i]);
            size++;
        }
    }
}
