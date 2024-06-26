package DSA.Search.LinearSearch;

public class LinearSearch {
    public static void main(String args[]) {
        // int[] array = {2, 5, 6, 4, 8, 9};
        int[] array = new int[100];
        // int target = 42;

        long startTime;
        long endTime;
        long elapsedTime;

        //******************** Linear Search *******************************

        // ===> Main operation - Start
        startTime = System.nanoTime();
        int index = ls(array, 428935);
        endTime = System.nanoTime();

        if (index != -1) {
            System.out.println("Element found at index:" + index);
        } else {
            System.out.println("Element not found");
        }

        // ===> Main operation - End


        elapsedTime = endTime - startTime;

        System.out.println("Time utilized: "+ elapsedTime +" ns");

    }

    private static int ls(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {
            if(array[i] == value) {
                return i;
            }
        }

        return -1;
    }
}
