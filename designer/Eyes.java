/**
 * a type of CharacterDecorator that adds eyes to the PotatoeHead
 * @author anna michelitch
 */
public class Eyes extends CharacterDecorator {

     /**
     * calls the CharacterDecorator constructor to duplicate the character to be modified, and
     * then customizes a specific section to add the eyes
     * @param character the character to be customized
     */
    public Eyes(Character character) {
        super(character);
    }

    /**
     * modifies the String in the character's array that contains the eyes
     */
    public void customize() {
        this.sections.set(3, " |  o  o  | ");
    }
}
