package Library.Paper;

import java.util.ArrayList;

import Library.People.Author;

public class Magazine extends Paper 
{

    private String type;

    public Magazine(String title, int id, ArrayList<Author> authors, String edition, double price, int issue, int isbn, String type) 
    {
        super(title, id, authors, edition, price, issue, isbn);
        this.type = type;
    }

    public String getType()
    {
        return this.type;
    }

}
