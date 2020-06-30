package Generics.task3;

import java.util.ArrayList;

public class Orange<O> extends Fruit {
    private ArrayList<O> orenge;
    private float weightOrange;
    private int quantity;
    private String nameOrange = "Апельсины";

    public Orange(ArrayList orange) {
        super(orange);
        this.orenge = orange;
    }

    public String getName() {
        return nameOrange;
    }

    public void addOrange(float weightOrange) {
        this.weightOrange = weightOrange;
        getFruit().add(weightOrange);
    }

    public float getWeightOrangeBox() {
        float sum = 0;
        for (int i=0; i<getFruit().size(); i++) {
            sum = sum + (Float) getFruit().get(i);
        }
        return sum;
    }
}
