/**
 * a specific type of HousePlan representing a Contemporary House
 * @author anna michelitch
 */
package factory;

public class ContemporaryPlan extends HousePlan {
    
    /**
     * constructor for a Contemporary Home HousePlan; sets specified attributes for num of rooms/windows/sq feet and calls in-class methods to fill in its materials and features
     */ 
    public ContemporaryPlan() {
        super(5, 40, 3000);
        this.setMaterials();
        this.setFeatures();
    }

    /**
     * uses the add method of ArrayLists to add specific Strings representing materials to the HousePlan's materials list
     */
    protected void setMaterials() {
        materials.add("Ceramics");
        materials.add("High-Strength Alloys");
        materials.add("Composites");
    }

    /**
     * uses the add method of ArrayLists to add Strings representing features to the HousePlan's features list
     */
    protected void setFeatures() {
        features.add("Oversized windows");
        features.add("Unconventional Roofs");
        features.add("Minimalism");
        features.add("Open floor plan");
    }

    /**
     * returns a formatted String containing all the information of the Contemporary Home HousePlan by returning the name and calling to the superclass' toString method
     * @return String representing Contemporary Home HousePlan
     */
    public String toString() {
        return "Contemporary House\n" + super.toString();
    }
}
