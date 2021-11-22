import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.zip.DataFormatException;

import javax.lang.model.util.ElementScanner14;

public class MedicalRecordAdapter implements MedicalRecord {

    private HealthRecord record;

    public MedicalRecordAdapter(HealthRecord record) {
        this.record = record;
    }

    public String getFirstName() {
        String[] fullName = record.getName().split(" ");
        return fullName[0];
    }

    public String getLastName() {
        String[] fullName = record.getName().split(" ");
        return fullName[1];
    }

    public Date getBirthday() {
        return record.getBirthdate();
    }

    public Gender getGender() {
        if (record.getGender().equalsIgnoreCase("male"))
            return Gender.MALE;
        if (record.getGender().equalsIgnoreCase("female"))
            return Gender.FEMALE;
        return Gender.OTHER;
    }

    public void addVisit(Date date, boolean well, String description) {
        record.addHistory(date, well, description);
    }

    public ArrayList<Visit> getVisitHistory() {
        
        ArrayList<String> visitHistory = record.getHistory();
        ArrayList<Visit> visits = new ArrayList<Visit>();

        //fill visits with history
        for (int i = 0; i < visitHistory.size(); i++) {
            //parse through visits and add a new visit
            String visit = visitHistory.get(i);
            String[] visitString = visit.split("\n");
            
            //parse through visits
            String dateLine = visitString[0];
            String wellLine = visitString[1];
            String commentLine = visitString[2];
            System.out.println("DATELINE: " + dateLine);
            System.out.println("WELLLINE: " + wellLine);
            System.out.println("COMMENTLINE: " + commentLine);
        }
        return visits;
    }

    public String toString() {
        String result = "***** " + record.getName() + " *****\n";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy"); //ASK PORTIA WHY dd/MM are switched in output text
        result += "Birthday: " + simpleDateFormat.format(record.getBirthdate()) + "\n";
        result += "Gender: " + record.getGender() +"\n";
        result += "Medical Visit History: \n";
        ArrayList<Visit> visits = getVisitHistory();
        //print medical visit history
        return result;
    }


}
