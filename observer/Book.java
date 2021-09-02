/**
 * a book with a title and an author
 * @author anna michelitch
 */

package observer;

public class Book {

    private String title;
    private String authorFirstName;
    private String authorLastName;

    /**
     * constructor for a book
     * @param title the title of the book
     * @param authorFirstName the first name of the book's author
     * @param authorLastName the last name of the book's author
     */
    public Book(String title, String authorFirstName, String authorLastName) {
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

    /**
     * accessor
     * @return the title of the book
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * accessor
     * @return the author's first name
     */
    public String getAuthorFirstName() {
        return this.authorFirstName;
    }

    /**
     * accessor
     * @return the author's last name
     */
    public String getAuthorLastName() {
        return this.authorLastName;
    }

    /**
     * converts the book to a String
     * @return the book's title and the author
     */
    public String toString() {
        return this.title + " by: " + this.authorFirstName + " " + this.authorLastName;
    }
}
