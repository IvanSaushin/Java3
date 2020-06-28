package Generics.task3;

public class Box<B extends Fruit> {
    private B element;

    public B getThings() {
        return element;
    }

    public Box (B element) {
        this.element = element;
    }

    public Box() {

    }
}
