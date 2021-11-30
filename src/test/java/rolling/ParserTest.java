package rolling;

import exceptions.IncorrectCommandException;
import exceptions.IncorrectInputException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {


    @Test
    public void testException() {

        assertThrows(IncorrectInputException.class, () -> Parser.parse("/roll"));
    }

    @Test
    public void testParseRolld6() {

        Parser.parse("/roll d6");
        assertEquals(6, Dice.getAmountOfSide());
        assertEquals(1, Dice.getAmountOfThrows());
    }

    @Test
    public void testParseRolld20() {

        Parser.parse("/roll d20");
        assertEquals(20, Dice.getAmountOfSide());
        assertEquals(1, Dice.getAmountOfThrows());
    }

    @Test
    public void testParseRoll3d6() {

        Parser.parse("/roll 3d6");
        assertEquals(6, Dice.getAmountOfSide());
        assertEquals(3, Dice.getAmountOfThrows());
    }

    @Test
    public void testParseRoll10d20() {

        Parser.parse("/roll 12d25");
        assertEquals(25, Dice.getAmountOfSide());
        assertEquals(12, Dice.getAmountOfThrows());
    }

    @Test
    public void testUncorrectCommand() {

        assertThrows(IncorrectCommandException.class, () -> Parser.parse("roll"));
    }
}