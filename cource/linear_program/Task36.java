package linear_program;

public class Task36 {
    public static void main(String[] args) {
        int digital=2325;
        double even=1;
        double odd=1;
        for(int i=0;i<(digital+"").length();i++){
            int num=(int)(digital/Math.pow(10,i)%10);
            //System.out.println(num);
            if(num%2==0){
                even*=num;
            }else{
                odd*=num;
            }
        }
        System.out.println(even/odd);
    }
}
