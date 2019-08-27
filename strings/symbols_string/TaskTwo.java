package by.etc.strings.symbols_string;

import java.util.Arrays;

// Замените в строке все вхождения 'word' на 'letter'.
public class TaskTwo {

    public static void main(String[] args) {

        String mas= "Hi man , look , world is insane \nYee , world is insane.";
        mas=mas.replace("world","letter");
        System.out.println(mas);
    }
}
