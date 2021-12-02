package rolling;

import exceptions.IncorrectCommandException;
import exceptions.IncorrectInputException;
import exceptions.NothingEnteredException;


public class Parser {


    public static String[] parse(String input) throws RuntimeException {

        if (input.equals("")) throw new NothingEnteredException("You didn't write anything! ");
        if (input.equals("roll")) throw new IncorrectCommandException("You need to enter your command with / ");
        if (input.equals("/roll")) throw new IncorrectInputException("You need to enter correct command ");

        String[] inputCommand = input.split(" ");

        String[] splitedInputCommand = inputCommand[1].split("d");

        Dice.setAmountOfSide(Integer.parseInt(splitedInputCommand[1]));
        if (splitedInputCommand[0].equals("")) {
            Dice.setAmountOfThrows(1);

        } else Dice.setAmountOfThrows(Integer.parseInt(splitedInputCommand[0]));


        return splitedInputCommand;
    }

}
