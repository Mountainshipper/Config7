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

    @Test
    public void testPeek() {
        drinkQueue.offer("Nichts für Humorlose");
        Assertions.assertEquals("Nichts für Humorlose", drinkQueue.peek());
    }

    @Test
    public void testElement() {
        drinkQueue.offer("blabla");
        Assertions.assertThrows(NoSuchElementException.class,()->drinkQueue.element());
    }









}