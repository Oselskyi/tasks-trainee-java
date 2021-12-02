package stack;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    public static Stack stack;

    @BeforeEach
    void setUp(){stack = new Stack(7);}

    @Test
    void addElement() {
        boolean isAdded = stack.addElement(5);
        assertTrue(isAdded);
    }

    @Test
    void deleteElement() {
        stack.addElement(5);
        stack.addElement(7);
        int deletedElement = stack.deleteElement();
        assertEquals(7, deletedElement);
    }

    @Test
    void isEmpty() {
        assertTrue(stack.isEmpty());
    }
    @Test
    void isNotEmpty() {

        stack.addElement(5);
        assertFalse(stack.isEmpty());
    }

    @Test
    void getElement() {
        stack.addElement(5);
        stack.addElement(7);
        int element = stack.getElement();
        assertEquals(7, element);
    }

    @Test
    void isFull() {

        stack.addElement(7);
        stack.addElement(7);
        stack.addElement(7);
        stack.addElement(7);
        stack.addElement(7);
        stack.addElement(7);
        stack.addElement(7);

        assertTrue(stack.isFull());
    }
  @Test
    void isNotFull() {

      stack.addElement(7);
      stack.addElement(7);
      stack.addElement(7);
      stack.addElement(7);

      assertFalse(stack.isFull());
    }

    @Test
    void show() {

        String array = "[1, 2, 3, 0, 0, 0, 0]";
        stack.addElement(1);
        stack.addElement(2);
        stack.addElement(3);
        String myArray = stack.show();
        assertEquals(array, myArray);
    }
}