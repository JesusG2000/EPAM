package by.etc.algorithmization.decomposition;
// Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
// Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
public class TaskSixteen {

    public static void main(String[] args) {

        System.out.println(oddSum(4));

    }
    static int oddSum(int numbers){
        int sum=0;
        for(int i = (int)(Math.pow(10,numbers-1)); i<(int)(Math.pow(10,numbers));i++){
            if(isOdd(i)){
                sum+=i;
            }
        }
        System.out.println(checkEvenInSum(sum));
        return sum;
    }

    static boolean isOdd(int number){
        for(int i =0 ;i < (number+"").length() ;i++){
            if((int)((number/Math.pow(10,i)%10))%2==0){
                return false;
            }
        }

        return true;
    }
    static int checkEvenInSum(int sum){
        int count =0;
        for(int i =0 ;i < (sum+"").length() ;i++){
            if((int)((sum/Math.pow(10,i)%10))%2==0){
                count++;
            }
        }
        return count;
    }
}
