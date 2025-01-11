// Date: 6 Jan 2025, Friday

// Q: Binary Search in an array. (Searching & Sorting) [Basic]
// A:
package DSA.Search.BinarySearch;

public class BiSrch {

    public static void main(String[] args) {

        int[] array = new int[100];
        int target = 42;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        int index = Bis(array, target);

        if (index == -1) {
            System.out.println(target + " not found");
        } else {
            System.out.println("Element found at: " + index);
        }

    }

    public static int Bis(int[] array,int target) {

        int low = 0; // beginning index
        int high = array.length - 1; // last index of the array

        while (low <= high) {

            int middle = low + (high - low)/2;
            int value = array[middle];

            System.out.println("middle: " + value);

            if (value < target) low = middle + 1;
            else if (value > target) high = middle - 1;
            else return middle; // target found
        }
        return -1; // target not found
    }
}
