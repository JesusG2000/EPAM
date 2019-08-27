package by.etc.algorithmization.decomposition;
// Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
public class TaskThree {

    public static void main(String[] args) {

        System.out.println(hexagonSquare(triangleSquare(6)));

    }

    static double triangleSquare (int a){
        return Math.pow(a,2)*Math.pow(3,0.5)/4;
    }
    static double hexagonSquare(double triagleSquare){
        return triagleSquare*6;
    }

}
