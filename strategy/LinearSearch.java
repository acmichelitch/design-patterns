/**
 * Represents a linear search that iterates through every element in the array list
 * and checks to see if it matches the target value
 * @author anna michelitch
 */

package strategy;

import java.util.ArrayList;

public class LinearSearch implements SearchBehavior {

    /**
     * @Override implementing a linear search method in the SearchBehavior interface
     * searches through an array list of names for a specific name
     * @param data the array list of names
     * @param item the target name to search for
     * @return whether the name was present in the list
     */
    public boolean contains(ArrayList<String> data, String item) {
        for (int i = 0; i < data.size(); i++)
        {
           if (data.get(i).equalsIgnoreCase(item))
            return true;
        }
        return false;
    }
}