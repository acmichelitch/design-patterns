/**
 * interface for a search behavior traversing a guest list of names
 * @author anna michelitch
 */

package strategy;

import java.util.*;

public interface SearchBehavior {

    /**
     * searches through a list of names for the specified term
     * @param data the array list of names on the guest list
     * @param item the target name to be searched for in the guest list
     * @return whether the target name was found in the list or not
     */
    public boolean contains(ArrayList<String> data, String item);
}