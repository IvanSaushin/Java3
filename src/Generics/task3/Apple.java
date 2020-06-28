package Generics.task3;

import java.util.ArrayList;

public class Apple extends Fruit{
    public Apple(ArrayList fruit) {
        super(fruit);
    }

    public void addApple() {
        getFruit().add(1);
    }
}
