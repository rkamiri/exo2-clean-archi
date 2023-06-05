package Utilities.numberComparator;

public class NumberComparator implements INumberComparator{
    @Override
    public String compare(int guess, int number) {
        return guess < number ? "smaller" : "greater";
    }
}
