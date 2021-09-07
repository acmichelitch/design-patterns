/**
 * abstract class representing a character that will be made up of different sections
 * @author anna michelitch
 */

import java.util.*;

public abstract class Character {
    
    protected ArrayList<String> sections;

    /**
     * constructor for a Character object that is made of different sections
     */
    public Character()
    {
        sections = new ArrayList<String>();
    }

    public void draw()
    {
        for (String s : sections)
            System.out.println(s);
    }

}