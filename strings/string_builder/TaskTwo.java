package by.etc.strings.string_builder;
//В строке вставить после каждого символа 'Test' символ 'b'.
public class TaskTwo {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Glad to see you my little brother , how are you?");
        for(int i = 0 ; i< builder.length() ; i++){
            if(builder.charAt(i)=='a'){
                builder.insert(i+1,"b");
            }
        }
        System.out.println(builder.toString());
    }
}
