package by.etc.strings.string_builder;
// Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
public class TaskOne {

    public static void main(String[] args) {


        StringBuilder builder = new StringBuilder("Oo   hi Mark , glad       to see   you");
        int counter=0;
        int maxSpaces=0;
        int[] spaceCountMas = new int[builder.length()];
        for(int i = 0 ; i < builder.length() ; i++){
            if(builder.charAt(i)==' '){
                spaceCountMas[counter]++;
            }else{
                maxSpaces=Math.max(maxSpaces,spaceCountMas[counter]);
                counter++;
            }
        }
        System.out.println(maxSpaces);

    }
}
