package by.etc.strings.symbols_string;

import java.util.Arrays;

//Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
public class TaskOne {

    public static void main(String[] args) {

        String[] camelMas = {"lowCase", "UpperCase", "SomethingElse", "andNothing"};
        String[] snakeMas = new String[camelMas.length];

        for (int i = 0; i < camelMas.length; i++) {
            snakeMas[i] = "";
            String[] divide = camelMas[i].split("");
            for (int y = 0; y < divide.length; y++) {
                if (Character.isUpperCase(divide[y].charAt(0))) {
                    String symbol="";
                    if(y!=0){
                        symbol="_";
                    }
                    divide[y] =symbol+ divide[y].toLowerCase();

                }
                snakeMas[i] += divide[y];
            }

        }
        System.out.println(Arrays.toString(snakeMas));
    }
}

