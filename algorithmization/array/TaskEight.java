package by.etc.algorithmization.array;
// Дана последовательность целых чисел n a1,a2,aN . Образовать новую последовательность,
// выбросив из исходной те члены, которые равны min( a1,a2,aN) .
public class TaskEight {

    public static void main(String[] args) {

        int[] mas;
        int[] anotherMas;
        int min;

        mas = new int[10];
        anotherMas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 9 + 1);
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        min = mas[0];

        for (int i = 0; i < mas.length; i++) {
            min = Math.min(min, mas[i]);
        }
        for (int i = 0, y = 0; i < mas.length; i++) {
            if (mas[i] != min) {
                anotherMas[y] = mas[i];
                System.out.print(anotherMas[y] + " ");
                y++;
            }
        }
    }
}
