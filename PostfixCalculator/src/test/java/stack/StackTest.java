package stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    //same story with the print method
    private Stack<Integer> stack;

    @BeforeEach
    public void setUp() {
        stack = new Stack<>();
    }

    @Test
    public void testPush() {
        //assertTrue(1 == 0);

        stack.push(1);
        stack.push(2);

        assertFalse(stack.isEmpty());
        assertEquals(2, stack.peek());
    }
    @Test
    public void testPop() {
        //assertTrue(1 == 0);

        stack.push(1);
        stack.push(2);

        assertFalse(stack.isEmpty());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertTrue(stack.isEmpty());
    }
    @Test
    public void testPeek() {
        //assertTrue(1 == 0);

        stack.push(1);
        stack.push(2);

        assertFalse(stack.isEmpty());
        assertEquals(2, stack.peek());
    }
    @Test
    public void testIsEmpty() {
        //assertTrue(1 == 0);
        stack.push(1);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testSize() {
        //assertTrue(1 == 0);
        stack.push(1);
        stack.push(2);

        assertEquals(2, stack.size());
        stack.pop();
        assertEquals(1, stack.size());
        stack.pop();
        assertEquals(0, stack.size());
    }
    @Test
    public void testPopOnAnEmptyStack() {
        //assertTrue(1 == 0);
        assertTrue(stack.isEmpty());

        assertThrows(IllegalStateException.class, () -> stack.pop());
    }
    @Test
    public void testPeekOnAnEmptyStack() {
        //assertTrue(1 == 0);
        assertTrue(stack.isEmpty());

        assertThrows(IllegalStateException.class, () -> stack.peek());
    }


}