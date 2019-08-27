package by.etc.programming_with_class.class_object.task_one;
//Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы
// изменения этих переменных. Добавьте метод, который находит сумму значений этих переменных,
// и метод, который находит наибольшее значение из этих двух переменных.
//
public class Test1 {
    int firstValue;
    int secondValue;

    public Test1(int firstValue, int secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    @Override
    public String toString() {
        return "Test1{" +
                "firstValue=" + firstValue +
                ", secondValue=" + secondValue +
                '}';
    }
    public void changeValues(int firstValue , int secondValue){
        this.firstValue=firstValue;
        this.secondValue=secondValue;
    }
    public int findSum(){
        return firstValue+secondValue;
    }
    public int findMax(){
        return firstValue>secondValue ? firstValue:secondValue;
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1(1,4);
        test1.changeValues(4,7);
        System.out.println(test1.toString());
        System.out.println(test1.findMax());
        System.out.println(test1.findSum());
    }

}
