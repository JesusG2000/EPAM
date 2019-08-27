package by.etc.algorithmization.decomposition;
//Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
// Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
public class TaskSeventeen {

    public static void main(String[] args) {

        subtraction(12358);
    }
    static int subtraction(int number){
        int count=0;
        while(number>0) {
            int sum = 0;
            for (int i = 0; i < (number + "").length(); i++) {
                sum += (int) ((number / Math.pow(10, i) % 10));
            }
            number -= sum;
            count++;
        }


        return  count;
    }
}
