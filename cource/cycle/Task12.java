package cycle;

public class Task12 {
    public static void main(String[] args) {
        int mul=1;
        int prev=1;

        for(int i=0; i<10;i++){
            mul*=6+prev;
            prev=mul;
        }
    }
}
