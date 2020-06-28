package Generics.task3;

import java.util.ArrayList;
public class Fruit {
    private ArrayList fruit;

    public Fruit(ArrayList fruit) {
        this.fruit = fruit;
    }

    public ArrayList getFruit() {
        return fruit;
    }

    public void addFruit() {
        fruit.add(1);
    }
}
