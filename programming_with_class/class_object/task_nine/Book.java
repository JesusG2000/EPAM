package by.etc.programming_with_class.class_object.task_nine;
//. Создать класс Book, спецификация которого приведена ниже.
// Определить конструкторы, set- и get- методы и метод  toString().
// Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.
//
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
// Найти и вывести:
// Test) список книг заданного автора;
// b) список книг, выпущенных заданным издательством;
// c) список книг, выпущенных после заданного года.

import java.util.Arrays;

public class Book {
    private int id;
    private String name;
    private String[] authors;
    private String publishingHouse;
    private int issue;
    private int pages;
    private int cost;
    private String typeOfBinding;

    public Book(int id, String name, String[] authors, String publishingHouse, int issue, int pages, int cost, String typeOfBinding) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publishingHouse = publishingHouse;
        this.issue = issue;
        this.pages = pages;
        this.cost = cost;
        this.typeOfBinding = typeOfBinding;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", issue=" + issue +
                ", pages=" + pages +
                ", cost=" + cost +
                ", typeOfBinding='" + typeOfBinding + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getIssue() {
        return issue;
    }

    public void setIssue(int issue) {
        this.issue = issue;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }
}
