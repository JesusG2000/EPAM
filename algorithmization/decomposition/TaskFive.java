package by.etc.algorithmization.decomposition;
//Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
// которое меньше максимального элемента массива, но больше всех других элементов)
public class TaskFive {

    public static void main(String[] args) {

        int[] mas;

        mas=new int[10];

        for(int i = 0 ;  i < mas.length ; i++){
            mas[i]=(int)(Math.random()*90+10);
            System.out.print(mas[i]+" ");
        }
        System.out.println();

        System.out.println(findLowerThenMax(mas));
    }
    static int findLowerThenMax(int []mas){
        int max=mas[0];
        int lowerMax=mas[0];

        for(int i=0 ; i<mas.length;i++ ) {
            max = Math.max(max, mas[i]);
        }
            for(int i = 0 ; i < mas.length ;i++) {
                if (mas[i] != max) {
                    lowerMax = Math.max(lowerMax, mas[i]);
                }
            }

        return lowerMax;
    }
}
