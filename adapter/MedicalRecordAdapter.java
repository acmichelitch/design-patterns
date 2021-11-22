import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MedicalRecordAdapter {
    private HealthRecord record;

    public MedicalRecordAdapter(HealthRecord record) {
        this.record = record;
    }

    public String getFirstName() {
        return "";
    }

    public String getLastName() {
        return "";
    }

    public Date getBirthday() {
        return null;
    }

    public Gender getGender() {
        return "";
    }

    public void addVisit(Date date, boolean well, String description) {

    }

    public ArrayList<Visit> getVisitHistory() {
        return null;
    }

    public String toString() {
        return "";
    }


}
