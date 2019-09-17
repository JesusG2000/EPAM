package cycle;

public class Task36 {
    public static void main(String[] args) {
        for(int i=10;i<100;i++){
            for(int y=10;y<100;y++){
                if((i*100+y)%(i*y)==0){
                    System.out.println(i+"  "+y);
                }
            }
        }
    }
}
