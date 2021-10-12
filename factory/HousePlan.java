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

    /**
     * constructor that creates a new HousePlan and defines its attributes through parameters and sets up arrayLists to be filled with materials and features
     * @param numRooms the number of rooms in the house
     * @param numWindows the number of windows in the house
     * @param squareFeet the number of square feet of the house
     */
    public HousePlan(int numRooms, int numWindows, int squareFeet) {
        materials = new ArrayList<String>();
        features = new ArrayList<String>();
        this.numRooms = numRooms;
        this.numWindows = numWindows;
        this.squareFeet = squareFeet;
    }

    /**
     * abstract method that will fill the array list of materials based on the type of House
     */
    protected abstract void setMaterials();

    /**
     * abstract method that will fill the array list of features based on the type of House
     */
    protected abstract void setFeatures();

    /**
     * accessor method that returns the list of materials used in the HousePlan
     * @return arrayList of Strings representing materials
     */
    public ArrayList<String> getMaterials() {
        return this.materials;
    }

    /**
     * accessor method that returns the list of special features of the HousePlan
     * @return arrayList of Strings representing features
     */
    public ArrayList<String> getFeatures() {
        return this.features;
    }

    /**
     * accessor method that returns the number of rooms in the specific HousePlan
     * @return integer representing number of rooms
     */
    public int getNumRooms() {
        return this.numRooms;
    }

    /**
     * accessor method that returns the number of windows in the specific HousePlan
     * @return integer representing number of windows
     */
    public int getNumWindows() {
        return this.numWindows;
    }

    /**
     * accessor method that returns the number of square feet in the specific HousePlan
     * @return integer representing square footage
     */
    public int getSquareFeet() {
        return this.squareFeet;
    }

    /**
     * returns a String representation of the HousePlan listing all of its attributes
     * @return String containing square footage, windows, rooms, materials, and features
     */
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
