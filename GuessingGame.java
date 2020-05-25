import java.util.*;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // part a
        int randInt = (int) (Math.random()*10);
        
        // part b
        for(int i = 0; i < 5; i++) {
            System.out.print("Please guess a number: ");
            int guess = input.nextInt();
            if(guess == randInt) {
                // part c
                System.out.println("Congratulations! You guessed correctly!");
                break;
            } else {
                System.out.println("Incorrect answer, please try again");
            }
        }
        
        // part d
        randInt = (int) (Math.random()*20);
        for(int i = 0; i < 5; i++) {
            System.out.print("Please guess a number: ");
            int guess = input.nextInt();
            if(guess == randInt) {
                System.out.println("Congratulations! You guessed correctly!");
                break;
            } else {
                System.out.println("Incorrect answer, please try again");
                if(guess < randInt) {
                    System.out.println("Guess higher");
                } else {
                    System.out.println("Guess lower");
                }
            }
        }
    }
}