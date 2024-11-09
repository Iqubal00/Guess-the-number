
import java.util.Scanner;

public class guess_the_number {

    // Function to implement number guessing game
    public static void guessingNumberGame() {

        Scanner sc = new Scanner(System.in);

        // Random number generayed
        int number = 1 + (int) (100 * Math.random());

        int trails = 8;
        int K = trails;
        int i, guess, n;
        int points = 100;

        System.out.println();
        System.out.println("A number is generated between 1 to 100. Guess the number \nYou have 8 trials --> ");

        for (i = 0; i < K; i++) {

            System.out.print("\n Guess the number:");

            // Input for guessing number
            guess = sc.nextInt();

            // If the number is guessed
            if (number == guess) {
                System.out.println("\n Congratulations! You guessed the number.");
                System.out.println("Points Earned = " + points);
                break;

            } else if (number > guess) {
                System.out.println("The number is greater than " + guess);
                System.out.println("Trails left = " + --trails);
                points -= 10;

            } else if (number < guess) {
                System.out.println("The number is less than " + guess);
                System.out.println("Trails left = " + --trails);
                points -= 10;
            }
        }

        if (i == K) {
            System.out.println("\n You have exhausted " + K + " trials.");
            System.out.println("Points Earned = 0 ");

            System.out.println("\n The number was " + number);

        }
        System.out.print("""  
                          Do you want to play more ?  
                          Enter 1 to continue 
                          Any other to exist : """);
            n = sc.nextInt();

            if (n == 1){
                System.out.println("\n A new game has started !! ");
                main(null);    
            }
            else
                System.out.println("\n Thank you for playing !! ");
    }

    // Main
    public static void main(String arg[]) {

        // Function Call
        guessingNumberGame();
    }
}
