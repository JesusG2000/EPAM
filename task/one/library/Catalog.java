package by.etc.task.one.library;

import by.etc.task.one.book.Book;

import java.util.ArrayList;

public class Catalog {
   private ArrayList<Book> books;


    public Catalog() {
       books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
    public void addBookInCatalog(Book book){
        books.add(book);
    }

}
