package Book;

import java.util.Scanner;

import static Book.Database.addData;
import static Book.Database.dataShow;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        while(true){
            printMenu();
            int secim = scanner.nextInt();
            switch (secim){
                case 1:
                    addBook(); break;
                case 2:
                    dataShow(); break;
                case 3:
                    break;
            }
        }



    }
    public static void addBook(){
        Author author = createdAuthor();
        Material material = new Material("Kagiz" , "asagi");
        Book book = createdBook(author,material);
        Database.addData(book);

    }
    public static void printMenu(){
        String menu = "1.Kitab elave et." +
                      "\n2.Kitablarin siyahisin goster.";
        System.out.println(menu);
    }



    public static Book createdBook(Author author,Material material){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zehmet olmasa kitabin melumatlarini daxil edin: ");
        System.out.print("Kitabin adin daxil et: ");
        String bookName = scanner.next();
        System.out.print("Kitabin sehifesin sayin  daxil edin: ");
        int pageCount = scanner.nextInt();
        Book book = new Book(bookName,pageCount,author,material);


        return book;
    }
    public static  Author createdAuthor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zehmet olmasa muellif melumatlarini daxil edin: ");
        System.out.print("Muellifin adin daxil et: ");
        String authorName = scanner.next();
        System.out.print("Muellifin soyadin daxil et: ");
        String authorSurname = scanner.next();
        System.out.print("Muellifin gmailin daxil edin: ");
        String authorGmail = scanner.next();

        Author author = new Author(authorName,authorSurname,authorGmail);
        return author;
    }
}
