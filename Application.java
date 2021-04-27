import java.util.ArrayList;

import Code.Library.*;
import Code.Library.People.*;
import Code.Paper.*;

/**
 * <h1>The Main Method</h1>
 * <b>PURPOSE OF PROJECT:</b>
 * <p>
 * The Purpose of this project is to create a Publication Library application
 * </p>
 * The aim of this method to run all the methods from the othere classes.
 * 
 * <p>Copyright (c) Bournemouth University</p>
 * 
 * @author Ahmed El-Atreby
 * @version 1.0
 */
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

    /**
     * This method will test book class.
     * <p>Book class is a child class of Publication class.
     * ArrayList used to add author's name to the book class.
     * getTitle method been Overrided in the book class.
     */

    public static void bookTest() {

        // CREATE A SAMPLE ARRAY LIST OF AUTHORS
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(new Author("Test author", "March"));
        Book book = new Book("All About Java", 14, authors, "2nd", 98, 123456, "Good");
        System.out.println("\n\n******** Testing Book********");
        System.out.println(book.details());
        System.out.println(book.getIsbn());
        System.out.println(book.getReview());
        loopAuthorNameArr(book.getAuthorName());
        book.setAvailability(false);
        System.out.println("Availability: " + book.stringAvailabilty());
    }


    /**
     * This method will test Publisher class.
     * <p>Publisher class hold information such as publisher name, DOB and description.
     * <p>setPublisherDecription method used with value null to test the function if publisher has no description
     */

    public static void publisherTest() {

        Publisher publisher = new Publisher("Ahmed", "10/05/1981", "Is very good book");
        System.out.println("\n\n******** Testing Publisher********");
        System.out.println(publisher.getPublisherName());
        System.out.println(publisher.getPublisherDate());
        System.out.println(publisher.getPublisherDescription());
        publisher.setDescription(null);
        System.out.println(publisher.getPublisherDescription());

    }

    /**
     * This method will test Magazine class.
     * <p>Magazine class is a child class of Paper class.
     * <p>ArrayList used to add author's name to the book class.
     * <p>getTitle method been Overrided in the book class.
     */

    public static void magazinerTest() {

        // CREATE A SAMPLE ARRAY LIST OF AUTHORS
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(new Author("Ahmed", "10/10/1950"));
        Magazine magazine = new Magazine("PC World", 25, 123456, authors, "3rd", 3.6, 3, "Computing");
        System.out.println("\n\n******** Testing Magazine********");
        System.out.println(magazine.getTitle());
        System.out.println(magazine.getID());
        loopAuthorNameArr(magazine.getAuthorName());
        System.out.println(magazine.getEdition());
        System.out.println(magazine.getPrice());
        System.out.println(magazine.getIssue());
        System.out.println(magazine.getIsbn());
        System.out.println(magazine.getType());
    }

    /**
     * This method will test Newspaper class.
     * <p>Newspaper class is a child class of Paper class.
     * <p>ArrayList used to add author's name to the book class.
     * <p>getTitle method been Overrided in the book class.
     */

    public static void newspaperTest() {

        // CREATE A SAMPLE ARRAY LIST OF AUTHORS
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(new Author("Ahmed", null));
        Newspaper newspaper = new Newspaper("The Sun", 154, authors, "5th", .99, 2, 123456, 16);
        System.out.println("\n\n******** Testing Newspaper********");
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
     * 
     * 
     * @param authors
     * 
     * this method use to create a loop for the autor name
     */
    public static void loopAuthorNameArr(ArrayList<Author> authors) {
        for (Author author : authors) {
            System.out.println(author.getAuthorName());
        }
    }

}
