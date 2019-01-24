import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int numberToGuess;
        boolean found;
        boolean again;
        String response;
        int attempts;
        boolean surrender;
        
        again = true;
        while (again) {
            numberToGuess = random.nextInt(100) + 1;
            found = false;
            surrender = false;
            while (!found && !surrender) {
                int myGuess;
                
                System.out.println("Please enter a guess");
                myGuess = input.nextInt();
                if (myGuess == 0) {
                    surrender = true;
                } else {
                    if (myGuess == numberToGuess) {
                        System.out.println("Congragulations your guess was correct. The number was " + numberToGuess + "");
                        found = true;
                    } else {
                        if (myGuess > numberToGuess) {
                            System.out.println("Your guess is too high");
                        } else {
                            System.out.println("Your guess is too low");
                        }
                    }
                }
            }
            System.out.println("Would you like to play again?");
            response = input.nextLine();
            if (response.charAt(0).equals("Y") || response.charAt(0).equals("y")) {
                again = true;
            } else {
                again = false;
                System.out.println("Thank you for playing");
            }
        }
    }
}
