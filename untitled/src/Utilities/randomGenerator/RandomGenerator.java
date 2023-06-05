package Utilities.randomGenerator;

import java.util.Random;

public class RandomGenerator implements IRandomGenerator {
    public int generateRandomNumber(int max){
        Random generator = new Random();
        return generator.nextInt(max) + 1;
    }
}
