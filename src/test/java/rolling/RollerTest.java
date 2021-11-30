package rolling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RollerTest {

    @Test
    void rolld20() {

        Roller.roll("/roll d20");
        assertTrue(Dice.getAmountOfSide() > 0 && Dice.getAmountOfSide() <= 20);
    }

    @Test
    void roll5d17Above17() {

        Roller.roll("/roll 5d17");
        assertTrue(Dice.getAmountOfSide() <= 17);

    }

    @Test
    void roll5d17() {

        Roller.roll("/roll 5d17");
        assertEquals(5, Roller.getDiceRolls().length);
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
    void roll100d170Length() {

        Roller.roll("/roll 100d170");
        assertEquals(100, Roller.getDiceRolls().length);
    }

    @Test
    void roll100d170() {

        Roller.roll("/roll 100d170");
        assertTrue(Dice.getAmountOfSide() <= 170);
    }
}