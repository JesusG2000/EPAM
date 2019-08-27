package by.etc.algorithmization.array;
// В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
// Если таких чисел несколько, то определить наименьшее из них.
public class TaskNine {


    public static void main(String[] args) {

        int[] mas;
        int[] countMas;
        int mostCommon;
        int maxInCount;
        boolean haveSame;

        mas = new int[10];
        countMas = new int[10];
        haveSame = false;
        mostCommon = 0;

        for (int i = 0; i < mas.length; i++) {
            countMas[i] = 0;
            mas[i] = (int) (Math.random() * 9 + 1);
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < mas.length; i++) {
            for (int y = i + 1; y < mas.length; y++) {
                if (mas[i] == mas[y]) {
                    countMas[i]++;
                    haveSame = true;
                }
            }
        }

        if (haveSame) {
             maxInCount = countMas[0];

            for (int i = 0; i < countMas.length; i++) {
                maxInCount = Math.max(maxInCount, countMas[i]);
            }

            for (int i = 0; i < countMas.length; i++) {
                if (countMas[i] == maxInCount) {
                    mostCommon = mas[i];
                    break;
                }
            }

            for (int i = 0; i < countMas.length; i++) {
                if (countMas[i] == maxInCount && mostCommon > mas[i]) {
                    mostCommon = mas[i];
                }
            }
            System.out.println(mostCommon);
        } else {
            System.out.println("There are no same elements");
        }
    }
}
