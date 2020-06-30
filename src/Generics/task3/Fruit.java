package Generics.task3;

import java.util.ArrayList;
public class Fruit {
    private ArrayList fruit;
    private float weightFruit;
    private String name;

    public Fruit(ArrayList fruit) {
        this.fruit = fruit;
    }

    public String getName() {
        return name;
    }

    public ArrayList getFruit() {
        return fruit;
    }
    public void setFruit(ArrayList fruit) {
        this.fruit = fruit;
    }

    public void boxInfo() {
        System.out.println("Содержимое коробки " + getName());
        System.out.println("всего " + fruit.size() + " фрукт/a/ов");
        System.out.println("Вес каждого: ");
        for (int i = 0; i < fruit.size(); i++) {
            if (i < fruit.size() && i != fruit.size()-1) {
                System.out.println(fruit.get(i));
            }
            if (i == fruit.size()-1) {
                System.out.println(fruit.get(i) + "  <- the last");
            }
        }
        System.out.println();
    }

    public int getQuantityFruit() {
        return fruit.size();
    }

    public float getWeightBox() {
        float sum =0;
        for (int i=0; i<getFruit().size(); i++) {
            sum = sum + (Float) getFruit().get(i);
        }
        return sum;
    }
}
