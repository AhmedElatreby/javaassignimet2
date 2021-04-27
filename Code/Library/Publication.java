package Code.Library;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import Code.Library.People.Author;

/**
 * <h1>The Publication Class</h1> Publication class implements from the
 * interface class IPublication.
 * <p>
 * Publication class is a super class for Paper and Book class.
 * <p>
 * <b>Copyright (c) Bournemouth University</b>
 * 
 * @author Ahmed El-Atreby
 * 
 * @version 1.0
 */

public abstract class Publication implements IPublication {

    // Create Publication class variables
    protected String title;
    private Publisher publisher;
    private int id;
    protected int isbn;
    protected ArrayList<Author> authors;
    private boolean isAvailable = true;
    protected String edition;
    protected double price;
    protected String returnDate = null;

    /**
     * Constructor method
     * 
     * @param title   the title of the publication
     * @param id      the id of the publication
     * @param isbn    the isbn of the publication
     * @param authors the authors of the publication
     * @param edition the edition of the publication
     * @param price   the price of the publication
     */
    public Publication(String title, int id, int isbn, ArrayList<Author> authors, String edition, double price) {
        this.title = title;
        this.id = id;
        this.isbn = isbn;
        this.authors = authors;
        this.edition = edition;
        this.price = price;
    }

    /**
     * Get title of the publication method
     * 
     * @return String title of the publication method
     */
    @Override
    public String getTitle() {
        return "Title Name: " + this.title;
    }

    /**
     * Get ID of the publication method
     * 
     * @return String ID of the publication method
     */
    @Override
    public String getID() {
        return "ID number: " + this.id;
    }

    /**
     * Get isbn of the publication method
     * 
     * @return String isbn of the publication method
     */
    public String getIsbn() {
        return "ISBN Number: " + this.isbn;
    }

    /**
     * Get edition of the publication method
     * 
     * @return String edition of the publication method
     */
    @Override
    public String getEdition() {
        return "Edition: " + this.edition;
    }

    /**
     * Get return date of the publication method
     * 
     * @param returned return date of the publication method
     */
    @Override
    public void setReturnDate(String returned) {
        this.returnDate = returned;
    }

    /**
     * Set availability of the publication method
     * 
     * @param isAvailable set availability of the publication method
     */
    @Override
    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    /**
     * Get availability of the publication method
     * 
     * @return boolean availability of the publication method
     */
    @Override
    public boolean getAvailability() {
        return this.isAvailable;
    }

    /**
     * Get publisher of the publication method
     * 
     * @return publisher of the publication method
     */
    @Override
    public Publisher getPublisher() {
        return this.publisher;
    }

    /**
     * Get availablity with return date of the publication method
     * 
     * @return String get availablity with return date of the publication method
     */
    @Override
    public String getReturnDate() {
        if (isAvailable) {
            return "Is Available: " + this.returnDate;
        } else {
            Calendar date = Calendar.getInstance(); // create a new varabile date
            date.setTime(new Date()); // set time and date if book not available
            date.add(Calendar.DAY_OF_WEEK, 14); // add 14 days if book not available
            return "Return Date: " + date.getTime(); // return date of the book if not available
        }
    }

    /**
     * Get author name of the publication method
     * 
     * @return ArrayList<Author>
     */
    @Override
    public ArrayList<Author> getAuthorName() {
        return this.authors;
    }

    /**
     * Get the price of the publication method
     * 
     * @return double get the price of the publication method
     */
    @Override
    public String getPrice() {
        return String.format("Price: £%.2f", this.price);
    }

    /**
     * Get the details of the publication method
     * 
     * @return String get the details of the publication method
     */
    @Override
    public String details() {
        return String.format("%s%nEdition: %s%nID Number: %d%nPrice: £%.2f", this.getTitle(), this.edition, this.id,
                this.price);

    }

    /**
     * Get availabilty of the publication method
     * 
     * @return boolean get string availabilty of the publication method
     */
    @Override
    public boolean stringAvailabilty() {
        if (this.isAvailable == true) {
            return this.isAvailable = true;
        } else {
            System.out.println(getReturnDate()); // add 14 days to return day if book is not available
            return this.isAvailable = false;

        }

    }

}
