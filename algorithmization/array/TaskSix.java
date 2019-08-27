package by.etc.algorithmization.array;
//Задана последовательность N вещественных чисел. Вычислить сумму чисел,
// порядковые номера которых являются простыми числами.
//
public class TaskSix {

    public static void main(String[] args) {

        int[] mas;
        boolean access;
        int sum;

        sum=0;
        mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 9 + 1);
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        for(int i= 2 ; i< mas.length ; i++){
            access=true;
            for(int y =2 ; y<i;y++){
                if(i%y==0){
                    access=false;
                    break;
                }
            }
            if(access){
               sum+=mas[i];
            }
        }
        System.out.println("sum = " + sum);
    }
}
