public class Nose extends CharacterDecorator {
    
    public Nose(Character character) {
        super(character);
    }

    public void customize() {
        this.sections.set(4, " |   >    | ");
    }
}
