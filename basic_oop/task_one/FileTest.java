package by.etc.basic_oop.task_one;
//Создать объект класса Текстовый файл, используя классы Файл, Директория.
// Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
public class FileTest {
    public static void main(String[] args) {

        Directory directory = new Directory("Some directory");
        TextFile textFile =TextFile.create("MyFile","Some text",directory);
        textFile.showContent();
        System.out.println(textFile.getName());

        textFile.add(" more text");
        textFile.showContent();

        textFile.rename("StillMyFile");
        System.out.println(textFile.getName());
        textFile.delete();
        textFile.showContent();
    }
}
