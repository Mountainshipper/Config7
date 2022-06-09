package at.fhj.msd;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;

public class DoubleTest extends TestCase {
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
     * Test the element method
     */
    @Test
    public void testElement() {
        doubleQueue.offer("blabla");
        Assertions.assertThrows(NoSuchElementException.class,()->doubleQueue.element());
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
     * test
     * wrong String, exception throws
     */
    @Test
    public void testRemove() {
        doubleQueue.offer("blablabla");
        Assertions.assertThrows(NoSuchElementException.class,()->doubleQueue.remove());
    }





}