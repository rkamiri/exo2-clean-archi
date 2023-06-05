package Game;

import Utilities.randomGenerator.IRandomGenerator;
import Utilities.randomGenerator.RandomGenerator;

public class Game {
    private int currentAttemptCount, maxAttempts, searchedNumber, currentNumber;
    private IRandomGenerator randomGenerator;

    public Game(int currentAttemptCount, int maxAttempts) {
        this.currentAttemptCount = currentAttemptCount;
        this.maxAttempts = maxAttempts;
        this.searchedNumber = new RandomGenerator().generateRandomNumber(100);

    }

    public boolean canPlay() {
        return this.currentAttemptCount < this.maxAttempts;
    }

    public void tryAttempt(int userNumber){
        if(!this.canPlay()){
            throw new RuntimeException("Max attempts reached");
        }
        currentAttemptCount++;
        this.currentNumber = userNumber;
    }

    public int getSearchNumber() {
        return searchedNumber;
    }

    public int getMaxAttempts() {
        return maxAttempts;
    }

    public boolean hasWon() {
        return this.currentNumber == this.searchedNumber;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public int getAttempts() {
        return this.currentAttemptCount;
    }
}
