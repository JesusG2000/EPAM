package by.etc.strings.string_builder;
// С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
public class TaskFour {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("informatics");
        System.out.println(builder.substring(7,8)+builder.substring(3,5)+builder.substring(7,8));
    }
}
