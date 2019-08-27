package by.etc.programming_with_class.class_object.task_seven;
// Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
// вычисления площади, периметра и точки пересечения медиан.


import java.util.Arrays;

public class Triangle {
    double length;
    double height;
    double width;
    static double []medianPoint;

    public Triangle(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    static Triangle createObject(double x , double y, double x1, double y1, double x2, double y2){
        double length=Math.sqrt(Math.pow(x1-x,2)+Math.pow(y1-y,2));
        double height=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        double width=Math.sqrt(Math.pow(x2-x,2)+Math.pow(y2-y,2));
        medianPoint=new double[]{(x+x1+x2)/3,(y+y1+y2)/3};
        return new Triangle(length,height,width);

    }
    double getSquare(){
        double perimeter=getPerimeter();
        perimeter/=2;
        return Math.sqrt(perimeter*(perimeter-length)*(perimeter-height)*(perimeter-width));
    }
    double getPerimeter(){
        return length+height+width;
    }
    double[] getMedianPoint() {
        return medianPoint;
    }
    public static void main(String[] args) {
        Triangle triangle=createObject(1,2,1,4,5,6);
        System.out.println(Arrays.toString(triangle.getMedianPoint()));
        System.out.println(triangle.getSquare());
        System.out.println(triangle.getPerimeter());
    }
}
