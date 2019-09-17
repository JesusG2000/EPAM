package linear_program;

public class Task13 {
    public static void main(String[] args) {
        double x1=10;
        double x2=24;
        double x3=31;
        double y1=4;
        double y2=5;
        double y3=6;

        double firstSide=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        double secondSide=Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1,2));
        double thirdSide=Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2));

        double p=(firstSide+secondSide+thirdSide)/2;
        System.out.println(p*2);
        System.out.println(Math.sqrt(p*(p-firstSide)*(p-secondSide)*(p-thirdSide)));
    }
}
