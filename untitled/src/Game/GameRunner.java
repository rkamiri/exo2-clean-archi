package Game;

import Utilities.userInput.IUserInput;
import Utilities.userInput.UserInput;

public class GameRunner {
    private Game game;
    private final IUserInput userInput;
    private boolean continuePlaying;

    public GameRunner() {
        this.userInput = new UserInput();
        this.continuePlaying = true;
    }

    public void run() {
        System.out.println("-===========================-");
        System.out.println("=== GUESS THE NUMBER GAME ===");
        System.out.println("-===========================-");

        while(continuePlaying) {
            System.out.println("Guess the number (between 1 and 100)!");
            this.game = new Game(0, 10);
            System.out.println("debug : the expected number is " + this.game.getSearchNumber());
            new GameAttempt(this.game).attemptGame();


            if (!this.game.canPlay() && this.game.hasWon()) {
                System.out.println("You lose after " + this.game.getMaxAttempts() + " tries, the expected number was " + this.game.getSearchNumber());
            }

            //
            System.out.println("----------------------------------------------------");
            System.out.println("Do you want to try again with a new number (yes/no)?");
            String userResponse =this.userInput.getUserStringInput().trim().toLowerCase();
            //
            continuePlaying = userResponse.equals("yes");
        }

        System.out.println("== Thanks for playing! ==");
        userInput.stopInput();
    }
}
