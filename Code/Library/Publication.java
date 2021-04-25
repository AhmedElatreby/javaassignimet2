package Code.Library;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import Code.Library.People.Author;
import Code.Library.People.IPublication;

public abstract class Publication  implements IPublication{

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
    @Override
    public String getTitle() {
        return "Title Name: " + this.title;
    }

    /**
     * @return int
     */
    @Override
    public String getID() {
        return "ID number: " + this.id;
    }

    /**
     * @return String
     */
    @Override
    public String getEdition() {
        return "Edition : " + this.edition;
    }

    /**
     * @param returned
     */
    @Override
    public void setReturnDate(String returned) {
        this.returnDate = returned;
    }

    /**
     * @param isAvailable
     */
    @Override
    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    /**
     * @return boolean
     */
    @Override
    public boolean getAvailability() {
        return this.isAvailable;
    }

    /**
     * @return Publisher
     */
    @Override
    public Publisher getPublisher() {
        return this.publisher;
    }

    /**
     * @return String
     */
    @Override
    public String getReturnDate() {
        if (isAvailable) {
            return "Is Available: " + this.returnDate;
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
    @Override
    public ArrayList<Author> getAuthorName() {
        return this.authors;
    }

    /**
     * @return double
     */
    @Override
    public String getPrice() {
        return String.format("Price: £%.2f", this.price);
    }

    /**
     * @return String
     */
    @Override
    public String details() {
        return String.format("%s%nEdition: %s%nID Number: %d%nPrice: £%.2f", this.getTitle(), this.edition, this.id,
                this.price);

    }

    
    /** 
     * @return boolean
     */
    @Override
    public boolean stringAvailabilty() {
        if (this.isAvailable == true) {
            return this.isAvailable = true;
        } else {
            System.out.println(getReturnDate());
            return  this.isAvailable = false;

        }

    }

}
