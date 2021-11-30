package rolling;

import exceptions.IncorrectInputException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputTest {

    @Test
    void enterCommand() {
    }

    @Test
    public void testLittleCommand() {

        assertThrows(IncorrectInputException.class, Input::enterCommand);
    }


}