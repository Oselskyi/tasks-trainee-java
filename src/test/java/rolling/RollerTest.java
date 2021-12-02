package rolling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RollerTest {

    @Test
    void roll2d20() {
        int result = 0;
        int[] array = Roller.roll("/roll 2d20");
        for (int i = 0; i < array.length; i++) {
            int i1 = array[i];
             result = i1 + array[i];
        }
        assertTrue(result > 1 && result <= 40);
    }

    @Test
    void roll5d17Above17() {

        Roller.roll("/roll 5d17");
        assertTrue(Dice.getAmountOfSide() <= 17);

    }

    @Test
    void roll5d17Incorrect() {

        Roller.roll("/roll 5d17");
        assertFalse(Dice.getAmountOfSide() <= 0 || Dice.getAmountOfSide() > 17);
    }

    @Test
    void roll100d170Incorrect() {

        Roller.roll("/roll 100d170");
        assertFalse(Dice.getAmountOfSide() > 170);
    }



    @Test
    void roll100d170() {

        Roller.roll("/roll 100d170");
        assertTrue(Dice.getAmountOfSide() <= 170);
    }
}