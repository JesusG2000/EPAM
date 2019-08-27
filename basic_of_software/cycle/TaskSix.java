package by.etc.basic_of_software.cycle;

public class TaskSix {
    // Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

    public static void main(String[] args) {

        for(int i= 0 ; i<1000;i++){
            System.out.println((char)i+"-"+i);
        }
    }
}
