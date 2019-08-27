package by.etc.task.one;


import by.etc.task.one.user.Admin;
import by.etc.task.one.user.User;
import by.etc.task.one.user.UserAggregator;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
//   • Система учитывает книги как в электронном, так и в бумажном варианте.
//   • Существующие роли: пользователь, администратор.
//   • Пользователь может просматривать книги в каталоге книг, осуществлять поиск книг в каталоге.
//   • Администратор может модифицировать каталог.
//   • *При добавлении описания книги в каталог оповещение о ней рассылается на e-mail всем пользователям
//   • **При просмотре каталога желательно реализовать постраничный просмотр
//   • ***Пользователь может предложить добавить книгу в библиотеку, переслав её администратору на e-mail.
//   • Каталог книг хранится в текстовом файле.
//   • Данные аутентификации пользователей хранятся в текстовом файле. Пароль не хранится в открытом виде
    private static Admin admin=new Admin();

    public static void main(String[] args) {
        getAllUsersFromFile();
        getAllBooksFromFile();
        int choice;
        boolean end = false;
        while (!end) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1-To register");
            System.out.println("2-Sign in");
            System.out.println("3-Sign in like admin");
            System.out.println("0-Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 0: {
                    end = true;
                    break;
                }
                case 1: {
                    register();
                    break;
                }
                case 2: {
                    signIn();
                    break;
                }
                case 3: {
                    adminFunctions();
                    break;
                }
            }
        }
    }

    private static void getAllBooksFromFile() {
        Pattern pattern = Pattern.compile(":.+");
        Matcher matcher=pattern.matcher(getData("D:\\IdeaProjects\\BasicsTasks\\src\\by\\etc\\task\\one\\book\\Books"));
        int counter=0;
        String name = "";
        String countOfPage = "";
        String content = "";
        String bookType;
        while(matcher.find()){
            counter++;
            switch (counter) {
                case 1: {
                    name=matcher.group().substring(1).trim();
                    break;
                }
                case 2: {
                    countOfPage=matcher.group().substring(1).trim();
                    break;
                }
                case 3: {
                    content=matcher.group().substring(1).trim();
                    break;
                }case 4: {
                    bookType=matcher.group().substring(1).trim();
                    admin.addBook(name,Integer.valueOf(countOfPage),content,bookType,false);
                    break;
                }
            }
        }
    }

    private static void getAllUsersFromFile() {
        Pattern pattern = Pattern.compile(":.+");
        Matcher matcher=pattern.matcher(getData("D:\\IdeaProjects\\BasicsTasks\\src\\by\\etc\\task\\one\\user\\ListOfUsers"));
        int counter=0;
        String name = null;
        String logIn = null;
        String password;
        while(matcher.find()){
            counter++;
            switch (counter) {
                case 1: {
                    name=matcher.group().substring(1).trim();
                    break;
                }
                case 2: {
                    logIn=matcher.group().substring(1).trim();
                    break;
                }
                case 3: {
                    password=getPassword(matcher.group().substring(1).trim());
                    UserAggregator.users.add(new User(name,logIn,password));
                    counter=0;
                    break;
                }
            }
        }
    }


    private static void signIn() {
        User user;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write name");
        String name = scanner.nextLine();
        System.out.println("Write log in");
        String logIn = scanner.nextLine();
        System.out.println("Write password");
        String password = scanner.nextLine();
        user = findUser(name, logIn, password);
        if (user!=null) {
            userFunctions(user);
        } else {
            System.out.println("Incorrect login or password");
        }
    }

    private static User findUser(String name, String logIn, String password) {
        Pattern pattern = Pattern.compile(":.+");
        Matcher matcher=pattern.matcher(getData("D:\\IdeaProjects\\BasicsTasks\\src\\by\\etc\\task\\one\\user\\ListOfUsers"));
        int counter=0;
        String fileName = null;
        String fileLogIn = null;
        String filePassword;
        while(matcher.find()){
            counter++;
            switch (counter) {
                case 1: {
                    fileName=matcher.group().substring(1).trim();
                    break;
                }
                case 2: {
                    fileLogIn=matcher.group().substring(1).trim();
                    break;
                }
                case 3: {
                    filePassword=getPassword(matcher.group().substring(1).trim());
                    if(name.equals(fileName)&&logIn.equals(fileLogIn)&&password.equals(filePassword)){
                       for(int i = 0 ; i < UserAggregator.users.size();i++){
                           if(UserAggregator.users.get(i).equals(new User(name,logIn,password))){
                               return UserAggregator.users.get(i);
                           }
                       }
                    }
                    counter=0;
                    break;
                }
            }
        }
        return null;
    }

    private static void userFunctions(User user) {
        boolean exit = false;
        Scanner forInt = new Scanner(System.in);
        Scanner forStr = new Scanner(System.in);
        int choice;
        while (!exit) {
            System.out.println("1- Recommend to add book");
            System.out.println("2- Check e-mail");
            System.out.println("3- Send message to admin");
            System.out.println("4- Find book in certain catalog");
            System.out.println("5- Show books in certain catalog");
            System.out.println("0- Exit");
            choice = forInt.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Write book name");
                    String name = forStr.nextLine();
                    System.out.println("Write count of pages");
                    int pages = forInt.nextInt();
                    System.out.println("Write book content");
                    String content = forStr.nextLine();
                    user.recommendAddBook(name, pages, content);
                    break;
                }
                case 2: {
                    user.checkEmailContent();
                    break;
                }
                case 3: {
                    System.out.println("Write message");
                    user.sendMessageToAdmin(forStr.nextLine());
                    break;
                }
                case 4: {
                    System.out.println("Write catalog index");
                    int index = forInt.nextInt();
                    System.out.println("Write book name");
                    String name = forStr.nextLine();
                    user.findBookInCertainCatalog(index, name);
                    break;
                }
                case 5: {
                    System.out.println("Write catalog index");
                    int index = forInt.nextInt();
                    user.showBooksInCertainCatalog(index);
                    break;
                }
                case 0: {
                    exit = true;
                    break;
                }
            }
        }

    }

    private static void adminFunctions() {
        boolean exit = false;
        Scanner forInt = new Scanner(System.in);
        Scanner forStr = new Scanner(System.in);
        int choice;
        while (!exit) {
            System.out.println("1- Change book description");
            System.out.println("2- Check e-mail");
            System.out.println("3- Show users");
            System.out.println("4- Add book");
            System.out.println("0- Exit");
            choice = forInt.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Write catalog index");
                    int index = forInt.nextInt();
                    System.out.println("Write book index");
                    int bookIndex = forInt.nextInt();
                    System.out.println("Write new added book content");
                    String content = forStr.nextLine();
                    admin.changeDiscriptionInBook(index, bookIndex, content);
                    break;
                }
                case 2: {
                    admin.checkEmailContent();
                    break;
                }
                case 3: {
                    admin.showUsers();
                    break;
                }
                case 4: {
                    System.out.println("Write book name");
                    String name = forStr.nextLine();
                    System.out.println("Write count of pages");
                    int pages = forInt.nextInt();
                    System.out.println("Write book content");
                    String content = forStr.nextLine();
                    System.out.println("Write book type(EBook , Paper Book)");
                    String bookType = forStr.nextLine();
                    admin.addBook(name, pages, content,bookType,true);
                    break;
                }
                case 0: {
                    exit = true;
                    break;
                }
            }
        }

    }

    private static void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write name");
        String name = scanner.nextLine();
        System.out.println("Write log in");
        String logIn = scanner.nextLine();
        System.out.println("Write password");
        String password = scanner.nextLine();
        UserAggregator.users.add(new User(name,logIn,password));
        setData(name, logIn, password);
    }

    private static String getData(String fileWay) {
        String text = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(
                    fileWay)));
            while (reader.read() != -1) {
                text += reader.readLine() + "\n";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

    private static void setData(String name, String logIn, String password) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File(
                    "D:\\IdeaProjects\\BasicsTasks\\src\\by\\etc\\task\\one\\user\\ListOfUsers"), true));

            writer.write("\n");
            writer.write("\tName: " + name);
            writer.write("\n\tLog in: " + logIn);
            writer.write("\n\tPassword: " + hidePassword(password));
            writer.write("\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String hidePassword(String password) {
        String hidePassword = "";
        for (int i = 0; i < password.length(); i++) {
            hidePassword += (char) (password.charAt(i) + 1000);
        }
        return hidePassword;

    }

    private static String getPassword(String hidePassword) {
        String password = "";
        for (int i = 0; i < hidePassword.length(); i++) {
            password += (char) (hidePassword.charAt(i) - 1000);
        }
        return password;
    }
}

