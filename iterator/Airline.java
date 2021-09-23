/**
 * represents an Airline containing a list of flights
 * @author anna michelitch
 */
package iterator;

public class Airline {

    private String title;
    private Flight[] flights;
    private int size;

    /**
     * constructor for an airline that contains an array of flights
     * @param title the name of the airline company
     */
    public Airline(String title) {
        this.title = title;
        flights = new Flight[2];
        this.size = 0;
    }

    /**
     * adds a new flight to the current array of flights in the airline; calls the growArray() function if the array is already full
     * @param flightNum String representing the flight number of the new flight
     * @param from String representing the departing destination
     * @param to String representing the arrival destination
     * @param duration number of minutes of the duration of the flight
     * @param transfers number of layovers/transfers in the flight
     */
    public void addFlight(String flightNum, String from, String to, int duration, int transfers) {
        Flight newFlight = new Flight(flightNum, from, to, duration, transfers);
        if (size+1 == flights.length)
            this.flights = growArray(flights);
        flights[size] = newFlight;
        size++;
    }

    /**
     * accessor method for the name of the airline
     * @return String representing the name of the airline
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * creates a new array of flights that is twice the size of the existing array and copies over all of the existing elements
     * @param flights the existing array of flights
     * @return a new array of flights that is twice the size of the existing array and contains all the elements of the previous array
     */
    public Flight[] growArray(Flight[] flights) {
        int length = flights.length * 2;
        Flight[] moreFlights = new Flight[length];
        for (int i = 0; i < this.size; i++) {
            moreFlights[i] = flights[i];
        }
        return moreFlights;
    }

    /**
     * creates a new iterator that will iterate over an array of flights
     * @return a new flight iterator object
     */
    public FlightIterator createIterator() {
        return new FlightIterator(flights);
    }
}
