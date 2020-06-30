package Generics.task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>(new Apple(new ArrayList()));
        Box<Apple> appleBox2 = new Box<>(new Apple(new ArrayList()));
        Box<Orange> orangeBox1 = new Box<>(new Orange(new ArrayList()));
        Box<Fruit> fruitBox1 = new Box<>(new Fruit(new ArrayList()));

        appleBox1.getBoxContent().addApple(2.8f); //        добавление 3-х яблок в коробку яблок
        appleBox1.getBoxContent().addApple(3f);
        appleBox1.getBoxContent().addApple(3f);
        orangeBox1.getBoxContent().addOrange(1.3f); // добавил апельсин в коробку с апельсинами
        appleBox1.getBoxContent().boxInfo();
        orangeBox1.getBoxContent().boxInfo();
        System.out.println("Количество фруктов коробки фруктов-1: "+fruitBox1.getBoxContent().getQuantityFruit());
        System.out.println("Содержимое коробки яблок-1: "+appleBox1.getBoxContent().getQuantityFruit());
        System.out.println("Вес коробки яблок: "+appleBox1.getBoxContent().getWeightAppleBox());
        System.out.println("Содержимое коробки апельсинов-1: "+orangeBox1.getBoxContent().getQuantityFruit());
        System.out.println("Вес коробки с апельсинами: "+orangeBox1.getBoxContent().getWeightOrangeBox());
        System.out.println();

        System.out.println("Сравнение коробок");
        appleBox1.compareBox(orangeBox1);
        orangeBox1.getBoxContent().addOrange(12.3f);
        orangeBox1.compareBox(appleBox1);
        appleBox1.compareBox(orangeBox1);

        appleBox2.getBoxContent().addApple(3.4f);
        appleBox1.getBoxContent().boxInfo();
        appleBox2.getBoxContent().boxInfo();

        orangeBox1.getBoxContent().boxInfo();
        appleBox1.getBoxContent().boxInfo();
        appleBox2.getBoxContent().boxInfo();

        System.out.println("Пересыпка коробок");
        System.out.println("Объём 1-й коробки яблок = "+appleBox1.getBoxContent().getWeightAppleBox());
        System.out.println("Объём 2-й коробки яблок = "+appleBox2.getBoxContent().getWeightAppleBox());
        appleBox1.moveToBox(appleBox2);
        System.out.println("После пересыпки");
        System.out.println("Объём 1-й коробки яблок = "+appleBox1.getBoxContent().getWeightAppleBox());
        System.out.println("Объём 2-й коробки яблок = "+appleBox2.getBoxContent().getWeightAppleBox());

        appleBox2.moveToBox(orangeBox1);
        System.out.println("После пересыпки");
        System.out.println("Объём 1-й коробки яблок = "+appleBox1.getBoxContent().getWeightAppleBox());
        System.out.println("Объём 2-й коробки яблок = "+appleBox2.getBoxContent().getWeightAppleBox());
        System.out.println("Объём 1-й коробки апельсинов = "+orangeBox1.getBoxContent().getWeightOrangeBox());
    }
}
