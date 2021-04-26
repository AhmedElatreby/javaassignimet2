import java.util.ArrayList;

import Code.Library.Book;
import Code.Library.Publisher;
import Code.Library.People.Author;
import Code.Paper.Magazine;
import Code.Paper.Newspaper;

public class Application {

    /**
     * @param args
     */
    public static void main(String[] args) {

        bookTest();
        publisherTest();
        magazinerTest();
        newspaperTest();

    }

    public static void bookTest() {

        // CREATE A SAMPLE ARRAY LIST OF AUTHORS
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(new Author("Test author", "March"));
        Book book = new Book("All About Java", 14, authors, "2nd", 98, 66, 123456, "Good");
        System.out.println("\n\n******** Testing Book********" );
        System.out.println(book.details());
        System.out.println(book.getIsbn());
        System.out.println(book.getReview());
        loopAuthorNameArr(book.getAuthorName());
        book.setAvailability(true);
        System.out.println("Availability: " + book.stringAvailabilty());
    }

    public static void publisherTest() {

        Publisher publisher = new Publisher("Ahmed", "10/05/1981", "Is very good book");
        System.out.println("\n\n******** Testing Publisher********" );
        System.out.println(publisher.getPublisherName());
        System.out.println(publisher.getPublisherDate());
        System.out.println(publisher.getPublisherDescription());
        publisher.setDescription(null);
        System.out.println(publisher.getPublisherDescription());

    }

    public static void magazinerTest() {

        // CREATE A SAMPLE ARRAY LIST OF AUTHORS
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(new Author("Ahmed", "10/10/1950"));
        Magazine magazine = new Magazine("PC World", 25, 123456, authors, "3rd", 3.6, 3, "Computing");
        System.out.println("\n\n******** Testing Magazine********" );
        System.out.println(magazine.getTitle());
        System.out.println(magazine.getID());
        loopAuthorNameArr(magazine.getAuthorName());
        System.out.println(magazine.getEdition());
        System.out.println(magazine.getPrice());
        System.out.println(magazine.getIssue());
        System.out.println(magazine.getIsbn());
        System.out.println(magazine.getType());
    }

    public static void newspaperTest() {

        // CREATE A SAMPLE ARRAY LIST OF AUTHORS
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(new Author("Ahmed", null));
        Newspaper newspaper = new Newspaper("The Sun", 154, authors, "5th", .99, 2,123456, 16);
        System.out.println("\n\n******** Testing Newspaper********" );
        System.out.println(newspaper.getTitle());
        System.out.println(newspaper.getID());
        loopAuthorNameArr(newspaper.getAuthorName());
        System.out.println(newspaper.getEdition());
        System.out.println(newspaper.getAge());
        System.out.println(newspaper.getPrice());
        System.out.println(newspaper.getIssue());
        System.out.println(newspaper.getIsbn());

    }

    
    /** 
     * @param authors
     */
    public static void loopAuthorNameArr(ArrayList<Author> authors) {
        for (Author author: authors) {
            System.out.println(author.getAuthorName());
        }
    }

}
