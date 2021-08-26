/**
 * creates a guest list of people
 * @author anna michelitch 
 */

package strategy;

import java.util.*;

public class GuestList {

    private String title; 
    private ArrayList<String> people;
    private SearchBehavior searchBehavior; 


    /**
     * creates a default guest list
     */
    public GuestList() 
    {
        title = "default";
        people = new ArrayList<String>();
        searchBehavior = new LinearSearch();
    }

    /**
     * creates a guest list with the indicated title
     * @param t the name of the guest list
     */
    public GuestList(String t) {
        title = t;
        people = new ArrayList<String>();
        searchBehavior = new LinearSearch();
    }

    /**
     * adds a name to the guest list if it does not exist
     * @param person name to add to guest list
     * @return whether name exists in guest list
     */
    public boolean add(String person)
    {
        if (searchBehavior.contains(people, person))
            return false;
        people.add(person);
        return true;
    }

    /**
     * removes a name from the guest list if it exists
     * @param person the target name to remove
     * @return whether the name existed in list or not
     */
    public boolean remove(String person)
    {
        if (searchBehavior.contains(people, person))
            {
                people.remove(person);
                return true;
            }
        return false;
    }

    /**
     * accessor method for title of guest list
     * @return string representing title of guest list
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * sets a new search behavior
     * @param sb type of search behavior
     */
    public void setSearchBehavior(SearchBehavior sb)
    {
        searchBehavior = sb;
    }

    /**
     * returns the list of names
     * @return an array list of strings representing names
     */
    public ArrayList<String> getList()
    {
        return people;
    }
}
