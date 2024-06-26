package DSA.Sorting.Selection;

public class SelectionSort {

    public static void main(String[] args) {
        int array[] = {9, 1, 4, 7, 8, 3, 6, 2, 5};

        selectionSort(array);

        for(int i : array) {
            System.out.print(i);
        }
    }

    private static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[min] > array[j]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
