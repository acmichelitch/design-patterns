import java.util.Scanner;

/**
 * represents an arithemetic game that has three different levels (states) and interacts with the user based on its current mode
 * @author anna michelitch
 */
public class ArithemeticGame {
    
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;
    private Scanner reader;

    /**
     * constructor that initializes the attributes, sets the initial current state to easy, and sets score to 0
     */
    public ArithemeticGame() {
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        state = easyState;
        reader = new Scanner(System.in);
        score = 0;
    }

    /**
     * gets two numbers and an operation based on the game's current difficulty level, presents the question to the user, and checks their input
     * if user input is correct, score is increased; if score reaches 3, then the game is leveled up
     * if user input is false, score is decreased; if score reaches -3, then the game is leveled down
     * if user inputs anything other than an integer, the method prints out an error message and terminates
     */
    public void pressQuestionButton() {
        int num1 = state.getNum();
        int num2 = state.getNum();
        String operation = state.getOperation();
        System.out.print(num1 + " " + operation + " " + num2 + ": ");
        String input = reader.nextLine();
        int userAnswer = 0;

        //finding the correct answer
        int answer = 0;
        switch (operation) {
            case "+":
                answer = num1 + num2;
                break;
            case "-":
                answer = num1 - num2;
                break;
            case "*":
                answer = num1 * num2;
                break;
            case "/":
                answer = (int)(num1 / num2);
                break;
        }

        //error catching in case of invalid input
        try {
            userAnswer = Integer.parseInt(input);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid input; you must enter an integer.");
            return;
        }

        //checking user's answer
        if (userAnswer == answer) {
            score++;
            System.out.println("Correct");
        }
        else {
            score--;
            System.out.println("Incorrect");
        }
        
        //checking to see if game should level up/down
        if (score >= 3) {
            state.levelUp();
            score = 0;
        }
        if (score <= -3) {
            state.levelDown();
            score = 0;
        }
    }

    /**
     * changes the game's current mode of difficult to the given state
     * @param state the new state to update the game to
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * getter for an Easy state object
     * @return the game's easy state
     */
    public State getEasyState() {
        return this.easyState;
    }

    /**
     * getter for a Medium state object
     * @return the game's medium state
     */
    public State getMediumState() {
        return this.mediumState;
    }

    /**
     * getter for a Hard state object
     * @return the game's hard state
     */
    public State getHardState() {
        return this.hardState;
    }
}
