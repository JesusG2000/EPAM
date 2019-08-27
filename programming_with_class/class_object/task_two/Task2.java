package by.etc.programming_with_class.class_object.task_two;
// Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
// Добавьте конструктор, инициализирующий члены класса по умолчанию.
// Добавьте set- и get- методы для полей экземпляра класса.
public class Task2 {
    int age;
    String name;

    public Task2() {
        this.age=10;
        this.name="Ivan";
    }

    public Task2(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Task2 one=new Task2(18,"Vova");
        Task2 two=new Task2();
    }

}
