package cycle;

public class Task33 {
    public static void main(String[] args) {
        int num=12354;
        int max=0;
        for(int i=0; i < (num+"").length();i++){
            max=Math.max(max,(int)(num/Math.pow(10,i)%10));
        }
        System.out.println(max);
    }
}
