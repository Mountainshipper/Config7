package at.fhj.msd;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;

public class DrinkTest extends TestCase {
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
    public void testAndysStressCocktail() {
        Assertions.assertTrue(drinkQueue.offer("Andys Stress Cocktail"));
    }

    /**
     * Test-method for offer
     * expected to return false
     */
    @Test
    public void testOfferFalse() {
        Assertions.assertFalse(drinkQueue.offer("blabla"));
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
    public void testElement() {
        drinkQueue.offer("blabla");
        Assertions.assertThrows(NoSuchElementException.class,()->drinkQueue.element());
    }



    /**
     * test
     * expected String "Andys Stress Cocktail"
     */
    @Test
    public void testPoll() {
        drinkQueue.offer("Andys Stress Cocktail");
        Assertions.assertEquals("Andys Stress Cocktail", drinkQueue.poll());
    }


    /**
     * test
     * wrong String, exception throws
     */
    @Test
    public void testRemove() {
        drinkQueue.offer("An");
        Assertions.assertThrows(NoSuchElementException.class,()->drinkQueue.remove());
    }





}