package Library;

public class Publisher 
{
    private String publisherName, date, description;

    public Publisher(String publisherName, String date, String description )
    {
        this.publisherName = publisherName;
        this.date = date;
        this.description = description;
    }

    public String getPublisherName()
    {
        return "Publisher name: " + this.publisherName;

    }
    public String getPublisherDate()
    {
        return "Publisher DOB: " + this.date;
    }

    public String getPublisherDescription()
    {
        return "Publisher Description: " + (this.description != null ? this.description : "No description set");
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
}


