package Code.Library;

import java.util.ArrayList;
import Code.Library.People.Author;

/**
 * <h1>The IPublication Interface</h1>
 * <p>
 * This is the interface class where the publication superclass implements. all
 * their methods been override in the publication class
 * <p>
 * <b>Copyright (c) Bournemouth University</b>
 * 
 * @author Ahmed El-Atreby
 * 
 * @version 1.0
 */

public interface IPublication {

    // Get the title of the publication
    public String getTitle();

    // Get the ID of the publication
    public String getID();

    // Get the edition of the publication
    public String getEdition();

    // Set the return date of the publication
    public void setReturnDate(String returned);

    // Set the availability of the publication
    public void setAvailability(boolean isAvailable);

    // Get the availability of the publication
    public boolean getAvailability();

    // Get the Publisher of the publication
    public Publisher getPublisher();

    // Get the return date of the publication
    public String getReturnDate();

    // Get the author name of the publication
    public ArrayList<Author> getAuthorName();

    // Get the price of the publication
    public String getPrice();

    // Get the details of the publication
    public String details();

    // Get the string availabilty of the publication
    public boolean stringAvailabilty();
}
