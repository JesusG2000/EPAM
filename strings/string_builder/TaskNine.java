package by.etc.strings.string_builder;
// Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
// Учитывать только английские буквы
public class TaskNine {

    public static void main(String[] args) {

        String builder = "Glad to see you my little brother . How are you?";
        String []divide=builder.split("");
        int countUpper=0;
        int countLower=0;
        for(int i = 0  ; i<divide.length;i++){
            if(Character.isUpperCase(divide[i].charAt(0))) {
                countUpper++;
            }else if (Character.isLowerCase(divide[i].charAt(0))){
                countLower++;
            }
        }
        System.out.println("countLower = " + countLower);
        System.out.println("countUpper = " + countUpper);
    }
}
