package by.etc.algorithmization.sort;
//8.Даны дроби
// Составить программу, которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.
public class TaskEight {

    public static void main(String[] args) {

        double[] mas;
        double multiple;
        boolean stop;
        double denominator;

        denominator = 0;
        stop = false;
        multiple = 1d;
        mas = new double[]{1 / 2d, 5 / 3d, 6 / 7d, 3 / 8d};
        for (double a : mas) {
            multiple *= a;
        }
        while (!stop) {
            denominator++;
            if (((multiple * denominator) * 10) % 10 == 0) {
                boolean found = true;
                for (int i = 0; i < mas.length; i++) {
                    if (((mas[i] * denominator) * 10) % 10 != 0) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    stop = true;
                }
            }


        }

        for (int i = 0; i < mas.length; i++) {
            mas[i] *= denominator;
        }

        for (int i = 0; i < mas.length; i++) {
            for (int y = 0; y < mas.length; y++) {
                if (mas[i] < mas[y]) {
                    double replace = mas[i];
                    mas[i] = mas[y];
                    mas[y] = replace;
                }
            }
        }
        for (double a : mas) {
            System.out.print(a + " ");
        }
        System.out.println("\ndenominator = " + denominator);
    }
}

