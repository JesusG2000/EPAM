package cycle;


public class Task40 {
    public static void main(String[] args) {
        int n=10000;
        int mas[];
        for(int i=1 ; i<n;i++){
            boolean isDivided=true;
           mas=new int[(i+"").length()];
            for(int y=0;y<mas.length;y++){
                mas[y]=(int)(i/Math.pow(10,y)%10);
            }

            for(int y=0;y<mas.length;y++) {
                if (mas[y] != 0) {
                    if (i % mas[y] != 0) {
                        isDivided = false;
                        break;
                    }
                }else {
                    isDivided = false;
                }

            }
            if(isDivided){
                System.out.println(i);
            }
        }
    }
}
