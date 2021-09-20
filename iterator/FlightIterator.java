/**
 * iterates over an array of flights for an airline
 * @author anna michelitch
 */

package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class FlightIterator implements Iterator {
    
    private Flight[] flights;
    private int position;

    /**
     * constructor for the Flight Iterator
     * @param flights
     */
    public FlightIterator(Flight[] flights) {
        this.flights = flights;
        position = 0;
    }

    public boolean hasNext() {
        if (flights[position] == null)
            return false;
        return true;
    }

    public Flight next() {
        if (this.hasNext()) {
            position++;
            return flights[position-1];
        }
        else
            return null;
    }
}
