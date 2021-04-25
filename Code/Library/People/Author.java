package Code.Library.People;

// this class hold information about the Author
public class Author {

    private String authorName, DOB;

    public Author(String authorName, String DOB) {
        this.authorName = authorName;
        this.DOB = DOB;
    }

    /**
     * @return String
     */
    public String getAuthorName() {
        
        return "Author Name: " + this.authorName;
    }

    /**
     * @return String
     */
    public String getDOB() {
        return "Author DOB: " + this.DOB;
    }

    public String getAuthorDetails() {
        return getAuthorName() + "\n" + getDOB();
    }
}
