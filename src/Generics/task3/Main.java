package Generics.task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>(new ArrayList<>());
        Box<Orange> orangeBox = new Box<>(new ArrayList<>());
        Box<Orange> orangeBox2 = new Box<>(new ArrayList<>());

        appleBox.addFruit(new Apple()); //создаем 2 яблока
        appleBox.addFruit(new Apple());
//        appleBox.addFruit(new Orange()); //добавить апельсин в коробку с яблоком не может (ошибка компиляции)
        orangeBox.addFruit(new Orange()); //
        orangeBox.addFruit(new Orange()); // добавляем 3 апельсина в 1-ю коробку с апельсинами
        orangeBox.addFruit(new Orange()); //
        orangeBox2.addFruit(new Orange()); //добавляем апельсин во 2-ю коробку с апельсинами


        System.out.println(appleBox.getBoxContent().size());
        System.out.println(appleBox.getWeightBox());
        System.out.println(orangeBox.getBoxContent().size());
        System.out.println(orangeBox.getWeightBox());

        System.out.println("weight apple is " + appleBox.getBoxContent().get(0).getWeightFruit());
        System.out.println("weight orange is " + orangeBox.getBoxContent().get(0).getWeightFruit());

        //сравнение коробок
        appleBox.compareBox(orangeBox); //сравним коробку яблок с коробкой апельсинов (первая меньше)
        appleBox.addFruit(new Apple()); // добавим 2 яблока в коробку яблок
        appleBox.addFruit(new Apple());
        appleBox.compareBox(orangeBox); // сравним коробки снова - (коробки равны)

        //пересыпание коробок
        System.out.println(orangeBox.getWeightBox());
        System.out.println(orangeBox2.getWeightBox());
        orangeBox.moveToBox(orangeBox2);
        System.out.println(orangeBox.getWeightBox());
        System.out.println(orangeBox2.getWeightBox());
    }
}
