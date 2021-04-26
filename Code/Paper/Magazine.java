package Code.Paper;

import java.util.ArrayList;

import Code.Library.People.Author;

public class Magazine extends Paper 
{

    private String type;

    public Magazine(String title, int id, int isbn, ArrayList<Author> authors, String edition, double price, int issue, String type) 
    {
        super(title, id, isbn, authors, edition, price, issue);
        this.type = type;
    }

    
    /** 
     * @return String
     */
    public String getType()
    {
        return "Magazine type: " + this.type;
    }

         /**
     * @return String
     */
    @Override
    public String getTitle() {
        return "Magazine Name: " + this.title;
    }

}
