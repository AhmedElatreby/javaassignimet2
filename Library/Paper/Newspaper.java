package Library.Paper;

import java.util.ArrayList;

import Library.People.Author;

public class Newspaper extends Paper {

    // private int age;

    public Newspaper(String title, int id, ArrayList<Author> authors, String edition, double price, int issue, int isbn)
    {
        super(title, id, authors, edition, price, issue, isbn);
    }


}
