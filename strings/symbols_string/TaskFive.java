package by.etc.strings.symbols_string;
// Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов
// заменить на одиночные пробелы. Крайние пробелы в строке удалить.
public class TaskFive {

    public static void main(String[] args) {

        String mas = "   Hi    my dear   friend   =)";
        mas=mas.trim();
        String []divide = mas.split("");
        boolean addSpace=false;
        mas="";
        for (String s:divide) {
            if(!Character.isSpaceChar(s.charAt(0))){
                mas+=s;
                addSpace=true;
            }else{
                if(addSpace){
                    mas+=" ";
                    addSpace=false;
                }
            }
        }
        System.out.println(mas);

    }
}
