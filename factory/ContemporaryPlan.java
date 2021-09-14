package factory;

public class ContemporaryPlan extends HousePlan {
    
    public ContemporaryPlan() {
        super(5, 40, 3000);
        this.setMaterials();
        this.setFeatures();
    }

    protected void setMaterials() {
        materials.add("Ceramics");
        materials.add("High-Strength Alloys");
        materials.add("Composites");
    }

    protected void setFeatures() {
        features.add("Oversized windows");
        features.add("Unconventional Roofs");
        features.add("Minimalism");
        features.add("Open floor plan");
    }

    public String toString() {
        return "Contemporary House\n" + super.toString();
    }
}
