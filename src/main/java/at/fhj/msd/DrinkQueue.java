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

    @Override
    public String poll() {
        return null;
    }

    @Override
    public String remove() {
        return null;
    }

    @Override
    public String peek() {
        return null;
    }

    @Override
    public String element() {
        return null;
    }
}
