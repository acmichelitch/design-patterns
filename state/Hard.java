import java.util.Random;

/**
 * represents a Hard state for the ArithemeticGame; implements the State interface
 * @author anna michelitch
 */
public class Hard implements State {
    
    private ArithemeticGame game;

    /**
     * constructor for a hard state
     * @param game the arithmetic game to interact with this state
     */
    public Hard(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * returns a random number to be used in the arithemetic game's randomized question
     * @return random integer from [1,100]
     */
    public int getNum() {
        Random random = new Random();
        return random.nextInt(100)+1;
    }

    /**
     * returns a random operation to be used in the arithemetic game's randomized question
     * @return a String representing either +, -, *, or /
     */
    public String getOperation() {
        Random random = new Random();
        int operation = random.nextInt(4);
        switch (operation) {
            case 0:
                return "+";
            case 1:
                return "-";
            case 2:
                return "*";
            case 3:
                return "/";
        }
        return "";
    }

    /**
     * prints a message of encouragement to the user; already at highest state so cannot advance further
     */
    public void levelUp() {
        System.out.println("You are doing so well!!!");
        return;
    }

    /**
     * moves game to the previous state (medium)
     */
    public void levelDown() {
        System.out.println("You are struggling, let's go to medium mode.");
        game.setState(game.getMediumState());
        return;
    }

}
