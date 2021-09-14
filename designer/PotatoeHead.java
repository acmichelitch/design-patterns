/**
 * builds a default potato head character without any additional features
 * @author anna michelitch
 */

package designer;

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
