package rolling;

import java.util.Arrays;

public class Roller {
    private static int[] diceRolls;

    public static String roll(String input) {

        Parser.parse(input);

        diceRolls = new int[Dice.getAmountOfThrows()];

        for (int i = 0; i < diceRolls.length; i++) {

            diceRolls[i] = 1 + (int) (Math.random() * Dice.getAmountOfSide());
        }
        return Arrays.toString(diceRolls);
    }

    public static int[] getDiceRolls() {
        return diceRolls;
    }
}
