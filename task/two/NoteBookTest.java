package by.etc.task.two;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Задание 2. Блокнот.
// Разработать консольное приложение, работающее с Заметками в Блокноте.
// Каждая Заметка это: Заметка (тема, дата создания, e-mail, сообщение).
//
//Общие пояснения к практическому заданию.
// • В начале работы приложения данные должны считываться из файла, в конце работы – сохраняться в файл.
// • У пользователя должна быть возможность найти запись по любому параметру или по группе параметров
// (группу параметров можно определить самостоятельно),
// получить требуемые записи в отсортированном виде, найти записи,
// текстовое поле которой содержит определенное слово, а также добавить новую запись.
// • Особое условие: поиск, сравнение и валидацию вводимой информации осуществлять с использованием регулярных выражений.
// • Особое условие: проверку введенной информации на валидность должен осуществлять код, непосредственно добавляющий информацию.
public class NoteBookTest {
    public static void main(String[] args) {
        boolean end=false;
        NoteBook noteBook = new NoteBook();
        while(!end) {
            System.out.println("1:Check file content");
            System.out.println("2:Sort notes by");
            System.out.println("3:Find note(s) by");
            System.out.println("4:Find all sort notes");
            System.out.println("5:Find text field with certain sentence");
            System.out.println("6:Add new note in file");
            System.out.println("7:Exit and save");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println(noteBook.getData());
                    break;
                }
                case 2: {
                    System.out.println("1:Sort by topic");
                    System.out.println("2:Sort by date");
                    System.out.println("3:Sort by e-mail");
                    System.out.println("4:Sort by message");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1: {
                            noteBook.setNewSequence(noteBook.sortByTopic());
                            break;
                        }
                        case 2: {
                            noteBook.setNewSequence(noteBook.sortByDate());
                            break;
                        }
                        case 3: {
                            noteBook.setNewSequence(noteBook.sortByEmail());
                            break;
                        }
                        case 4: {
                            noteBook.setNewSequence(noteBook.sortByMessage());
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("1:Topic");
                    System.out.println("2:Date");
                    System.out.println("3:E-mail");
                    System.out.println("4:Message");
                    choice = scanner.nextInt();
                    System.out.println("Write");
                    switch (choice) {
                        case 1: {
                            String sentence = new Scanner(System.in).nextLine();
                            System.out.println(noteBook.findNotesByTopic(sentence));
                            break;
                        }
                        case 2: {
                            Scanner sc = new Scanner(System.in);
                            System.out.println("Day");
                            int day = sc.nextInt();
                            System.out.println("Month");
                            int month = sc.nextInt();
                            System.out.println("Year");
                            int year = sc.nextInt();
                            System.out.println(noteBook.findNotesByDate(day, month, year));
                            break;
                        }
                        case 3: {
                            String sentence = new Scanner(System.in).nextLine();
                            System.out.println(noteBook.findNotesByEmail(sentence));
                            break;
                        }
                        case 4: {
                            String sentence = new Scanner(System.in).nextLine();
                            System.out.println(noteBook.findNotesByMessage(sentence));
                            break;
                        }

                    }
                    break;
                }
                case 4: {
                    noteBook.showSequence();
                    break;
                }
                case 5: {
                    System.out.println("Write");
                    System.out.println(noteBook.findSentence(new Scanner(System.in).nextLine()));
                    break;
                }
                case 6: {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Write topic:");
                    String topic = sc.nextLine();
                    System.out.println("Write day:");
                    int day = Integer.valueOf(sc.nextLine());
                    System.out.println("Write month:");
                    int month = Integer.valueOf(sc.nextLine());
                    System.out.println("Write year:");
                    int year = Integer.valueOf(sc.nextLine());
                    System.out.println("Write e-mail:");
                    String email = sc.nextLine();
                    System.out.println("Write message:");
                    String message = sc.nextLine();
                    noteBook.setData(topic, day, month, year, email, message);
                    break;
                }
                case 7: {
                    noteBook.saveData();
                    end = true;
                    break;
                }
            }
        }
    }
}
