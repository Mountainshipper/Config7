package at.fhj.msd;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

public class StringQueueTest extends TestCase {
    private StringQueue stringQueue;

    /**
     * setup
     */
    @BeforeEach
    public void setup(){
        stringQueue = new StringQueue(5);
    }
    /**
     * Test-method for offer()
     * expected output: true
     */
    @Test
    public void testOfferTrue() {
        Assertions.assertTrue(stringQueue.offer("Andys Stress Cocktail"));
    }

    /**
     * Test-method for offer()
     * expected output: false
     */
    @Test
    public void testOfferFalse() {
        stringQueue.setMaxSize(0);
        Assertions.assertFalse(stringQueue.offer("huhu"));
    }
    /**
     * Test-method for peek
     */
    @Test
    public void testPeek() {
        stringQueue.offer("Nichts für Humorlose");
        Assertions.assertEquals("Nichts für Humorlose", stringQueue.peek());
    }

    /**
     * Test element method
     * expected output: Exception NoSuchElementException
     */
    @Test
    public void testElementException() {
        Assertions.assertThrows(NoSuchElementException.class,()->stringQueue.element());
    }

    /**
     * Test element method
     * expected output: String "Nichts für Humorlose"
     */
    @Test
    public void testElementCorrect() {
        stringQueue.offer("Nichts für Humorlose");
        Assertions.assertEquals("Nichts für Humorlose", stringQueue.element());
    }

    /**
     * Test poll method
     * expected output: String "Andys Stress Cocktail"
     */
    @Test
    public void testPoll() {
        stringQueue.offer("Andys Stress Cocktail");
        Assertions.assertEquals("Andys Stress Cocktail", stringQueue.poll());
    }

    /**
     * Test poll method
     * expected output: String "Wrong size of elements-list"
     */
    @Test
    public void testPollWrongSize() {
        Assertions.assertEquals("Wrong size of elements-list",stringQueue.poll());
    }

    /**
     * Test remove method
     * expected output: Exception
     */
    @Test
    public void testRemoveException() {
        Assertions.assertThrows(NoSuchElementException.class,()->stringQueue.remove());
    }

    /**
     * Test remove method
     * expected output: String "Nichts für Humorlose"
     */
    @Test
    public void testRemoveCorrect() {
        stringQueue.offer("Nichts für Humorlose");
        Assertions.assertEquals("Nichts für Humorlose", stringQueue.remove());
    }

}