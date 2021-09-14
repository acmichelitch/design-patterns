/**
 * abstract class representing a character that will be visually made up of different Strings, called sections
 * @author anna michelitch
 */

 package designer;

import java.util.*;

public abstract class Character {
    
    protected ArrayList<String> sections;

    /**
     * constructor for a Character object that is made of different Strings (sections) in an array list
     */
    public Character()
    {
        sections = new ArrayList<String>();
    }

    /**
     * prints out the Character to the console by looping through sections in the array list
     */
    public void draw()
    {
        for (String s : sections)
            System.out.println(s);
    }

}