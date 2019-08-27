package by.etc.algorithmization.decomposition;
// Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
// (например, 1234, 5789). Для решения задачи использовать декомпозицию.
public class TaskFifteen {

    public static void main(String[] args) {

        findGrowUpDigitals(10000);
    }
    static int [] findGrowUpDigitals(int number){
        int []mas = new int [number];
        int forMas=0;
        int[] masOfDividedNumber;
        for(int i = 0 ; i <=number; i++){
            int count=0;
            int size = (i+"").length();
         masOfDividedNumber= new int[size];
         for(int y = 0 ; y < size ; y++){
             masOfDividedNumber[count]=(int)(i/Math.pow(10,y)%10);
             count++;
         }
         if(isGrowUp(masOfDividedNumber)){
             mas[forMas]=i;
             forMas++;
             System.out.println(i);
         }

        }

        return mas;
    }

    static boolean isGrowUp(int[] mas){
        for(int i = 0 ;  i <mas.length-1 ; i++){
            if(mas[i]-1!=mas[i+1]){
                return false;
            }
        }
        return true;
    }

}
