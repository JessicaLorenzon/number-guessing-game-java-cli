package controller;

import model.Game;
import model.LevelEasy;
import model.LevelHard;
import model.LevelMedium;
import view.View;

import java.util.Scanner;

public class GameController {
    View view = new View();
    Scanner scanner = new Scanner(System.in);

    public void play() {

        Game game = new Game();

        view.displayWelcome();

        selectLevel(game);

        rounds(game);
    }

    public void selectLevel(Game game) {
        view.displayEnterChoice();
        int numberLevel = scanner.nextInt();
        view.addLineBreak();

        switch (numberLevel) {
            case 1:
                game.setLevel(new LevelEasy());
                break;
            case 2:
                game.setLevel(new LevelMedium());
                break;
            case 3:
                game.setLevel(new LevelHard());
                break;
        }
        view.displayStartGame(game.getLevel().getLevelName(), game.getLevel().getNumberOfChances());
    }

    public void rounds(Game game) {
        int attempts = game.getAttempts();
        while (attempts < game.getLevel().getNumberOfChances()) {
            view.displayEnterGuess();
            Integer guess = scanner.nextInt();

            if (game.getRandomNumber().equals(guess)) {
                view.displayCorrectGuess(attempts + 1);
                return;
            } else {
                view.displayIncorrectGuess(guess, game.getRandomNumber());
                view.addLineBreak();
            }
            attempts++;
        }

        if (game.getLevel().getNumberOfChances().equals(attempts)) {
            view.displayGameOver(game.getLevel().getNumberOfChances());
        }
    }
}
