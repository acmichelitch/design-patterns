/**
 * a type of CharacterDecorator that adds a nose to the PotatoeHead
 * @author anna michelitch
 */

public class Nose extends CharacterDecorator {
    
    /**
     * calls the CharacterDecorator constructor to duplicate the character to be modified and
     * then customizes a specific section to add the nose
     * @param character the character to be customized
     */
    public Nose(Character character) {
        super(character);
    }

    /**
     * modifies the String in the character's array that contains the nose
     */
    public void customize() {
        this.sections.set(4, " |   >    | ");
    }
}
