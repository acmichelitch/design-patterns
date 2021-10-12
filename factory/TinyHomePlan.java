/**
 * a specific type of HousePlan representing a Tiny Home
 * @author anna michelitch
 */
package factory;

public class TinyHomePlan extends HousePlan {
    
    /**
     * constructor for a Tiny Hpme HousePlan; sets specified attributes for num of rooms/windows/sq feet and calls in-class methods to fill in its materials and features
     */ 
    public TinyHomePlan() {
        super(1, 5, 200);
        this.setMaterials();
        this.setFeatures();
    }

    /**
     * uses the add method of ArrayLists to add specific Strings representing materials to the HousePlan's materials list
     */
    protected void setMaterials() {
        materials.add("Lumber");
        materials.add("Insulation");
        materials.add("Metal Roofing");
        materials.add("Hardware");
    }

    /**
     * uses the add method of ArrayLists to add Strings representing features to the HousePlan's features list
     */
    protected void setFeatures() {
        features.add("Natural Light");
        features.add("Creative Storage");
        features.add("Multipurpose areas");
        features.add("Multi-use applications");
    }

    /**
     * returns a formatted String containing all the information of the Tiny Home HousePlan by returning the name and calling to the superclass' toString method
     * @return String representing Tiny Home HousePlan
     */
    public String toString() {
        return "Tiny House\n" + super.toString();
    }
}
