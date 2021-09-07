/**
 * builds a default potato head character without any features by extending the character class
 * @author anna michelitch
 */

public class PotatoeHead extends Character {
    
    /**
     * constructor for the PotatoeHead; adds the default sections to build the head
     */
    public PotatoeHead() {
        super();
        this.sections.add(" ");
        this.sections.add("    ____");
        this.sections.add("  /      \\ ");
        this.sections.add(" |        | ");
        this.sections.add(" |        | ");
        this.sections.add("  \\      / ");
        this.sections.add("   \\____/ ");
    }

}