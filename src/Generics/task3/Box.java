package Generics.task3;

public class Box<B extends Fruit> {
    private B element;

    public B getBoxContent() {
        return element;
    }

    public Box (B element) {
        this.element = element;
    }

    public void compareBox(Box fruit) {
        float dif = this.getBoxContent().getWeightBox() - fruit.getBoxContent().getWeightBox();
        if (dif > 0f) {
            System.out.println("Вес коробки с типом -" + this.element.getName() + "- больше");
        }  else if (dif < 0f) {
            System.out.println("Вес коробки с типом -" + this.element.getName() + "- меньше");
        } else System.out.println("Веса коробок равны");
    }

    public void moveToBox(Box<?> box) {
        box.getBoxContent().getFruit().addAll(this.getBoxContent().getFruit());
        this.getBoxContent().getFruit().clear();
    }
}
