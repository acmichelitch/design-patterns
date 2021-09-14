/**
 * a specific type of HousePlan representing a Log Cabin
 * @author anna michelitch
 */
package factory;

public class LogCabinPlan extends HousePlan {
    
    /**
     * constructor for a Log Cabin HousePlan; sets specified attributes for num of rooms/windows/sq feet and calls in-class methods to fill in its materials and features
     */ 
    public LogCabinPlan() {
        super(2, 10, 1800);
        this.setMaterials();
        this.setFeatures();
    }

    /**
     * uses the add method of ArrayLists to add specific Strings representing materials to the HousePlan's materials list
     */
    protected void setMaterials() {
        materials.add("Log Siding");
        materials.add("Board and Batten Siding");
        materials.add("White Pine");
    }

    /**
     * uses the add method of ArrayLists to add Strings representing features to the HousePlan's features list
     */
    protected void setFeatures() {
        features.add("Timbered Roof");
        features.add("High Insulation");
        features.add("Rustic Effect");
    }

    /**
     * returns a formatted String containing all the information of the Log Cabin HousePlan by returning the name and calling to the superclass' toString method
     * @return String representing Log Cabin HousePlan
     */
    public String toString() {
        return "Log Cabin\n" + super.toString();
    }
}
