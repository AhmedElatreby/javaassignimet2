package Code.Paper;

import java.util.ArrayList;

import Code.Library.People.Author;

public class Magazine extends Paper 
{

    private String type;

    public Magazine(String title, int id, ArrayList<Author> authors, String edition, double price, int issue, int isbn, String type) 
    {
        super(title, id, authors, edition, price, issue, isbn);
        this.type = type;
    }

    
    /** 
     * @return String
     */
    public String getType()
    {
        return "Magazine type: " + this.type;
    }

}
