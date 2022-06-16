package at.fhj.msd;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;

/**
 * testing DrinkQueue
 */
public class DrinkQueueTest extends TestCase {
    private DrinkQueue drinkQueue;

    /**
     * setup
     */
    @BeforeEach
    public void setup(){
        drinkQueue = new DrinkQueue(5);
    }
    /**
     * Test-method for testAndysStressCocktail
     */
    @Test
    public void testAndysStressCocktail() {Assertions.assertTrue(drinkQueue.offer("Andys Stress Cocktail"));
    }

    /**
     * Test-method for offer()
     * expected output: false
     */
    @Test
    public void testOfferFalse() {
        drinkQueue.setMaxSize(0);
        Assertions.assertFalse(drinkQueue.offer("Hallelujah"));
    }
    /**
     * Test-method for peek
     */
    @Test
    public void testPeek() {
        drinkQueue.offer("Nichts für Humorlose");
        Assertions.assertEquals("Nichts für Humorlose", drinkQueue.peek());
    }

    /**
     * Test the element method
     */
    @Test
    public void testElementException() {
        drinkQueue.offer("blabla");
        Assertions.assertThrows(NoSuchElementException.class,()->drinkQueue.element());
    }

    @Test
    public void testElementCorrect() {
        drinkQueue.offer("Nichts für Humorlose");
        Assertions.assertEquals("Nichts für Humorlose", drinkQueue.element());
    }

    /**
     * test poll()
     * expected String "Andys Stress Cocktail"
     */
    @Test
    public void testPoll() {
        drinkQueue.offer("Andys Stress Cocktail");
        Assertions.assertEquals("Andys Stress Cocktail", drinkQueue.poll());
    }

    /**
     * test poll
     * expected null
     */
    @Test
    public void testPollNull() {
        Assertions.assertNull(drinkQueue.poll());
    }


    /**
     * test remove()
     * wrong String, exception throws
     */
    @Test
    public void testRemoveException() {
        drinkQueue.offer("An");
        Assertions.assertThrows(NoSuchElementException.class,()->drinkQueue.remove());
    }


    /**
     * test remove()
     * expected output "Nichts für Humorlose"
     */
    @Test
    public void testRemoveCorrect() {
        drinkQueue.offer("Nichts für Humorlose");
        Assertions.assertEquals("Nichts für Humorlose", drinkQueue.remove());
    }

}