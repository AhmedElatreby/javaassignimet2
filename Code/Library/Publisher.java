package Code.Library;

public class Publisher 
{
    private String publisherName, date, description;

    public Publisher(String publisherName, String date, String description )
    {
        this.publisherName = publisherName;
        this.date = date;
        this.description = description;
    }

    
    /** 
     * @return String
     */
    public String getPublisherName()
    {
        return "Publisher name: " + this.publisherName;

    }
    
    /** 
     * @return String
     */
    public String getPublisherDate()
    {
        return "Publisher DOB: " + this.date;
    }

    
    /** 
     * @return String
     */
    public String getPublisherDescription()
    {
        return "Publisher Description: " + (this.description != null ? this.description : "No description set");
    }

    
    /** 
     * @param description
     */
    public void setDescription(String description)
    {
        this.description = description;
    }
}


