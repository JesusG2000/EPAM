package cycle;

public class Task39 {
    public static void main(String[] args) {
        int mas[]=new int[3];
        for(int i=100;i<1000;i++){
            int max=0;
            int newDig=0;
            int toPow=0;
            for(int y= 0 ;y <3;y++){
                mas[y]=(int)(i/Math.pow(10,y)%10);
                max=Math.max((int)(i/Math.pow(10,y)%10),max);
            }
            for(int z=0 ;z<mas.length;z++){
                if(mas[z]!=max){
                   newDig+=mas[z]*Math.pow(10,toPow) ;
                   toPow++;

                }

            }
           // System.out.println(newDig+"  "+i);
            if(newDig*7==i){
                System.out.println(i);
            }
        }
    }
}
