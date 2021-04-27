package Code.Paper;

import java.util.ArrayList;
import Code.Library.Publication;
import Code.Library.People.Author;

/**
 * <h1>The Paper Class</h1> The paper class extends from Publication class.
 * <p>
 * Paper class is a super class for Magazine and Newspaper class.
 * <p>
 * <b>Copyright (c) Bournemouth University</b>
 * 
 * @author Ahmed El-Atreby
 * 
 * @version 1.0
 */

public abstract class Paper extends Publication {
    // Create paper class variables
    private int issue = 1;

    /**
     * Constructor method
     * 
     * @param title   the title of the paper
     * @param id      the id of the paper
     * @param isbn    the isbn of the paper
     * @param authors the authors of the paper
     * @param edition the edition of the paper
     * @param price   the price of the paper
     * @param issue   the issue of the paper
     */
    public Paper(String title, int id, int isbn, ArrayList<Author> authors, String edition, double price, int issue) {
        super(title, id, isbn, authors, edition, price);
        this.issue = issue;
    }

    /**
     * Get issue of the paper method
     * 
     * @return String get issue of the paper
     */
    public String getIssue() {
        return "Issue Number: " + this.issue;
    }

}
