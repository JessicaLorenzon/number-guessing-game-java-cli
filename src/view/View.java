package view;

public class View {

    public void displayWelcome() {
        System.out.print("""
                Welcome to the Number Guessing Game!
                I'm thinking of a number between 1 and 100.
                
                Please select the difficulty level:
                1. Easy (10 chances)
                2. Medium (5 chances)
                3. Hard (3 chances)
                
                """);
    }

    public void displayStartGame(String levelName, Integer numberOfChances) {
        System.out.printf(
                "Great! You have selected the %s difficulty level.%n" +
                        "You have %d chances.%n" +
                        "Let's start the game!%n%n",
                levelName, numberOfChances
        );
    }

    public void addLineBreak() {
        System.out.println();
    }

    public void displayEnterChoice() {
        System.out.print("Enter your choice: ");
    }

    public void displayEnterGuess() {
        System.out.print("Enter your guess: ");
    }

    public void displayCorrectGuess(Integer attempts) {
        System.out.printf("Congratulations! You guessed the correct number in %d attempts.%n", attempts);
    }

    public void displayIncorrectGuess(Integer guess, Integer randomNumber) {
        System.out.printf("Incorrect! The number is %s than %d.%n", isGreaterOrLess(guess, randomNumber), guess);
    }

    public void displayGameOver(Integer numberOfChances) {
        System.err.printf("You used all your %d chances :( %n" +
                        "Game over!",
                numberOfChances);
    }

    public String isGreaterOrLess(Integer guess, Integer randomNumber) {
        if (guess > randomNumber) {
            return "less";
        } else {
            return "greater";
        }
    }

}
