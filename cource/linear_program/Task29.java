package linear_program;

public class Task29 {
    public static void main(String[] args) {
        double a=4;
        double b=5;
        double c=6;
        double toGrad=180/Math.PI;
        double cosa=(a*a+c*c-b*b)/(2*a*c);
        double cosb=(a*a-c*c+b*b)/(2*a*b);
        double cosc=(-a*a+c*c+b*b)/(2*b*c);

        double radA=Math.acos(cosa);
        double radB=Math.acos(cosb);
        double radC=Math.acos(cosc);

        double gradA=radA*toGrad;
        double gradB=radB*toGrad;
        double gradC=radC*toGrad;

        System.out.println(gradA);
        System.out.println(gradB);
        System.out.println(gradC);



    }
}
