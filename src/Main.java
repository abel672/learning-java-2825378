import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "What is the result of 2 + 2?";
        String choiceOne = "4";
        String choiceTwo = "5";
        String choiceThree = "6";

        String correctAnswer = choiceOne;
        boolean matched = false;

        // Write a print statement asking the question
        System.out.println(question);
        
        Scanner input;
        
        // If the user's input matches the correctAnswer...
        while (!matched) {
          // Write a print statement giving the answer choices
          System.out.println(choiceOne + " " + choiceTwo + " " + choiceThree);

          // Have the user input an answer
          input = new Scanner(System.in);
          
          // Retrieve the user's input
          String userAnswer = input.next();
          if (userAnswer.toLowerCase().equals(correctAnswer)) {
            System.out.println("Congratulations man or woman");
            matched = true;
          } else {
            System.out.println("Sorry, the correct answer was " + correctAnswer);
            System.out.println("Try again");
          }
        }
    }

}
