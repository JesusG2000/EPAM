package linear_program;

public class Task16 {
    public static void main(String[] args) {
        int digital=1234;
        int sum=0;
        for(int i=0;i<(digital+"").length();i++){
            sum+=digital/Math.pow(10,i)%10;
        }
        System.out.println(sum);

    }
}
