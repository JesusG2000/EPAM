package by.etc.algorithmization.decomposition;
//. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
// если угол между сторонами длиной X и Y— прямой.
//
public class TaskNine {

    public static void main(String[] args) {
        double x;
        double y;
        double z;
        double t;

        x=2.7;
        y=4;
        z=6;
        t=5.8;
        System.out.println(hexagonSqaure(x,y,t,z));

    }

    static double hexagonSqaure(double ...side){
        double square;
        double hypotenuse=Math.pow(Math.pow(side[0],2)+Math.pow(side[1],2),0.5);
        square=triangleSquare(side[0],side[1])+triangleSquare(hypotenuse,side[2],side[3]);

        return square;
    }
    static double triangleSquare(double a,double b){
        return a*b/2;
    }
    static double triangleSquare(double a,double b,double c){
        double p = (a+b+c)/2;
        return Math.pow(p*(p-a)*(p-b)*(p-c),0.5);
    }

}
