import java.util.Random;

/**
 * represents a Medium state for the ArithemeticGame; implements the State interface
 * @author anna michelitch
 */
public class Medium implements State {
    
    private ArithemeticGame game;

    /**
     * constructor for a medium state
     * @param game the arithmetic game to interact with this state
     */
    public Medium(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * returns a random number to be used in the arithemetic game's randomized question
     * @return random integer from [1,50]
     */
    public int getNum() {
        Random random = new Random();
        return random.nextInt(50)+1;
    }

    /**
     * returns a random operation to be used in the arithemetic game's randomized question
     * @return a String representing either +, -, or *
     */
    public String getOperation() {
        Random random = new Random();
        int operation = random.nextInt(3);
        switch (operation) {
            case 0:
                return "+";
            case 1:
                return "-";
            case 2:
                return "*";
        }
        return "";
    }

    /**
     * advances the arithemetic game to the next state (hard)
     */
    public void levelUp() {
        System.out.println("You've been advanced to the hardest mode.");
        game.setState(game.getHardState());
        return;
    }

    /**
     * moves the game to the previous state (easy)
     */
    public void levelDown() {
        System.out.println("You are struggling, let's go to easy mode.");
        game.setState(game.getEasyState());
    }

}
