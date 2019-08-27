package by.etc.basic_of_software.cycle;

public class TaskFour {
    //. Составить программу нахождения произведения квадратов первых двухсот чисел.

    public static void main(String[] args) {

        long  multiply;
        
        multiply=1;
        for(int i=1 ;i<=200;i++){
            multiply*=Math.pow(i,2);
        }
        System.out.println("multiply = " + multiply);
    }
}
