//Write a guessing game program. The program should pick a random integer from 1 to 100. Then it asks the user for a number and says too low, too high, or correct. The user should be able to keep entering numbers until he/she answers correctly.


package GuessNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int target = (int) (Math.random() * 100) + 1;
        int guess;
        
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");
        
        while (true) {
            System.out.print("Enter your guess: ");
            guess = scan.nextInt();
            
            if (guess < target) {
                System.out.println("Too low! Try again.");
            } else if (guess > target) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Correct! The number was " + target);
                break;
            }
        }
    }
}
