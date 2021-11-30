package rolling;

import exceptions.NothingEnteredException;

import java.util.Scanner;

public class Input {

    public static String enterCommand() throws NothingEnteredException {

        System.out.println("Please enter a command to roll the dice ");
        Scanner scanner = new Scanner(System.in);
        String inputCommand = scanner.nextLine();

        if (inputCommand.equals("")) throw new NothingEnteredException("You didn't write anything! ");

        return inputCommand;
    }
}
