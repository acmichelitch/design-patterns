import java.util.Random;

/**
 * represents an Easy state for the ArithemeticGame; implements the State interface
 * @author anna michelitch
 */
public class Easy implements State {

    private ArithemeticGame game;

    /**
     * constructor for an easy state
     * @param game the arithmetic game to interact with this state
     */
    public Easy(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * returns a random number to be used in the arithemetic game's randomized question
     * @return random integer from [1,10]
     */
    public int getNum() {
        Random random = new Random();
        return random.nextInt(10)+1;
    }

    /**
     * returns a random operation to be used in the arithemetic game's randomized question
     * @return a String representing either + or -
     */
    public String getOperation() {
        Random random = new Random();
        int operation = random.nextInt(2);
        switch (operation) {
            case 0: 
                return "+";
            case 1:
                return "-";
        }
        return "";
    }

    /**
     * advances the arithemetic game to the next state (medium)
     */
    public void levelUp() {
        System.out.println("You've been advanced to medium mode.");
        game.setState(game.getMediumState());
        return;
    }

    /**
     * prints out a message; does not change states as easy is the lowest state
     */
    public void levelDown() {
        System.out.println("You seem to be struggling, you may want to study.");
    }

}
