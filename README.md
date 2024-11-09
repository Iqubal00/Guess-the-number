
# Guess the number

This is a simple Java-based console game where the user tries to guess a randomly generated number between 1 and 100. The player has 8 attempts to guess the correct number, with a points system rewarding successful guesses. After each game, the user is prompted to play again or exit.


## How It Works
1. Random Number Generation:
The program generates a random number between 1 and 100 using Math.random() and assigns it to the number variable.

2. Game Instructions:
The player is informed that a number has been generated and is prompted to guess it. The player has a maximum of 8 attempts to guess the number correctly.

3. Guessing and Feedback:
The player inputs a guess, which is checked against the generated number:

- If the guess is correct, the player wins, and the program displays a congratulatory message with the points earned.

- If the guess is too low, the program hints that the number is higher and deducts 10 points.

- If the guess is too high, the program hints that the number is lower and also deducts 10 points.

- The program displays the number of remaining attempts after each incorrect guess.

4. End of Game:
- If the player exhausts all attempts without guessing correctly, the program displays the correct number and assigns 0 points.

- The player is then prompted to play another round or exit:

     - Entering 1 starts a new game.
     - Any other input exits the game.