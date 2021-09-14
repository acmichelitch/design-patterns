/**
 * a type of CharacterDecorator that adds a mouth to the PotatoeHead
 * @author anna michelitch
 */

package designer;

     /**
     * calls the CharacterDecorator constructor to duplicate the character to be modified and
     * then customizes a specific section to add the mouth
     * @param character the character to be customized
     */
public class Mouth extends CharacterDecorator {
    public Mouth(Character character) {
        super(character);
    }

    /**
     * modifies the String in the character's array that contains the mouth
     */
    public void customize() {
        this.sections.set(5, "  \\ ---- /");
    }
}
