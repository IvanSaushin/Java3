package Generics;

public class Arrays_1<T> {
    private T[] tArrays;

    public T[] getNumMassive() {
        return tArrays;
    }

    public Arrays_1(T... tArrays) {
        this.tArrays = tArrays;
    }

    public void changeArrays(int a, int b) {
        T temp = tArrays[a];
        tArrays[a] = tArrays[b];
        tArrays[b] = temp;
    }

    public void showArrays() {
        for (int i = 0; i < tArrays.length; i++) {
            System.out.print(tArrays[i] + ", ");
        }
        System.out.println();
    }

}
