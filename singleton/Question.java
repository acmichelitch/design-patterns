/**
 * represents a single question in a trivia game with four potential answers and one correct answer
 * @author anna michelitch
 */

package singleton;

public class Question {
    
    private String question;
    private String[] answers;
    private int correctAnswer;

    /**
     * constructor for a Question
     * @param question String representing the trivia question
     * @param ans1 String representing first possible answer; index 0
     * @param ans2 String representing second possible answer; index 1
     * @param ans3 String representing third possible answer; index 2
     * @param ans4 String representing fourth possible answer; index 3
     * @param correctAnswer int representing which answer [0-3] is the correct one
     */
    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer) {
        answers = new String[4];
        this.question = question;
        answers[0] = ans1;
        answers[1] = ans2;
        answers[2] = ans3;
        answers[3] = ans4;
        this.correctAnswer = correctAnswer;
    }

    /**
     * returns a formatted String to be used to display the question to the console
     * @return the question to be answered followed by the four potential answers numbered 1-4
     */
    public String toString() {
        String ret = question;
        ret += "\n1. " + answers[0];
        ret += "\n2. " + answers[1];
        ret += "\n3. " + answers[2];
        ret += "\n4. " + answers[3];
        return ret;
    }

    /**
     * checks to see if the user answer is the same as the correct answer;
     * user was prompted to enter [1-4] and index of correctAnswer in answers array is [0-3]
     * @param userAnswer the number [1-4] that was entered by the user
     * @return whether the user's answer was correct or not
     */
    public boolean isCorrect(int userAnswer) {
        return userAnswer-1 == correctAnswer;
    }

    /**
     * returns the String located at the index of the correct answer in the answers array
     * @return String of only the correct answer
     */
    public String getCorrectAnswer() {
        return answers[correctAnswer];
    }

}
