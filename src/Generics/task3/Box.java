package Generics.task3;

import java.util.ArrayList;

public class Box<B extends Fruit> {
    private ArrayList<B> box;

    public ArrayList<B> getBoxContent() {
        return box;
    }

    public Box (ArrayList<B> box) {
        this.box = box;
    }

    public void addFruit(B fruit) {
        box.add(fruit);
    }

    public void compareBox(Box fruit) {
        float dif = this.getWeightBox() - fruit.getWeightBox();
        if (dif>0) {
            System.out.println("Первая коробка больше");
        }
        else if (dif<0) System.out.println("Первая коробка меньше");
        else System.out.println("Коробки равны");
    }

    public void moveToBox(Box<?super B> box) { // вопрос 2
        box.getBoxContent().addAll(this.box);
        this.box.clear();
    }

    public float getWeightBox() {
        if (box.size() == 0) return 0;
        else return (float) box.size() * this.getBoxContent().get(0).getWeightFruit();
    }
}
