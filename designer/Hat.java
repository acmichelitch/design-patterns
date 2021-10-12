/**
 * a type of CharacterDecorator that adds a hat to the PotatoeHead
 * @author anna michelitch
 */

package designer;

    /**
     * calls the CharacterDecorator constructor to duplicate the character to be modified and
     * then customizes a specific section to add the hat
     * @param character the character to be customized
     */
public class Hat extends CharacterDecorator {
    public Hat(Character character) {
        super(character);
    }
    
    /**
     * modifies the Strings in the character's array that contain the hat
     */
    public void customize() {
        this.sections.set(0, "    ____");
        this.sections.set(1, " __|____|____");
    }
}
