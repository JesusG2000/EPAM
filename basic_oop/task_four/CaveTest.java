package by.etc.basic_oop.task_four;
//Создать консольное приложение, удовлетворяющее следующим требованиям:
// • Приложение должно быть объектно-, а не процедурно-ориентированным.
// • Каждый класс должен иметь отражающее смысл название и информативный состав.
// • Наследование должно применяться только тогда, когда это имеет смысл.
// • При кодировании должны быть использованы соглашения об оформлении кода java code convention.
// • Классы должны быть грамотно разложены по пакетам.
// • Консольное меню должно быть минимальным.
// • Для хранения данных можно использовать файлы.
//
//Дракон и его сокровища. Создать программу,
// позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона.
// Реализовать возможность просмотра сокровищ,
// выбора самого дорогого по стоимости сокровища и выбора сокровищ на заданную сумму.

import by.etc.basic_oop.task_four.cave.Cave;
import by.etc.basic_oop.task_four.dragon.Dragon;
import by.etc.basic_oop.task_four.treasures.Diamond;
import by.etc.basic_oop.task_four.treasures.Gold;
import by.etc.basic_oop.task_four.treasures.Treasure;

import java.util.Scanner;

public class CaveTest {
    public static void main(String[] args) {
        boolean stop = false;
        Dragon dragon = new Dragon("Ivalo", "Purple");
        Treasure[] treasures = new Treasure[100];
        for (int i = 0; i < treasures.length; i++) {
            if (i > 50) {
                treasures[i] = new Diamond((int) (Math.random() * 100 + 1), (int) (Math.random() * 5 + 1), "D" + i);
            } else {
                treasures[i] = new Gold((int) (Math.random() * 20 + 1), (int) (Math.random() * 25 + 1), "G" + i);
            }
        }
        Cave cave = new Cave(treasures, dragon, "Just mine");
        while (!stop) {
            System.out.println("\n_______________________________\n");
            System.out.println("1:Show treasures");
            System.out.println("2:Get most expensive treasure");
            System.out.println("3:Find treasure by some cost");
            System.out.println("4:Exit");
            System.out.println("\n_______________________________\n");
            switch (new Scanner(System.in).nextInt()) {
                case 1: {
                    cave.showTreasures();
                    break;
                }
                case 2: {
                    System.out.println(cave.getMostExpencive());
                    break;
                }
                case 3: {
                    System.out.println("Write cost");
                    cave.treasuresBySomeCost(new Scanner(System.in).nextInt());
                    break;
                }
                case 4: {
                    stop=true;
                    break;
                }

            }
        }
    }
}
