package cycle;

public class Task21 {
    public static void main(String[] args) {
        for(int i=0;i< 100;i++){
            System.out.println(i+"   "+(i-Math.sin(i/180f*Math.PI)));
        }
    }
}
