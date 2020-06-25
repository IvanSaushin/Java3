package Generics.task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Fruit> fruitBox1 = new Box<>(new Fruit(new ArrayList()));

        System.out.println(fruitBox1.getThings().getFruit());
        fruitBox1.getThings().addFruit();
        fruitBox1.getThings().addFruit();
        fruitBox1.getThings().addFruit();

        System.out.println(fruitBox1.getThings().getFruit().size());
    }
}
