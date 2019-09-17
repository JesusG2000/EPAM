package cycle;

public class Task37 {
    public static void main(String[] args) {
        for(int i=10;i<100;i++){
            for(int y=10;y<100;y++){
                int first=(i*100+y);
                int second=(y*100+i);
                if(first%99==0&&second%49==0){
                    System.out.println(i+"  "+y);
                }
            }
        }
    }
}
