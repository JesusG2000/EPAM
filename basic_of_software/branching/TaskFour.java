package by.etc.basic_of_software.branching;

public class TaskFour {
    // Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
    // Определить, пройдет ли кирпич через отверстие.

    public static void main(String[] args) {

        int height;
        int width;
        int x;
        int y;
        int z;

        height=30;
        width=10;
        x=15;
        y=20;
        z=100;


        if(height>=y && width>=x || height>=x && width>=y){
            System.out.println("Will pass");
        }else{
            System.out.println("Won't pass");
        }
    }
}
