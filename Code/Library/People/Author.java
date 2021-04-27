package Code.Library.People;

/**
 * <h1>The Author Class</h1> Author class hold information such as author name
 * and their DOB.
 * <p>
 * <b>Copyright (c) Bournemouth University</b>
 * 
 * @author Ahmed El-Atreby
 * 
 * @version 1.0
 */

public class Author {

    // Create Author class variables
    private String authorName, DOB;

    /**
     * Constructor method
     * 
     * @param authorName the name of the author
     * @param DOB        of the author
     */
    public Author(String authorName, String DOB) {
        this.authorName = authorName;
        this.DOB = DOB;
    }

    /**
     * Get author name method
     * 
     * @return String the author name
     */
    public String getAuthorName() {

        return "Author Name: " + this.authorName;
    }

    /**
     * Get author's DOB method
     * 
     * @return String the aothor DOB
     */
    public String getDOB() {
        return "Author DOB: " + this.DOB;
    }

    /**
     * Get author details method
     * 
     * @return String the author details
     */
    public String getAuthorDetails() {
        return getAuthorName() + "\n" + getDOB();
    }
}
