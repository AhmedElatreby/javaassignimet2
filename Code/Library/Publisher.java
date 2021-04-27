package Code.Library;

/**
 * <h1>The Publisher Class</h1> Publisher class hold information such as
 * publisher name, DOB and description.
 * <p>
 * <b>Copyright (c) Bournemouth University</b>
 * 
 * @author Ahmed El-Atreby
 * 
 * @version 1.0
 */
public class Publisher {
    // Create Publisher class variables
    private String publisherName, date, description;

    /**
     * Constructor method
     * 
     * @param publisherName the publisher name of the Publisher
     * @param date          the date of the Publisher
     * @param description   the description of the Publisher
     */
    public Publisher(String publisherName, String date, String description) {
        this.publisherName = publisherName;
        this.date = date;
        this.description = description;
    }

    /**
     * Get publisher name of the Publisher method
     * 
     * @return String the name of the publisher
     */
    public String getPublisherName() {
        return "Publisher name: " + this.publisherName;

    }

    /**
     * Get publisher DOB of the Publisher method
     * 
     * @return String the DOB of the publisher
     */
    public String getPublisherDate() {
        return "Publisher DOB: " + this.date;
    }

    /**
     * Get publisher description of the publisher method
     * 
     * @return String the description of the publisher
     */
    public String getPublisherDescription() {
        return "Publisher Description: " + (this.description != null ? this.description : "No description set");
    }

    /**
     * Set description of the publisher method
     * 
     * @param description set description of the publisher method
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
