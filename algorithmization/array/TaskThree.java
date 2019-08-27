package by.etc.algorithmization.array;

// Дан массив действительных чисел, размерность которого N. Подсчитать,
// сколько в нем отрицательных, положительных и нулевых элементов
public class TaskThree {

    public static void main(String[] args) {

        int countOfMinus;
        int countOfZero;
        int countOfPlus;
        int[] mas;


        mas = new int[10];
        countOfMinus=0;
        countOfPlus=0;
        countOfZero=0;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10 - 5);
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            if (mas[i]>0){
                countOfPlus++;
            }else if(mas[i]==0){
                countOfZero++;
            }else{
                countOfMinus++;
            }
        }

        System.out.println("countOfMinus = " + countOfMinus);
        System.out.println("countOfPlus = " + countOfPlus);
        System.out.println("countOfZero = " + countOfZero);

    }
}
