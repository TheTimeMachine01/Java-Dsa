// Date: 9 Jan 2025, Thursday

// Q: Insertion Sort. (Searching & Sorting) [Basic]
// A:
package DSA.Sorting.Insertion;

public class Isort {
    public static void main(String[] args) {

        int[] array = {9, 5, 3, 4, 2, 8, 1, 6, 7};

        imsertionSort(array);

        for (int i : array) {
            System.out.print(i);
        }
    }

    private static void imsertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = temp;
        }
    }
}
