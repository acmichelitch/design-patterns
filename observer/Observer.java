/**
 * interface for an observer that will respond when a book is added to the best seller list
 * @author anna michelitch
 */

package observer;

public interface Observer {
    /**
     * updates the observers that the best seller list was updated
     * @param book the book to be added to the best seller list
     */
    public void update(Book book);

    /**
     * prints out the contents of the observer's list
     */
    public void display();
}
