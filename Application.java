import java.util.ArrayList;

import Library.*;
import Library.Paper.Magazine;
import Library.People.*;

public class Application {

    public static void main(String[] args) {

        // CREATE A SAMPLE ARRAY LIST OF AUTHORS
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(new Author("Test author", "March"));
        authors.add(new Author("Test author 2", "October"));

        Book book = new Book("test book", 14, authors, "2nd", 444, 66, 2, "It was good");

        System.out.println(book.details());
        System.out.println("----------------------------------");
        publisherTest();
        MagazinerTest();

    }

    public static void publisherTest() {
        System.out.println("--------------------------------------------");

        Publisher publisher = new Publisher("Ahmed", "10/05/1981", "Is very good book");
        System.out.println(publisher.getPublisherName());
        System.out.println(publisher.getPublisherDate());
        System.out.println(publisher.getPublisherDescription());

    }

    public static void MagazinerTest() {
        System.out.println("--------------------------------------------");

        ArrayList<Author> authors = new ArrayList<>();
        authors.add(new Author("Ahmed", "10/10/1950"));
        Magazine magazine = new Magazine("PC World", 25, authors, "3rd", 3.6, 3, 123456, "pc");
        System.out.println(magazine.getTitle());
        System.out.println(magazine.getID());
        System.out.println(magazine.getAuthorName());
        System.out.println(magazine.getEdition());
        System.out.println(magazine.getPrice());
        System.out.println(magazine.getIssue());
        System.out.println(magazine.getIsbn());
        System.out.println(magazine.getType());


    }

}
