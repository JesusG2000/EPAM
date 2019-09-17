package linear_program;

public class Task27 {
    public static void main(String[] args) {
        int a=2;
        int save=a*=a;
        a*=a;
        a*=a;
        System.out.println(a);
        a*=save;
        System.out.println(a);
    }
}
