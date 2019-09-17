package cycle;

public class Task18 {
    public static void main(String[] args) {
        double dig=-0.7;
        for(int i=2;i<100;i++){
            double result=Math.pow(-1,i-1)/i;
            if(Math.abs(result)>=dig){
                System.out.println(result);
            }
        }
    }
}
