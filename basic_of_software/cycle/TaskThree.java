package by.etc.basic_of_software.cycle;

public class TaskThree {
    //. Найти сумму квадратов первых ста чисел.

    public static void main(String[] args) {

        int sum;
        
        sum=0;
        for(int i=0; i <= 100 ;  i++){
            sum+=Math.pow(i,2);
        }
        System.out.println("sum = " + sum);
    }
}
