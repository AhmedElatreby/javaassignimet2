package Code.Paper;

import java.util.ArrayList;

import Code.Library.People.Author;

public class Newspaper extends Paper {

    private int age;

    public Newspaper(String title, int id, ArrayList<Author> authors, String edition, double price, int issue, int isbn, int age)
    {
        super(title, id, authors, edition, price, issue, isbn);
        this.age = age;
    }

    
    /** 
     * @return String
     */
    public String getAge()
    {
        return "Age limit: " + this.age + " years old";
    }


}
