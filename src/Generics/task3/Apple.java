package Generics.task3;

import java.util.ArrayList;

public class Apple<T> extends Fruit{
    private ArrayList<T> apple;
    private float weightApple;
    private int quantity;
    private String nameApple = "яблоки";

    public Apple(ArrayList apple) {
        super(apple);
        this.apple = apple;
    }

    public String getName() {
        return nameApple;
    }

    public void addApple(float weightApple) {
        this.weightApple = weightApple;
        getFruit().add(weightApple);
    }

    public float getWeightAppleBox() {
        float sum = 0;
        for (int i=0; i<getFruit().size(); i++) {
            sum = sum + (Float) getFruit().get(i);
        }
        return sum;
    }
}
