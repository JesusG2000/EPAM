package cycle;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int dig=scanner.nextInt();
        int sum=0;
        String str="";
        for(int i=0 ; i < (dig+"").length();i++){
            int number=(int)(dig/Math.pow(10,i)%10);
            str+=number;
            if(number%2==0){
                sum+=number;
            }
        }
        int newNum=Integer.valueOf(str);
        System.out.println(newNum);
        System.out.println(sum);
    }
}
