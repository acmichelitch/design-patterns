/**
 * supporter class that gives a HealthRecord object the same behaviors as a MedicalRecord object
 * @author anna michelitch
 * completed 11/24/2021
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.zip.DataFormatException;

import javax.lang.model.util.ElementScanner14;

public class MedicalRecordAdapter implements MedicalRecord {

    private HealthRecord record;

    /**
     * constructor for MedicalRecordAdapter
     * @param record the HealthRecord object to be adapted into a MedicalRecord
     */
    public MedicalRecordAdapter(HealthRecord record) {
        this.record = record;
    }

    /**
     * parses the HealthRecord's name to return first name
     * @return first name
     */
    public String getFirstName() {
        String[] fullName = record.getName().split(" ");
        return fullName[0];
    }

    /**
     * parses the HealthRecord's name to return last name
     * @return last name
     */
    public String getLastName() {
        String[] fullName = record.getName().split(" ");
        return fullName[1];
    }

    /**
     * accessor for birthday
     * @return Date object representing birthday
     */
    public Date getBirthday() {
        return record.getBirthdate();
    }

    /**
     * reads the health record's gender and returns the corresponding Gender emulation
     * @return enum of the person's gender
     */
    public Gender getGender() {
        if (record.getGender().equalsIgnoreCase("male"))
            return Gender.MALE;
        if (record.getGender().equalsIgnoreCase("female"))
            return Gender.FEMALE;
        return Gender.OTHER;
    }

    /**
     * adds a new visit to the person's medical history
     * @param date the date of the visit
     * @param well boolean representing whether the visit was well or not (sick)
     * @param description a comment describing the visit
     */
    public void addVisit(Date date, boolean well, String description) {
        record.addHistory(date, well, description);
    }

    /**
     * parses through the HealthRecord's arraylist of strings to extract the correct information from each visit and creates a corresponding arraylist of Visits
     * @return an arraylist of Visit objects representing the visit history
     */
    public ArrayList<Visit> getVisitHistory() {
        
        ArrayList<String> visitHistory = record.getHistory();
        ArrayList<Visit> visits = new ArrayList<Visit>();

        //fill visits with history
        for (int i = 0; i < visitHistory.size(); i++) {
            //parse through visits and add a new visit
            String visit = visitHistory.get(i);
            String[] visitString = visit.split("\n");

            //get date
            String dateLine = visitString[0];
            SimpleDateFormat formatter = new SimpleDateFormat("E dd, MM, yyyy");
            String[] dateLineArr = dateLine.split(": ");
            Date date = null;
            try {
            date = formatter.parse(dateLineArr[1]);
            }
            catch (ParseException e) {
                e.printStackTrace();
            }
            
            //get boolean well/sick
            String wellLine = visitString[1];
            String[] wellLineArr = wellLine.split(": ");
            boolean well = Boolean.parseBoolean(wellLineArr[1]);

            //get comments
            String commentLine = visitString[2];
            String[] commentLineArr = commentLine.split(": ");
            String comment = commentLineArr[1];

            visits.add(new Visit(date, well, comment));
        }
        return visits;
    }

    /**
     * converts the HealthRecord's information into a string matching the MedicalRecord format
     * @return string representing all of the information
     */
    public String toString() {
        String result = "***** " + record.getName() + " *****\n";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy"); //ASK PORTIA WHY dd/MM are switched in output text
        result += "Birthday: " + simpleDateFormat.format(record.getBirthdate()) + "\n";
        result += "Gender: " + record.getGender() +"\n";
        result += "Medical Visit History: \n";

        ArrayList<Visit> visits = getVisitHistory();
        if (visits.size() == 0) {
            result += "No visits yet";
        }
        else {
            for (Visit visit : visits) {
                result += visit.toString() + "\n";
            }
        }
        return result;
    }


}
