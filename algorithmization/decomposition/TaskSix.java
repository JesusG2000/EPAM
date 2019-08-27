package by.etc.algorithmization.decomposition;
// Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
public class TaskSix {

    public static void main(String[] args) {
        System.out.println(checkPrime(16,4,6));
    }

    static boolean checkPrime(int ...number){
        int count;
        for(int i=2 ; i <= number[0];i++){
            count=0;
            for(int y = 0 ;  y <number.length;y++){
                if(number[y]%i==0){
                    count++;
                }
            }
            if(count==number.length){
                return true;
            }
        }
        return false;
    }
}
