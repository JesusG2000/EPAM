package linear_program;

public class Task28 {
    public static void main(String[] args) {
        double toSec=3600*180/Math.PI;
        double toMin=toSec/60;
        double toGrad=180/Math.PI;
        double rad=1;
        System.out.println(rad*toSec);
        System.out.println(rad*toMin);
        System.out.println(rad*toGrad);
    }
}
