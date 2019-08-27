package by.etc.strings.string_builder;
// Из заданной строки получить новую, повторив каждый символ дважды.
public class TaskSix {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Glad to see you");
        int size = builder.length();
        int counter = 0;

        for (int i = 0; i < size; i++) {
            counter++;
            builder.insert(i + counter, builder.charAt(i + counter - 1));
        }
        System.out.println(builder);
    }
}