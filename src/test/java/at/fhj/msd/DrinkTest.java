package at.fhj.msd;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;

public class DrinkTest extends TestCase {
    private DrinkQueue drinkQueue;

    @BeforeEach
    public void setup(){
        drinkQueue = new DrinkQueue(5);
    }

    @Test
    public void testAndysStressCocktail() {
        Assertions.assertTrue(drinkQueue.offer("Andys Stress Cocktail"));
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