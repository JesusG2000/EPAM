package by.etc.algorithmization.array;
// Даны действительные числа a1,a2,a3  Найти
public class TaskSeven {

    public static void main(String[] args) {

        int[] mas;
        int[] secondMas;

        mas = new int[10];
        secondMas = new int[Math.round(mas.length)];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 9 + 1);
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        for (int i = 0, y = mas.length - 1; i <= y; i++, y--) {
            secondMas[i] = mas[i] + mas[y];
        }
        System.out.println(getMax(secondMas));
    }


  private   static int getMax(int[] mas) {

        int max;

        max = mas[0];

        for (int i = 0; i < mas.length; i++) {
            max = Math.max(max, mas[i]);
        }
        return max;
    }
}
