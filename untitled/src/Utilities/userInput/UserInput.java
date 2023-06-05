package Utilities.userInput;

import java.util.Scanner;

public class UserInput implements IUserInput{

    private Scanner scanner = new Scanner(System.in);

    public int getUserInput(){
        String input = scanner.nextLine();
        try{
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Your input was '" + input + "', please enter a valid integer.");
        }
    }

    @Override
    public String getUserStringInput() {
        return scanner.nextLine();
    }

    public void stopInput(){
        scanner.close();
    }
}
