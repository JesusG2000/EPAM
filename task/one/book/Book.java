package by.etc.task.one.book;

import java.util.ArrayList;
import java.util.Scanner;

public abstract    class Book {
   private String name;
   private String content;
   private int countOfPages;


      public Book(String name, int countOfPages,String content) {
          this.name = name;
          this.content=content;
          this.countOfPages = countOfPages;
      }
      public void showPageContent(){
          ArrayList<String> text =pageContent();
          Scanner scanner =new Scanner(System.in);
          int choice;
          int page=-1;
          System.out.println("You are on the begin of this book");
          System.out.println("0-stop book view ");
          System.out.println("1-next page");
          System.out.println("2-previous page");
          while((choice=scanner.nextInt())!=0){
             try {
                 switch (choice) {
                     case 1: {
                         page++;
                         System.out.println(text.get(page));
                         break;
                     }
                     case 2: {
                         page--;
                         System.out.println(text.get(page));
                         break;
                     }
                 }

             } catch (IndexOutOfBoundsException e){
                 page=-1;
                 System.out.println("Invalid page");
                 System.out.println("You are on the first page");
             }
          }
      }

    private ArrayList<String> pageContent() {
        ArrayList<String> text=new ArrayList<>();
        String[] pageContent= content.split("\\.");
        String addInText="";
        for(int i = 0 ; i < pageContent.length; i++){
            addInText+=pageContent[i]+".";
            if((i+1)%3==0){
                text.add(addInText.trim());
                addInText="";
            }
            if(pageContent.length-i<2){
                text.add(addInText.trim());
            }
        }
        return text;
    }

    @Override
    public String toString() {
        return "name='" + name +"' count of pages ='" + countOfPages + '\'';
    }

    public String getName() {
        return name;
    }
    public void addContent(String content){
          this.content+=content;
    }
}
