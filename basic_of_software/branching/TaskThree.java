package by.etc.basic_of_software.branching;

public class TaskThree {
    //Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

    public static void main(String[] args) {

        int x1;
        int y1;
        int x2;
        int y2;
        int x3;
        int y3;

        x1 = 1;
        y1 = 1;
        x2 = 2;
        y2 = 2;
        x3 = 3;
        y3 = 3;

        if((Math.abs(y2)-Math.abs(y1))/(Math.abs(x2)-Math.abs(x1))==(Math.abs(y3)-Math.abs(y2))/(Math.abs(x3)-Math.abs(x2))){
            System.out.println("These points are on one line");
        }else{
            System.out.println("These points aren't on one line");
        }

    }
}
