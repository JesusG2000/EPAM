package by.etc.programming_with_class.class_object.task_three;

import java.util.regex.Matcher;

// Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
// успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа.
// Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
public class Student {
    String surname;
    String initials;
    int groupNumber;
    int progress[];


    Student(String surname, String initials, int groupNumber, int[] progress) {
        this.surname = surname;
        this.initials = initials;
        this.groupNumber = groupNumber;
        this.progress = progress;
    }

    boolean check() {
        for (int i = 0; i < progress.length; i++) {
            if (progress[i] <= 8) {
                return false;
            }
        }
        return true;
    }

    String getsurname() {
        return surname;
    }

    int getGroupNumber() {
        return groupNumber;
    }


    public static void main(String[] args) {
        String[] surname = new String[]{"Versho", "Osip", "Bych", "Mistic"};
        String[] initials = new String[]{"V.I.K", "O.V.S", "B.V.S", "M.E.D"};
        int[] groupNmber = new int[]{1, 2, 3, 4};
        Student[] students = new Student[10];

        for (int i = 0; i < students.length; i++) {
            int[] progress = new int[5];
            int data = (int) (Math.random() * surname.length);
            for (int y = 0; y < 5; y++) {
                progress[y] = (int) (Math.random() * 10 + 1);
            }
            students[i] = new Student(surname[data], initials[data], groupNmber[data], progress);
        }
        for (int i = 0; i < students.length; i++) {
            if (students[i].check()) {
                System.out.println(students[i].getsurname() + " " + students[i].getGroupNumber());
            }
        }

    }
}
