/**
 * abstract class to represent a HousePlan; specific HousePlans have different features including
 * materials used, rooms/windows/square footage, features, etc
 * @author anna michelitch
 */

package factory;

import java.util.ArrayList;

public abstract class HousePlan {

    protected ArrayList<String> materials;
    protected ArrayList<String> features;
    private int numRooms;
    private int numWindows;
    private int squareFeet;

    public HousePlan(int numRooms, int numWindows, int squareFeet) {
        materials = new ArrayList<String>();
        features = new ArrayList<String>();
        this.numRooms = numRooms;
        this.numWindows = numWindows;
        this.squareFeet = squareFeet;
    }

    protected abstract void setMaterials();

    protected abstract void setFeatures();

    public ArrayList<String> getMaterials() {
        return this.materials;
    }

    public ArrayList<String> getFeatures() {
        return this.features;
    }

    public int getNumRooms() {
        return this.numRooms;
    }

    public int getNumWindows() {
        return this.numWindows;
    }

    public int getSquareFeet() {
        return this.squareFeet;
    }

    public String toString() {
        String ret = "Square Feet: " + this.squareFeet;
        ret += "\nRoom: " + this.numRooms;
        ret += "\nWindows " + this.numWindows;
        ret += "\n\nMaterials: ";
        for (int i = 0; i < this.materials.size(); i++) {
            ret += "\n- ";
            ret += materials.get(i);
        }
        ret += "\n\nFeatures:";
        for (int j = 0; j < this.features.size(); j++) {
            ret += "\n- ";
            ret += features.get(j);
        }
        return ret + "\n";
    }
}
