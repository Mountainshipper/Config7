package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;



public class DoubleQueue implements IQueue {
    private List<Double> elements = new ArrayList<Double>();
    private int maxSize = 5;


    /**
     * constructor
     * set int maxSize
     *
     * @param maxSize
     */
    public DoubleQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * As long as maxSize is not full, we fill it with objects
     *
     * @param obj values for ArrayList
     * @return
     */
    @Override
    public boolean offer(String obj) {
        try {
            double element = Double.parseDouble(obj);
            elements.add(element);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * @return element // If element size is 0, we return "Wrong size of elements-list" (Error List)
     * @return
     */
    @Override
    public String poll() {
        String element = peek();

        if (elements.size() == 0) {
            return "Wrong size of elements-list";
        }

        return element;
    }

    /**
     * @return element // If element == null, we return "there's no element any more"
     */
    @Override
    public String remove() throws NoSuchElementException {
        String firstElement = peek();
        try {
            elements.remove(0);
            return firstElement;
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException();
        }
    }

    /**
     * if elements.size() > 0  -> element = elements.get(0); else element = null;
     *
     * @return element
     */
    @Override
    public String peek() {
        Double element;
        if (elements.size() > 0)
            element = elements.get(0);
        else
            element = null;
        return String.valueOf(element);
    }

    /**
     * element = peek() / if element = null -> throw NoSuchElementException("there's no element any more")
     *
     * @return element
     */
    @Override
    public String element() throws NoSuchElementException {
        try {
            return String.valueOf(elements.get(0));
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException();
        }
    }
}


