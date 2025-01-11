// Date: 8 Jan 2025, Wednesday

// Q: Selection Sort. (Searching & Sorting) [Basic]
// A:
package DSA.Sorting.Selection;

public class Ssort {
    public static void main(String[] args) {
        int[] array = {9, 5, 3, 4, 2, 8, 1, 5, 7};

        selektionSort(array);

        for (int i : array) {
            System.out.print(i);
        }

    }

    private static void selektionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length;  j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
