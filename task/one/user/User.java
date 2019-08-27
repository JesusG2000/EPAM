package by.etc.task.one.user;

import by.etc.task.one.book.Book;
import by.etc.task.one.library.Catalog;
import by.etc.task.one.library.Library;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class User {

    private String name;
    private String logIn;
    private String password;
    private String messageToAdmin;
    private String messageFromAdmin;


    public User(String name, String logIn, String password) {
        this.name = name;
        this.logIn = logIn;
        this.password = password;
        messageToAdmin = "";
        messageFromAdmin = "";
    }

    User() {
    }

    public String getLogIn() {
        return logIn;
    }

    public String getPassword() {
        return password;
    }

    public void showBooksInCertainCatalog(int catalogIndex) {
        boolean found = false;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = Library.catalogs.get(catalogIndex).getBooks();

        for (Book b : books) {
            found = true;
            System.out.println(b);
        }
        if (found) {
            System.out.println("Check book content?(yes,no)");
            if (scanner.nextLine().equalsIgnoreCase("yes")) {
                checkContent(books);
            }
        } else {
            System.out.println("Nothing is found");
        }
    }

    public void findBookInCertainCatalog(int catalogIndex, String bookName) {
        boolean found=false;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> checkContent = new ArrayList<>();
        ArrayList<Book> books = Library.catalogs.get(catalogIndex).getBooks();

        for (Book b : books) {
            if (b.getName().matches(".*" + bookName + ".*")) {
                found=true;
                checkContent.add(b);
                System.out.println(b);
            }
        }
        if(found) {
            System.out.println("Check book content?(yes,no)");
            if (scanner.nextLine().equalsIgnoreCase("yes")) {
                ArrayList<Book> toTransfer = new ArrayList<>(checkContent);
                checkContent(toTransfer);
            }
        }else{
            System.out.println("Nothing is found");
        }
    }

    private void checkContent(ArrayList<Book> books) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean end = false;
        while (!end) {
            System.out.println("Choose book");
            System.out.println("Exit - 0\n");
            for (int i = 0; i < books.size(); i++) {
                System.out.println((i + 1) + " " + books.get(i));
            }
            choice = scanner.nextInt();
            if (choice == 0) {
                end = true;
            } else {
                books.get(choice - 1).showPageContent();
            }
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", logIn='" + logIn + '\'' +
                '}';
    }

    public void checkEmailContent() {
        System.out.println(messageFromAdmin);
    }

    String getMessageToAdmin() {
        return messageToAdmin;
    }

    public void sendMessageToAdmin(String messageToAdmin) {
        this.messageToAdmin += messageToAdmin + "\n";
    }

    ArrayList<Catalog> getCatalogs() {
        return Library.catalogs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(getLogIn(), user.getLogIn()) &&
                Objects.equals(getPassword(), user.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, getLogIn(), getPassword());
    }

    void messageFromAdmin(String messageFromAdmin) {
        this.messageFromAdmin = messageFromAdmin;
    }

    public void recommendAddBook(String name, int countOfPages, String content) {
        sendMessageToAdmin(this + " Recommend book:" + "name:" + name + " pages:" + countOfPages + " content:" + content);
    }
}
