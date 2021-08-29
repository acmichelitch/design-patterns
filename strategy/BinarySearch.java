/**
 * creates a specific search behavior that utilizes a binary search algorithm
 * @author anna michelitch
 */

package strategy;

import java.util.*;

public class BinarySearch implements SearchBehavior {


    /**
     * @Override implementing a binary search method in the SearchBehavior interface
     * searches through an array list of names for a specific name
     * @param data the array list of names
     * @param item the target name to search for
     * @return whether the name was present in the list
     */
    public boolean contains(ArrayList<String> data, String item)
    {
        Collections.sort(data);

        int left = 0;
        int right = data.size()-1;

        while (left <= right)
        {
            int mid = (right-left)/2 + left;

            //case: the name was found at the middle of the list
            if (data.get(mid).compareToIgnoreCase(item) == 0)
                return true;
            //case: the middle name in the list is lower than the target name; ignore the left
            else if (data.get(mid).compareToIgnoreCase(item) < 0)
                left = mid + 1;
            //case: the middle name in the list is higher than the target name; ignore the right half
            else if (data.get(mid).compareToIgnoreCase(item) > 0)
                right = mid - 1;
        }
        
        return false;
    }
}