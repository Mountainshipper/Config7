package at.fhj.msd;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

public class StringQueueTest extends TestCase {
    private DrinkQueue stringQueue;

    /**
     * setup
     */
    @BeforeEach
    public void setup(){
        stringQueue = new DrinkQueue(5);
    }
    /**
     * Test-method for testAndysStressCocktail
     */
    @Test
    public void testAndysStressCocktail() {
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
     * Test the element method
     */
    @Test
    public void testElementException() {
        stringQueue.offer("blabla");
        Assertions.assertThrows(NoSuchElementException.class,()->stringQueue.element());
    }

    @Test
    public void testElementCorrect() {
        stringQueue.offer("Nichts für Humorlose");
        Assertions.assertEquals("Nichts für Humorlose", stringQueue.element());
    }

    /**
     * test poll()
     * expected String "Andys Stress Cocktail"
     */
    @Test
    public void testPoll() {
        stringQueue.offer("Andys Stress Cocktail");
        Assertions.assertEquals("Wrong size of elements-list", stringQueue.poll());
    }

    /**
     * test poll
     * expected null
     */
    @Test
    public void testPollNull() {
        Assertions.assertNull(stringQueue.poll());
    }


    /**
     * test remove()
     * wrong String, exception throws
     */
    @Test
    public void testRemoveException() {
        stringQueue.offer("An");
        Assertions.assertThrows(NoSuchElementException.class,()->stringQueue.remove());
    }


    /**
     * test remove()
     * expected output "Nichts für Humorlose"
     */
    @Test
    public void testRemoveCorrect() {
        stringQueue.offer("Nichts für Humorlose");
        Assertions.assertEquals("Nichts für Humorlose", stringQueue.remove());
    }

}