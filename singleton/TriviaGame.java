/**
 * represents a game of trivia that randomly generates questions until the user wishes to exit the program; questions are read in from a .txt file and parsed through the DataLoader class provided through the assignment.
 * @author anna michelitch
 */

package singleton;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class TriviaGame {

    private static TriviaGame triviaGame;
    private int score;
    private Random rand;
    private Scanner reader;
    private ArrayList<Question> questions;

    /**
     * constructor for a new TriviaGame
     * private constructor can only be referred to by the static getInstance() to ensure there is never more than one instance of a TriviaGame
     * creates new DataLoader, loads questions from the questions.txt file, initializes Random and Scanner, and welcomes user to game
     */
    private TriviaGame() {
        DataLoader data = new DataLoader();
        this.questions = data.getTriviaQuestions();
        rand = new Random();
        reader = new Scanner(System.in);
        System.out.println("Welcome to the trivia game!");
    }

    /**
     * creates a new TriviaGame object; if one already exists, returns the existing instance
     * @return new TriviaGame object if one does not exist or the existing TriviaGame
     */
    public static TriviaGame getInstance() {
        if (triviaGame == null)
            triviaGame = new TriviaGame();
        return triviaGame;
    }

    /**
     * initializes user score to 0 and continues to play game in a for-loop based on user input until user enters 'q' to quit
     * keeps track of the user's score based on rounds won and when game ends, prints out the score
     */
    public void play() {
        boolean play = true;
        score = 0;
        while (play) {
            System.out.print("Would you like to (P)lay or (Q)uit: ");
            String answer = reader.next();
            if (answer.equalsIgnoreCase("p")) {
                if (playRound())
                    score++;
            }
            else if (answer.equals("q")) {
                System.out.println("You won " + score + " games!");
                System.out.println("Goodbye");
                play = false;
            }
            else
                System.out.println("Invalid input.");
        }

        
    }

    /**
     * accessed only through the play() method; provides a round of the trivia game for the user to play
     * gets a random question from the arraylist of questions, displays it to user, and checks if user's answer was correct
     * @return true if the user entered the correct answer or false if the user entered an incorrect answer
     */
    private boolean playRound() {
        int questionNumber = rand.nextInt(this.questions.size());
        Question q = this.questions.get(questionNumber);
        System.out.println(q);
        System.out.print("\nEnter answer: ");
        int ans = reader.nextInt();
        if (q.isCorrect(ans)) {
            System.out.println("YAY! You got it right!");
            return true;
        }
        System.out.println("You got it wrong!");
        System.out.println("The correct answer is " + q.getCorrectAnswer());
        return false;
    }

}
