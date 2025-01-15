package Daily.components;

public class printArr {
    public printArr(int[] array) {
        System.out.print("[");
        for (int i : array)
            if (i < array.length) System.out.print(i + ", ");
            else System.out.print(i);
        System.out.print("]");
    }
}
