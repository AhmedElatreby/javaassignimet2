package Code.Paper;

import java.util.ArrayList;
import Code.Library.People.Author;

/**
 * <h1>The Magazine Class</h1> The Magazine class extends from the Paper class.
 * <p>
 * Magazine class override the method getTitle.
 * <p>
 * <b>Copyright (c) Bournemouth University</b>
 * 
 * @author Ahmed El-Atreby
 * 
 * @version 1.0
 */

public class Magazine extends Paper {

    // Create magazine class variables
    private String type;

    /**
     * Constructor method
     * 
     * @param title   the title of the magazine
     * @param id      the id of the magazine
     * @param isbn    the isbn of the magazine
     * @param authors the authors of the magazine
     * @param edition the edition of the magazine
     * @param price   the price of the magazine
     * @param issue   the issue of the magazine
     * @param type    the type of the magazine
     */
    public Magazine(String title, int id, int isbn, ArrayList<Author> authors, String edition, double price, int issue,
            String type) {
        super(title, id, isbn, authors, edition, price, issue);
        this.type = type;
    }

    /**
     * Get type of the magazine method
     * 
     * @return String get the type of the magazine
     */
    public String getType() {
        return "Magazine type: " + this.type;
    }

    /**
     * Get title of the magazine method
     * 
     * @return String get the title of the magazine
     */
    @Override
    public String getTitle() {
        return "Magazine Name: " + this.title;
    }

}
