package by.etc.programming_with_class.class_object.task_nine;

public class Libriary {
    private Book[] book;

    public Libriary(Book[] book) {
        this.book = book;
    }

    void showAuthorsBooks(String authorName) {
        for (int i = 0; i < book.length; i++) {
            boolean isExist = false;
            for (int y = 0; y < book[i].getAuthors().length; y++) {
                if (authorName.equals(book[i].getAuthors()[y])) {
                    isExist = true;
                    break;
                }
            }
            if (isExist) {
                System.out.println(book[i].getName()+"\n"+book[i].toString());
            }
        }
    }

    void listOfBooksIssuedByPublishingHouse(String publishingHouse) {
        for (Book b : book) {
            if (b.getPublishingHouse().equals(publishingHouse)) {
                System.out.println(b.getName());
            }
        }
    }

    void listOfBooksIssuedAfter(int year) {
        for (Book b : book) {
            if (b.getIssue() > year) {
                System.out.println(b.getName());
            }
        }
    }

    public static void main(String[] args) {

        Book[] books = new Book[10];
        String[] name = new String[]{"My house", "Fishing", "War", "Family", "Hell"};
        String[] author = new String[]{"Pecho", "Ivachevich", "Grigog", "Simox"};
        String[] publishingHouse = new String[]{"Russian paper", "Eyes factory", "True or lie", "Gravity false"};
        int[] issue = new int[]{1990, 2000, 2010, 3190};
        int[] pages = new int[]{100, 200, 300, 400, 500};
        int[] cost = new int[]{1000, 3000, 200, 90};
        String[] typeOfBinding = new String[]{"unknown", "hands"};

        for (int i = 0; i < books.length; i++) {

            String[] setAuthors;
            int countOfAuthors=(int)(Math.random()*(author.length-1)+1);
            setAuthors=new String[countOfAuthors];

            for(int y =0 ; y <countOfAuthors ;y++){
                setAuthors[y]=author[(int)(Math.random()*author.length)];
            }

            books[i]=new Book(
                    i,
                    name[(int)(Math.random()*name.length)],
                    setAuthors,
                    publishingHouse[(int)(Math.random()*publishingHouse.length)],
                    issue[(int)(Math.random()*issue.length)],
                    pages[(int)(Math.random()*pages.length)],
                    cost[(int)(Math.random()*cost.length)],
                    typeOfBinding[(int)(Math.random()*typeOfBinding.length)]
            );
        }
        Libriary libriary = new Libriary(books);
         libriary.showAuthorsBooks("Pecho");
       // libriary.listOfBooksIssuedAfter(2010);
       // libriary.listOfBooksIssuedByPublishingHouse("Russian paper");

    }
}
