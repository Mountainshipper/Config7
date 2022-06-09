package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DrinkQueue implements IQueue {

    private List<Drink> elements = new ArrayList<Drink>();
    private int maxSize = 5;

    public DrinkQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public boolean offer(String obj) {
        if (elements.size() != maxSize) {
            switch (obj) {
                case "Andys Stress Cocktail" -> elements.add(new SimpleDrink(obj, new Liquid("Marillen-Schnaps", 0.5, 0.9)));
                case "Nichts für Humorlose" -> elements.add(new SimpleDrink(obj, new Liquid("Gin", 0.2, 0.3)));
                case "Suffering Bastard" -> elements.add(new SimpleDrink(obj, new Liquid("Whiskey", 0.2, 0.6)));
            }
        }
        else
            return false;

        return true;
    }
    /**
     * Get first element in arraylist
     * @return firstelement; If arrayList is empty, return null
     */
    @Override
    public String poll() {
        String firstElement = peek();
        if (elements.size() == 0)
            return null;
        else
            elements.remove(0);
        return firstElement;
    }



    /**
     * removes first element in arraylist
     * if no elment exists, it throws NoSuchElementException
     * @return returns firstelement or "No such element"
     */
    @Override
    public String remove() throws NoSuchElementException{
        String firstElement = peek();
        try {
            elements.remove(0);
            return firstElement;
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException();
        }
    }
    /**
     * get first element in arraylist.
     * @return firstelement; If allayList is empty, return null
     */
    @Override
    public String peek() {
        if (elements.size() == 0)
            return null;
        else
            return elements.get(0).getName();
    }



    /**
     * get first element in arraylist
     * but if no elements exists, NoSuchElementException is throwin
     * @return firstelement or "No such element"
     */
    @Override
    public String element() throws NoSuchElementException{
        try {
            return elements.get(0).getName();
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException();
        }
    }
}
