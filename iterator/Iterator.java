/**
 * interface for an iterator that will traverse and return information about the contents of an array
 * @author anna michelitch
 */

package iterator;

public interface Iterator {

    /**
     * checks for any remaining elements in an array to iterate over
     * @return whether there is another non-null element in the array
     */
    public boolean hasNext();

    /**
     * returns the next element in the array if it exists
     * @return the contents of the next position of the array
     */
    public Object next();
}