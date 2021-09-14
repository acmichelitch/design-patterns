/**
 * abstract class for CharacterDecorators that will modify the character's features
 * @author anna michelitch
 */

package designer;

public abstract class CharacterDecorator extends Character {
   
    protected Character character;
    
    /**
     * constructs a new modified character by duplicating the arraylist and then customizing the specified section
     * to add a new feature through a specific CharacterDecorator object
     * @param character the character to be modified
     */
    public CharacterDecorator(Character character) {
        this.character = character;
        for (int i = 0; i < 7; i++) {
            String s = character.sections.get(i);
            this.sections.add(s);
        }
        this.customize();
    }

    /**
     * abstract method that will customize a specific section of the character
     */
    public abstract void customize();
}
