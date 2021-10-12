/**
 * iterates over an array of flights for an airline
 * @author anna michelitch
 */

package iterator;

import java.util.Iterator;

public class FlightIterator implements Iterator {
    
    private Flight[] flights;
    private int position;

    /**
     * constructor for the Flight Iterator
     * @param flights the array of flights
     */
    public FlightIterator(Flight[] flights) {
        this.flights = flights;
        position = 0;
    }

    /**
     * checks whether another non-null element exists in the array
     * @return if there is another existing element that hasn't yet been returned
     */
    public boolean hasNext() {
        return (flights[position] != null);
    }

    /**
     * returns the next existing element in the array
     * @return the next element in the array that hasn't been returned yet; returns null if nothing else exists
     */
    public Flight next() {
        if (this.hasNext()) {
            position++;
            return flights[position-1];
        }
        else
            return null;
    }
}
