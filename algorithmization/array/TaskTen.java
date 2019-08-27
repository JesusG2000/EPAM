package by.etc.algorithmization.array;
//Дан целочисленный массив с количеством элементов п. Сжать массив,
// выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
// Примечание. Дополнительный массив не использовать.
public class TaskTen {

    public static void main(String[] args) {

        int[] mas;

        mas = new int[10];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 9 + 1);
            System.out.print(mas[i] + " ");
        }
        System.out.println();


        for (int i = 0; i < mas.length; i++){
            if(i%2==0){
                mas[i]=0;
            }
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
