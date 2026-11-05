package ch.itninja.labs;

import java.util.ArrayList;

public class Basket {
    private ArrayList<String> items = new ArrayList<>();

    public void add(String name) {
        items.add(name);
    }

    public void remove(String name) {
        items.remove(name);
    }

    public int count() {
        return items.size();
    }

    public boolean contains(String name) {
        return items.contains(name);
    }
}
