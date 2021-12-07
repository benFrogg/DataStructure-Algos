
import java.util.*;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

class MyBook extends Book {
    int price;
    
    MyBook(String title, String author, int price) {
        super (title, author);
        this.price = price;
    }

    public void display(){
        System.out.printf("Title: %s%n", title);
        System.out.printf("Author: %s%n", author);
        System.out.printf("Price: %2d%n", price);
    }
    
}

public class Day13Abstract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
