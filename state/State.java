import java.util.Random;

/**
 * interface for a State object to be used by the ArithemeticGame
 * @author anna michelitch
 */
public interface State {

    /**
     * gets a random integer to be used in a question's calculation; the range differs based on the current state
     * @return a random integer 
     */
    public int getNum();

    /**
     * gets a random arithemetic operation to be used in a question's calculation
     * @return either +, -, *, / based on state
     */
    public String getOperation();

    /**
     * advances the game to the next state once a certain score is reached
     */
    public void levelUp();

    /**
     * moves the game down to the previous state once a certain score is reached
     */
    public void levelDown();
}
