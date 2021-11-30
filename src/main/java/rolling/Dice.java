package rolling;

public class Dice {
    private static int amountOfSide;
    private static int amountOfThrows;

    public static int getAmountOfSide() {
        return amountOfSide;
    }

    public static void setAmountOfSide(int amountOfSide) {
        Dice.amountOfSide = amountOfSide;
    }

    public static int getAmountOfThrows() {
        return amountOfThrows;
    }

    public static void setAmountOfThrows(int amountOfThrows) {
        Dice.amountOfThrows = amountOfThrows;
    }
}
