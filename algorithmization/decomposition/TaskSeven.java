package by.etc.algorithmization.decomposition;
//. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
public class TaskSeven {

    public static void main(String[] args) {

        System.out.println(factorialSum());
    }
    static long factorialSum(){
        int sum=0;
        for(int i =1 ; i <=9 ; i++){
            if(i%2==1){
                sum+=factorial(i);
            }
        }
        return sum;
    }
    static int factorial(int number){
        int factorial=1;
        for(int i = 1 ; i <=number ;i++){
            factorial*=i;
        }
        return factorial;
    }
}
