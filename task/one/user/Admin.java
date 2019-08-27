package by.etc.task.one.user;

import by.etc.task.one.book.Book;
import by.etc.task.one.book.EBook;
import by.etc.task.one.book.PaperBook;
import by.etc.task.one.library.Catalog;
import by.etc.task.one.library.Library;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Admin extends User {

    private Library library;


    public Admin() {
        library=new Library();
    }

    public void showUsers() {
        for (User u :  UserAggregator.users) {
            System.out.println(u);
        }
    }

    public void checkEmailContent() {
        boolean found=false;
        for (User u :  UserAggregator.users) {
            if (!u.getMessageToAdmin().equals("")) {
                found=true;
                System.out.println(u + " message: " + u.getMessageToAdmin());
            }
        }
        if(!found){
            System.out.println("Nothing");
        }
    }

    public void changeDiscriptionInBook(int catalogIndex, int bookIndex,String changes) {
        Book book = getCatalogs().get(catalogIndex).getBooks().get(bookIndex);
        book.addContent(changes);

        for (User u : UserAggregator.users) {
            sendMessageForUser(u, this+": in catalog number " + catalogIndex + " in book " + book.getName() + " description was changed");
        }
    }

    private void sendMessageForUser(User user, String message) {

        user.messageFromAdmin(message);
    }

    public void addBook(String name, int countOfPages , String content,String bookType,boolean saveInFile){
        Book book =chooseBookType(name,countOfPages,content,bookType,saveInFile);
        int index=book.getName().toLowerCase().charAt(0)-'a';
        if(Library.catalogs.isEmpty()) {
           for(int i = 0 ; i < 26 ;i++){
               Library.catalogs.add(i,new Catalog());
           }
        }
        Library.catalogs.set(index,chooseCatalog(index));
        Library.catalogs.get(index).addBookInCatalog(book);
        library.addCatalogInLibrary(Library.catalogs.get(index),index);


    }

    private Book chooseBookType(String name, int countOfPages, String content,String bookType,boolean saveInFile) {
        if(saveInFile) {
            saveBookInFile(name, countOfPages, content, bookType);
        }
        if(bookType.equalsIgnoreCase("EBook")){
            return new EBook(name,countOfPages,content);
        }
       else {
            return new PaperBook(name,countOfPages,content);
        }
    }

    private void saveBookInFile(String name, int countOfPages, String content, String bookType) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File(
                    "D:\\IdeaProjects\\BasicsTasks\\src\\by\\etc\\task\\one\\book\\Books"), true));

            writer.write("\n");
            writer.write("\tName: " + name);
            writer.write("\n\tCount of pages: " + countOfPages);
            writer.write("\n\tContent: " + content);
            writer.write("\n\tBook type: " + bookType);
            writer.write("\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Catalog chooseCatalog(int index){
        if(Library.catalogs.get(index).getBooks().size()==0){
             return new Catalog();
        }else {
            return Library.catalogs.get(index);
        }
    }

    @Override
    public String toString() {
        return "Admin";
    }
}
