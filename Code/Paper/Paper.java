package Code.Paper;

import java.util.ArrayList;

import Code.Library.Publication;
import Code.Library.People.Author;

public abstract class Paper extends Publication {

    private int issue = 1;

    public Paper(String title, int id, int isbn, ArrayList<Author> authors, String edition, double price, int issue) 
    {
        super(title, id, isbn, authors, edition, price);
        this.issue = issue;
    }

    // // overloading 
    // public Paper(String title, int id, ArrayList<Author> authors, String edition,  double price, String type) {
    // super(title, id, isbn, authors, edition, price);
    // }

    /**
     * @return 
     * @return int
     */
    public String getIssue() 
    {
        return "Issue Number: " + this.issue;
    }

}
