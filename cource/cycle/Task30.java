package cycle;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        int []arab=new int[]{1,2,3,4,5,6,7,8,9,10};
        String []rim=new String[]{"i","ii","iii","iv","v","vi","vii","viii","ix","x"};
        String symbol="x";
        for(int i=0 ; i < rim.length;i++){
            if(rim[i].equals(symbol)){
                System.out.println(arab[i]);
            }
        }
    }
}
