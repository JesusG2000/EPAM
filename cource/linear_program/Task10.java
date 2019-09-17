package linear_program;

public class Task10 {
    public static void main(String[] args) {
        double x=30;
        double y=30;
        double toGrad=180*Math.PI;

        System.out.println((Math.sin(x/toGrad)+Math.cos(y/toGrad))/((-Math.sin(x/toGrad)+Math.cos(y/toGrad)))*Math.tan(x*y/toGrad));

    }
}
