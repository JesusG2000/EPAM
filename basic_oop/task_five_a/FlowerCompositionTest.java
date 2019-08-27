package by.etc.basic_oop.task_five_a;
//Задача 5. Создать консольное приложение, удовлетворяющее следующим требованиям:
// • Корректно спроектируйте и реализуйте предметную область задачи.
// • Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов проектирования.
// • Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
// • для проверки корректности переданных данных можно применить регулярные выражения.
// • Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
// • Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
//
//
//Вариант A. Цветочная композиция. Реализовать приложение,
// позволяющее создавать цветочные композиции
// (объект, представляющий собой цветочную композицию).
// Составляющими цветочной композиции являются цветы и упаковка.


import by.etc.basic_oop.task_five_a.flower_compositon.FlowerComposition;


public class FlowerCompositionTest {
    public static void main(String[] args) {
        try {
            FlowerComposition flowerComposition = new FlowerComposition();
            flowerComposition.addFlowers(6, "rose");
            flowerComposition.addFlowers(6, "dandelion");
            flowerComposition.addFlowers(6, "rose");
            flowerComposition.addBox("OvAl");
            System.out.println(flowerComposition);
        }catch (IllegalArgumentException e){
            System.out.println("Wrong sweet name ");
        }
    }
}
