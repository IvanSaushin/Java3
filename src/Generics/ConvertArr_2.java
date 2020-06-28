package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArr_2<A> {
    private A[] arraysA;
    ArrayList<A> convertClone = new ArrayList<>();

    public A[] getArraysA() {
        return arraysA;
    }

    public ConvertArr_2(A... arraysA) {
        this.arraysA = arraysA;
    }

    public ArrayList<A> convert() {
        ArrayList<A> convertClone = new ArrayList<A>(Arrays.asList(arraysA));
        return convertClone;
    }

    public void showArrays() {
        for (int i = 0; i < arraysA.length; i++) {
            System.out.print(arraysA[i] + ", ");
        }
        System.out.println();
    }
}
