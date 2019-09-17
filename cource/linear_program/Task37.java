package linear_program;

public class Task37 {
    public static void main(String[] args) {
        int num=332;
        int digital=1230;
        System.out.println(num%2==0);
        System.out.println((int)(digital/Math.pow(10,3)%10)+(int)(digital/Math.pow(10,2)%10)
                ==(int)(digital/Math.pow(10,1)%10)+(int)(digital/Math.pow(10,0)%10));
        System.out.println(((int)(num/Math.pow(10,0)%10)+(int)(num/Math.pow(10,1)%10)
                +(int)(num/Math.pow(10,2)%10))%2==0);

        int x=2;
        int y=2;
        int m=1;
        int n=1;
        System.out.println(m<=x&&n<=y);

        int three=123;
        System.out.println(three*three
                ==Math.pow((int)(three/Math.pow(10,0)%10)+(int)(three/Math.pow(10,1)%10)
                +(int)(three/Math.pow(10,2)%10),3));

        int a=2;
        int b=2;
        int c=3;
        System.out.println(a==b||a==c||b==c);

        int four=123;
        int firstNum=(int)(four/Math.pow(10,0)%10);
        int secondNum=(int)(four/Math.pow(10,1)%10);
        int thirdNum=(int)(four/Math.pow(10,2)%10);

        System.out.println(firstNum+secondNum==thirdNum||firstNum+thirdNum==secondNum||secondNum+thirdNum==firstNum);

        int five=124;
        int fiveDig=5;
        System.out.println(Math.pow(fiveDig,0)==five||Math.pow(fiveDig,1)==five||Math.pow(fiveDig,2)==five
                ||Math.pow(fiveDig,3)==five||Math.pow(fiveDig,4)==five);

        int a1=1;
        int b1=-4;
        int c1=3;
        int m1=2;
        int n1=-1;

        System.out.println(n1==a1*m1*m1+b1*m1+c1);
    }
}
