package iterator;

public class Airline {

    private String title;
    private Flight[] flights;
    private int size;

    public Airline(String title) {
        this.title = title;
        flights = new Flight[2];
        this.size = 0;
    }

    public void addFlight(String flightNum, String from, String to, int duration, int transfers) {
        Flight newFlight = new Flight(flightNum, from, to, duration, transfers);
        if (size+1 == flights.length)
            this.flights = growArray(flights);
        flights[size] = newFlight;
        size++;
    }

    public String getTitle() {
        return this.title;
    }

    public Flight[] growArray(Flight[] flights) {
        int length = flights.length * 2;
        Flight[] moreFlights = new Flight[length];
        for (int i = 0; i < this.size; i++) {
            moreFlights[i] = flights[i];
        }
        return moreFlights;
    }

    public FlightIterator createIterator() {
        return new FlightIterator(flights);
    }
}
