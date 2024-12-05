import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class SubtractionQuizLoop{
    static void game() {
        final int NUMBER_OF_QUESTIONS = 5; // Number of questions
        int correctCount = 0; // Count the number of correct answers
        int count = 0; // Count the number of questions
        long startTime = System.currentTimeMillis();
        String output = ""; // output string is initially empty
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) {
            // 1. Generate two random single-digit integers
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);
            // 2. If number1 < number2, swap number1 with number2
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            // 3. Prompt the student to answer "What is number1 - number2?"
            System.out.print( "What is " + number1 + " - " + number2 + "? ");
            int answer = input.nextInt();
            // 4. Grade the answer and display the result
            if (number1 - number2 == answer) {
                System.out.println("You are correct!");
                correctCount++;
            } else
                System.out.println("Your answer is wrong.\n" + number1
                        + " - " + number2 + " should be " + (number1 - number2));
            // Increase the count
            count++;
            output += "\n" + number1 + "-" + number2 + "=" + answer +
                    ((number1 - number2 == answer) ? " correct" : " wrong");
        }
        System.out.println(output);
        System.out.println(correctCount + " correct answers");



    }
    public static void main(String[] args) {
        char newGame = 'Y';

        while(Character.toLowerCase(newGame) == 'y') {
            game();
            System.out.println("Play again? [y/n]");
            Scanner sc = new Scanner(System.in);
            newGame = sc.next().charAt(0);
        }




    }
}


