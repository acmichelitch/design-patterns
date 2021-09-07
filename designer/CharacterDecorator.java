

public abstract class CharacterDecorator extends Character {
   
    protected Character character;
    
    public CharacterDecorator(Character character) {
        this.character = character;
        for (int i = 0; i < 7; i++) {
            String s = character.sections.get(i);
            this.sections.add(s);
        }
        this.customize();
    }

    public abstract void customize();
}
