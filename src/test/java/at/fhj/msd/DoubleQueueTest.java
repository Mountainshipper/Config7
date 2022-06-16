package at.fhj.msd;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;


/**
 * testing DoubleQueue
 */
public class DoubleQueueTest extends TestCase {
    private DoubleQueue doubleQueue;
    /**
     * setup
     */
    @BeforeEach
    public void setup(){
        doubleQueue = new DoubleQueue(5);
    }
    /**
     * Test-method for offer
     */
    @Test
    public void testOffer() {
        Assertions.assertTrue(doubleQueue.offer("2.5"));
    }

    /**
     * Test-method for peek
     */
    @Test
    public void testPeek() {
        doubleQueue.offer("3.4");
        Assertions.assertEquals("3.4", doubleQueue.peek());
    }

    /**
     * Test the element method with throwException
     */
    @Test
    public void testElementException() {
        doubleQueue.offer("blabla");
        Assertions.assertThrows(NoSuchElementException.class,()->doubleQueue.element());
    }

    /**
     * Test the element method with 1.1
     */
    @Test
    public void testElementCorrect() {
        doubleQueue.offer("1.1");
        Assertions.assertEquals("1.1", doubleQueue.element());
    }

    /**
     * test
     * expected 4.4
     */
    @Test
    public void testPoll() {
        doubleQueue.offer("4.4");
        Assertions.assertEquals("4.4", doubleQueue.poll());
    }

    /**
     * test poll
     * expected null
     */
    @Test
    public void testPollNull() {
        Assertions.assertEquals("Wrong size of elements-list", doubleQueue.poll());
    }


    /**
     * test
     * wrong String, exception throws
     */
    @Test
    public void testRemoveException() {
        doubleQueue.offer("blablabla");
        Assertions.assertThrows(NoSuchElementException.class,()->doubleQueue.remove());
    }


    /**
     * test remove()
     * expected output "Nichts für Humorlose"
     */
    @Test
    public void testRemoveCorrect() {
        doubleQueue.offer("1.5");
        Assertions.assertEquals("1.5", doubleQueue.remove());
    }


}