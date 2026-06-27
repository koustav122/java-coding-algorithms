
import java.util.Scanner;
class InvalidPriceException extends Exception {
    InvalidPriceException(String msg) {
        super(msg);
    }
}
class Book {
    int bookID;
    String bookName;
    double price;
    Book(int bookID, String bookName, double price) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.price = price;
    }
}
class EBook extends Book {
    double fileSize;
    EBook(int bookID, String bookName, double price, double fileSize) {
        super(bookID, bookName, price);
        this.fileSize = fileSize;
    }
    double totalCost () {
        return price + (fileSize * 2);
    }
    void display () {
        System.out.println("Book ID : " + bookID);
         System.out.println("Book Nmae : " + bookName);
          System.out.println("Price : " + price); 
          
          System.out.println("File Size : " + fileSize);
          System.out.println("Total Cost  : " + totalCost());
          
        
    }
}

public class Melody {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            double fileSize = sc.nextDouble();
            if(price < 100) {
                throw new InvalidPriceException("Invalid Price");
               
            }
             EBook b = new EBook(id, name, price, fileSize);
                b.display();
           
                
            }
             catch(InvalidPriceException e) {
                  System.out.println(e.getMessage());
            
        }
    }
}