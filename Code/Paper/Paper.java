package Code.Paper;

import java.util.ArrayList;

import Code.Library.Publication;
import Code.Library.People.Author;

public abstract class Paper extends Publication {

    private int issue = 1;
    private int isbn;

    public Paper(String title, int id, ArrayList<Author> authors, String edition, double price, int issue, int isbn) 
    {
        super(title, id, authors, edition, price);
        this.isbn = isbn;
        this.issue = issue;
    }

    // overloading 
    public Paper(String title, int id, ArrayList<Author> authors, String edition,  double price, String type) {
    super(title, id, authors, edition, price);
    this.isbn = isbn;
    }

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
