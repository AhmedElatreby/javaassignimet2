package Library;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import Library.People.Author;

public abstract class Publication {

    // create variables
    protected String title;
    private Publisher publisher;
    private int id;
    public ArrayList<Author> authors;
    private boolean isAvailable = true;
    protected String edition;
    protected double price;
    protected String returnDate = null;

    public Publication(String title, int id, ArrayList<Author> authors, String edition, double price) {
        this.title = title;
        this.id = id;
        this.authors = authors;
        this.edition = edition;
        this.price = price;
    }

    /**
     * @return String
     */
    public String getTitle() {
        return "Title Name: " + this.title;
    }

    /**
     * @return int
     */
    public String getID() {
        return "ID number: " + this.id;
    }

    /**
     * @return String
     */
    public String getEdition() {
        return "Edition : " + this.edition;
    }

    /**
     * @param returned
     */
    public void setReturnDate(String returned) {
        this.returnDate = returned;
    }

    /**
     * @param isAvailable
     */
    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    /**
     * @return boolean
     */
    public boolean getAvailability() {
        return this.isAvailable;
    }

    /**
     * @return Publisher
     */
    public Publisher getPublisher() {
        return this.publisher;
    }

    /**
     * @return String
     */
    public String getReturnDate() {
        if (isAvailable) {
            return " Is Available: " + this.returnDate;
        } else {
            Calendar date = Calendar.getInstance();
            date.setTime(new Date());
            date.add(Calendar.DAY_OF_WEEK, 14);
            return "Return Date: " + date.getTime();

        }

    }

    /**
     * @return ArrayList<Author>
     */
    public ArrayList<Author> getAuthorName() {
        return this.authors;
    }

    /**
     * @return double
     */
    public String getPrice() {
        return String.format("Price: £%.2f" , this.price);
    }

    /**
     * @return String
     */

    public String details() {
        return String.format("Paper Name: %s%nEdition: %s%nID Number: %d%nPrice: £%.2f", this.title, this.edition,
                this.id, this.price);

    }

    public boolean stringAvailabilty() {
        if (this.isAvailable == true) {
            return this.isAvailable;
        } else {
            return this.isAvailable;
        }

    }

}
