package cycle;

public class Task29 {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        String strNumOne;
        String strNumTwo;


        firstNumber = 12489;
        secondNumber = 789312114;
        strNumOne = firstNumber + "";
        strNumTwo = secondNumber + "";


        for (int i = 0; i < strNumOne.length(); i++) {
            int one = (int) ((firstNumber/Math.pow(10,i)%10));
            for(int y = 0 ; y < strNumTwo.length();y++){
                int two=(int) ((secondNumber/Math.pow(10,y)%10));
                if(one==two){
                    System.out.println(one);
                }
            }

        }
    }
}
