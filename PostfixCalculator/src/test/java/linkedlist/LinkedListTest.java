package linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    /*running with coverage says that the test hit 68% lines
    because I decided not to test the printer method, because I see no point to do so.
    ignoring that its full 100% */
    private LinkedList<Integer> linkedList;

    @BeforeEach
    public void setUp() {
        linkedList = new LinkedList<>();
    }

    @Test
    public void testIsEmpty() {
        //assertTrue(1 == 0);
        linkedList.insertAtTheStart(42);
        assertFalse(linkedList.isEmpty());
    }
    @Test
    public void testInsertAtTheStart() {
        //assertTrue(1 == 0);
        linkedList.insertAtTheStart(1);
        linkedList.insertAtTheStart(2);

        assertEquals(2, linkedList.size());
        assertEquals(2, linkedList.getHead());
    }
    @Test
    public void testDeleteAtTheStart() {
        //assertTrue(1 == 0);
        linkedList.insertAtTheStart(1);
        linkedList.insertAtTheStart(2);
        linkedList.deleteAtTheStart();

        assertEquals(1, linkedList.size());
        assertEquals(1, linkedList.getHead());
    }
    @Test
    public void testSize() {
        //assertTrue(1 == 0);

        linkedList.insertAtTheStart(1);
        linkedList.insertAtTheStart(2);
        linkedList.deleteAtTheStart();

        assertEquals(1, linkedList.size());
    }

}