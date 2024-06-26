package DSA.Search.BinarySearch;

public class BinarySearch {

    public static void main(String[] args) {

        int array[] = new int[1000000];

        int target = 428935;

        long startTime;
        long endTime;
        long elaspsedTime;


        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        // Main operation - Start
        startTime = System.nanoTime();
        int index = binarySearch(array, target);
        endTime = System.nanoTime();

        if (index == -1) {
            System.out.println(target +"not found");
        } else {
            System.out.println("Element found at:"+ index);
        }
        // Main operation - End

        elaspsedTime = endTime - startTime;

        System.out.println("Time utilized: "+ elaspsedTime +" ns");
    }

    private static int binarySearch(int[] array, int target) {

        int low = 0;
        int high = array.length -1;

        while (low <= high) {

            int middle = low + (high - low) / 2;
            int value = array[middle];

            // System.out.println("middle: "+ value);

            if(value < target) low = middle + 1;
            else if(value > target) high = middle - 1;
            else return middle; // Target found
        }
        return -1; // Target not found
    }

}

