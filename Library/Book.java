package Library;

import java.util.ArrayList;

import Library.People.Author;

public class Book extends Publication {
    private String review;

    public Book(String title, int id, ArrayList<Author> authors, String edition, double price, int issue, int isbn,
            String review) {
        super(title, id, authors, edition, price);
        this.review = review;
    }

    /**
     * @return String
     */
    @Override
    public String getTitle() {
        return "name test";
    }

    public String getReview() {
        return this.review;
    }

}