package by.etc.algorithmization.decomposition;
// Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
public class TaskTwo {

    public static void main(String[] args) {

        int firstNumber=7;
        int secondNumber=9;
        int thirdNumber=7;
        int fourthNumber=36;
        System.out.println(nod(firstNumber,secondNumber,thirdNumber,fourthNumber));
    }

    static int nod(int ...one){
        int number=0;
       for(int i = 1 ; i < one[0];i++){
           for(int y = 0 ; y < one.length ; y++) {
               if (one[y]%i==0){
                   number=i;
               }else {
                   break;
               }
           }
       }
        return number;

    }
}
