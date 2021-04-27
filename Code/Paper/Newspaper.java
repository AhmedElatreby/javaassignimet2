package Code.Paper;

import java.util.ArrayList;
import Code.Library.People.Author;

/**
 * <h1>The Newspaper Class</h1> The Newspaper class extends from the Paper
 * class.
 * <p>
 * Newspaper class override the method getTitle.
 * <p>
 * <b>Copyright (c) Bournemouth University</b>
 * 
 * @author Ahmed El-Atreby
 * 
 * @version 1.0
 */

public class Newspaper extends Paper {

    // Create newspaper class variables
    private int age;

    /**
     * Constructor method
     * 
     * @param title   the title of the newspaper
     * @param id      the id of the newspaper
     * @param authors the authors of the newspaper
     * @param edition the edition of the newspaper
     * @param price   the price of the newspaper
     * @param issue   the issue of the newspaper
     * @param isbn    the isbn of the newspaper
     * @param age     the age of the newspaper
     */
    public Newspaper(String title, int id, ArrayList<Author> authors, String edition, double price, int issue, int isbn,
            int age) {
        super(title, id, isbn, authors, edition, price, issue);
        this.age = age;
    }

    /**
     * Get age limit of the newspaper method
     * 
     * @return String get age limit of the newspaper
     */
    public String getAge() {
        return "Age limit: " + this.age + " years old";
    }

    /**
     * Get title of the newspaper method
     * 
     * @return String get the title of the newspaper
     */
    @Override
    public String getTitle() {
        return "Newspaper Name: " + this.title;
    }

}
