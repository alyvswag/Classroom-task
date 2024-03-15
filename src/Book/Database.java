package Book;

public class Database {
 private static Book[] books = new Book[10];
 private static int lastIndex=0;
 public static void addData(Book book){
     books[lastIndex++] =book;
     System.out.println("Kitab ugurla elave edildi. ");
 }

 public static void dataShow(){
     if(lastIndex == 0){
         System.out.println("datada kitab yoxdur.");
     }
     for(Book book : books){

         if(book != null){
             System.out.println("Kitabin adi: " + book.getName());
             System.out.println("Kitabin muellifi: " + book.getAuthor().getName() + " " + book.getAuthor().getSurname());
         }
     }

 }


}
