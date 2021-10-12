/**
 * class representing an airline flight containing its specific information
 * @author anna michelitch
 */
package iterator;

public class Flight {
    
    private String flightNum;
    private String from;
    private String to;
    private int duration;
    private int transfers;

    /**
     * constructor for a Flight object
     * @param flightNum String representing the flight number
     * @param from String representing the departing destination
     * @param to String representing the arrival destination
     * @param duration the number of minutes in the flight
     * @param transfers the number of transfers/layovers of the flight
     */
    public Flight(String flightNum, String from, String to, int duration, int transfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }

    /**
     * accessor method for the departing destination
     * @return String representing the departing destination
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * accessor method for the arrival destination
     * @return String representing the arrival destination
     */
    public String getTo() {
        return this.to;
    }

    /**
     * accessor method for the number of minutes in the flight
     * @return integer representing the number of minutes in the flight
     */
    public int getDuration() {
        return this.duration;
    }

    /**
     * accessor method for the number of transfers in the flight
     * @return integer representing the number of transfers/layovers in the flight
     */
    public int getNumTransfers() {
        return this.transfers;
    }

    /**
     * returns a formatted String containing all of the flight's information
     * @return String with the Flight's specific attributes
     */
    public String toString() {
        int hr = duration/60;
        int min = duration%60;

        String ret = "Flight number: " + this.flightNum;
        ret += "\nFrom: " + this.from;
        ret += "\nTo: " + this.to;
        ret += "\nDuration: " + hr + " hours " + min + " minutes";
        
        if (this.transfers == 0)
            ret += "\nDirect Flight";
        else if (this.transfers == 1)
            ret += "\n1 Transfer";
        else
            ret += "\n" + transfers + " Transfers";

        return ret;
    }
}
