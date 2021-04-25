package Library.Paper;

import java.util.ArrayList;

import Library.Publication;
import Library.People.Author;

public abstract class Paper extends Publication {

    private int issue = 1;
    private int isbn;

    // CHANGED THE ORDER OF THE SUPER
    public Paper(String title, int id, ArrayList<Author> authors, String edition, double price, int issue, int isbn) 
    {
        super(title, id, authors, edition, price);
        this.isbn = isbn;
        this.issue = issue;
    }

    // public Paper(String title, int id, String edition, Author author, Publisher
    // publisher, double price, Availability availability, String type) {
    // super(title, id, edition, author, publisher, availability);
    // this.isbn = isbn;
    // }

    /**
     * @return 
     * @return int
     */
    public String getIssue() 
    {
        return "Issue Number: " + this.issue;
    }

    /**
     * @param isbn
     */
    public String getIsbn() 
    {
        return "ISBN Number: " + this.isbn;
    } 
}
