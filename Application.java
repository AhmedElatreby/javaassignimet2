import java.util.ArrayList;

import Code.Library.Book;
import Code.Library.Publisher;
import Code.Library.People.Author;
import Code.Paper.Magazine;
import Code.Paper.Newspaper;

public class Application {

    public static void main(String[] args) {
        bookTest();
        System.out.println("--------------------------------------------");
        publisherTest();
        System.out.println("--------------------------------------------");
        magazinerTest();
        System.out.println("--------------------------------------------");
        newspaperTest();

    }

    public static void bookTest() {

        // CREATE A SAMPLE ARRAY LIST OF AUTHORS
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(new Author("Test author", "March"));
        authors.add(new Author("Test author 2", "October"));
        Book book = new Book("test book", 14, authors, "2nd", 444, 66, 2, "It was good");
        Author authour = new Author("Ahmed", "10/10/1980");
        System.out.println(book.details());
        System.out.println(book.getReview());
        System.out.println(authour.getAuthorDetails());
        book.setAvailability(false);
        System.out.println("Availability: " + book.stringAvailabilty());
    }

    public static void publisherTest() {
        
        
        Publisher publisher = new Publisher("Ahmed", "10/05/1981", "Is very good book");
        System.out.println(publisher.getPublisherName());
        System.out.println(publisher.getPublisherDate());
        System.out.println(publisher.getPublisherDescription());

    }

    public static void magazinerTest() {

        // CREATE A SAMPLE ARRAY LIST OF AUTHORS
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(new Author("Ahmed", "10/10/1950"));
        Magazine magazine = new Magazine("PC World", 25, authors, "3rd", 3.6, 3, 123456, "Computing");
        System.out.println(magazine.getTitle());
        System.out.println(magazine.getID());
        System.out.println(magazine.getAuthorName());
        System.out.println(magazine.getEdition());
        System.out.println(magazine.getPrice());
        System.out.println(magazine.getIssue());
        System.out.println(magazine.getIsbn());
        System.out.println(magazine.getType());
    }

    public static void newspaperTest() {

        // CREATE A SAMPLE ARRAY LIST OF AUTHORS
        ArrayList<Author> authors = new ArrayList<>();
        Author a = new Author("Ahmed", "10/10/1950");
        Newspaper newspaper = new Newspaper("The Sun", 154, authors, "5th", .99, 2598, 85547452, 16);
        System.out.println(newspaper.getTitle());
        System.out.println(newspaper.getID());
        System.out.println(a.getAuthorName());
        System.out.println(newspaper.getEdition());
        System.out.println(newspaper.getAge());
        System.out.println(newspaper.getPrice());
        System.out.println(newspaper.getIssue());
        System.out.println(newspaper.getIsbn());

    }

}
