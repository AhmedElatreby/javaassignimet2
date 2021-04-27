package Code.Library;

import java.util.ArrayList;
import Code.Library.People.Author;

/**
 * <h1>The Book Class</h1> Book class extends from the superclass Publication.
 * <p>
 * Book class override getTitle method from Publication class.
 * <p>
 * <b>Copyright (c) Bournemouth University</b>
 * 
 * @author Ahmed El-Atreby
 * 
 * @version 1.0
 */

public class Book extends Publication {

    // Create Author class variables
    private String review;

    /**
     * Constructor method
     * 
     * @param title   the title of the book
     * @param id      the id of the book
     * @param authors the authors of the book
     * @param edition the edition of the book
     * @param price   the price of the book
     * @param isbn    the isbn of the book
     * @param review  the review of the book
     */
    public Book(String title, int id, ArrayList<Author> authors, String edition, double price, int isbn,
            String review) {
        super(title, id, isbn, authors, edition, price);
        this.review = review;
    }

    /**
     * Get title of the book method
     * 
     * @return String get the title of the book
     */
    @Override
    public String getTitle() {
        return "Book Title: " + this.title;
    }

    /**
     * Get review of the book method
     * 
     * @return String get the review of the book
     */
    public String getReview() {
        return "Review: " + this.review;
    }

}