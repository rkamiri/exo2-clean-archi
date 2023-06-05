package Game;

import Utilities.numberComparator.INumberComparator;
import Utilities.numberComparator.NumberComparator;
import Utilities.userInput.IUserInput;
import Utilities.userInput.UserInput;

public class GameAttempt {
    private final Game game;
    private final IUserInput userInput = new UserInput();
    private final INumberComparator numberComparator = new NumberComparator();

    public GameAttempt(Game game) {
        this.game = game;
    }

    public void attemptGame() {
        while (this.game.canPlay() && !game.hasWon()) {
            game.tryAttempt(userInput.getUserInput());
            if (this.game.hasWon()) {
                System.out.println("You found it after " + this.game.getAttempts() + " tries!");
            } else {
                String divergence = this.numberComparator.compare(this.game.getCurrentNumber(), this.game.getSearchNumber());
                System.out.println("Wrong! Your number is " + divergence + " than the correct one. " + (this.game.getMaxAttempts() - this.game.getAttempts()) + "/" + this.game.getMaxAttempts() + " tries left");
            }
        }
    }
}
