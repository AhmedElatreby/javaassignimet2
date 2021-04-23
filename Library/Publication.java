package Library;

import java.util.ArrayList;

import Library.People.Author;

// FIRST I UNIMPLEMENTED THE INTERFACE SO IT IS EASIER TO MANIPULATE EVERYTHING ELSE
// DEFINE ALL OF THE GENERAL PURPOSE METHODS IN THIS CLASS NOT IN THE CHILDREN, KEEP THE CODE DRY
// REMOVED THE ENUM FOR AVAILABILITY AND REPLACED IT WITH A BOOLEAN

public abstract class Publication {

    // create variables
    private String title;
    private Publisher publisher;
    private int id;
    private ArrayList<Author> authors;
    private boolean isAvailable = true;
    protected String edition;
    private double price;
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
        return "Availability: " + this.isAvailable != null;
    }

    
    /** 
     * @return Publisher
     */
    public Publisher getPublisher() {
        return  this.publisher;
    }

    
    /** 
     * @return String
     */
    public String getReturnDate() {
        
        return "Return Date: " +  this.returnDate;
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
    public double getPrice() {
        return this.price;
    }

    /**
     * @return String
     */

    public String details() {
        return String.format("Edition: %s%nPaper Name: %s%nID Number: %d%nPrice: £%.2f", this.edition, this.title,
                this.id, this.getPrice());

    }
}
