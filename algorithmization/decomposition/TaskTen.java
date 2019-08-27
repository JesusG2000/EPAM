package by.etc.algorithmization.decomposition;
//Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N
public class TaskTen {

    public static void main(String[] args) {

        int n =123456;
        createMas(n);
    }

    static int [] createMas(int number){
        int mas[]=new int [10];
        int []dividedNumber=new int[(number+"").length()];
        for(int i = 0 ; i < dividedNumber.length ; i++){
            dividedNumber[i]=(int)(number/Math.pow(10,i)%10);
        }
        for(int i = 0 ;  i <mas.length ; i++){
            mas[i]=dividedNumber[(int)(Math.random()*dividedNumber.length)];
            System.out.print(mas[i]+" ");
        }
        return mas;
    }

}
