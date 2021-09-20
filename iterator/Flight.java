package iterator;

import javax.lang.model.util.ElementScanner14;

public class Flight {
    
    private String flightNum;
    private String from;
    private String to;
    private int duration;
    private int transfers;

    public Flight(String flightNum, String from, String to, int duration, int transfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }

    public String getFrom() {
        return this.from;
    }

    public String getTo() {
        return this.to;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getNumTransfers() {
        return this.transfers;
    }

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
