package cycle;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        for(int i=n;i<=m;i++){
            System.out.print(i+" ");
            for(int y=2;y<n;y++){
                if(i%y==0){
                    System.out.print(y+" ");
                }
            }
            System.out.println();
        }
    }
}
