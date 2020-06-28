package Generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//       Task 1
        System.out.println("Task 1");
        Arrays_1<Integer> numberMas1 = new Arrays_1<>(1,4,9,16,25);
        Arrays_1<String> seasons = new Arrays_1<>("Winter", "Spring", "Autumn", "Summer");

        System.out.print("Числовой массив:  "); numberMas1.showArrays();
        numberMas1.changeArrays(2,3);
        System.out.print("Числ.массив после перестановки 3 и 4 элемента:  ");
        numberMas1.showArrays();

        System.out.print("Строкоый массив:  ");seasons.showArrays();
        System.out.print("Времена года после перестановки:  ");
        seasons.changeArrays(3,2);
        seasons.showArrays();

        System.out.println();
//       Task 2
        System.out.println("Task 2");
        ConvertArr_2<Integer> numArrays = new ConvertArr_2<>(1,4,9,16,25);
        numArrays.showArrays();

//        Создаем arrayList из исходного методом convert
        ArrayList array2 = numArrays.convert();
        System.out.println("Объем нового arrayList - "+array2.size());
        System.out.print("Отобразить массив: ");
        showMas(array2);

        System.out.print("Добавляем элемент 36 в наш новый массив - ");
        System.out.println(array2.add(36));
        System.out.println("Величина нового массива после добавления - "+array2.size());
        System.out.print("Отобразить массив после добавления: ");
        showMas(array2);

//        Проведем ту же операцию со строковым массивом
        System.out.println();
        System.out.println("Проведем ту же операцию со строковым массивом");
        ConvertArr_2<String> strArray = new ConvertArr_2<>("one", "two", "three", "four", "five");
        System.out.print("Отобразить заданный строковый массив: ");
        strArray.showArrays();

        ArrayList strArrList = strArray.convert();
        showMas(strArrList); //отобразить созданный динамический массив
        strArrList.add("six"); // добавить 6-й элеммент в новый массив
        strArrList.size(); // размер динамического массива после добавления
        showMas(strArrList); //отобразить содержимое массива после изменений
     }

    //    для второго задания
    public static void showMas(ArrayList<?> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + ", ");
        }
        System.out.println();
    }
}
