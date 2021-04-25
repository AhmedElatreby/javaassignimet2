package Code.Library.People;

import java.util.ArrayList;

import Code.Library.Publisher;

public interface IPublication {
    public String getTitle();
    public String getID();
    public String getEdition();
    public void setReturnDate(String returned);
    public void setAvailability(boolean isAvailable);
    public boolean getAvailability();
    public Publisher getPublisher();
    public String getReturnDate();
    public ArrayList<Author> getAuthorName();
    public String getPrice();
    public String details();
    public boolean stringAvailabilty();
}
