package by.etc.strings.string_builder;
// Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
// Например, если было введено "abc cde def", то должно быть выведено "abcdef".
public class TaskSeven {

    public static void main(String[] args) {

        String builder = "abc cde def";
        builder=builder.replace(" ","");
        String[]divide=builder.split("");
        builder="";
        for(int i = 0  ; i < divide.length ; i++){
            int counter=0;
            for(int y=0; y<divide.length ; y++){
                if(divide[i].equals(divide[y])){
                    counter++;
                    if(counter>1){
                        divide[y]="";
                    }
                }
            }
            builder+=divide[i];
        }
        System.out.println(builder);
    }
}
