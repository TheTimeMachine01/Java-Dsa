package DSA.LeetCode.TwoSum;

import java.util.Hashtable;

public class TwoSum {

    public static void main(String[] args) {
//        int[] array = {2, 7, 6, 3, 11, 15};
        int[] array = theArray(1000);
        int target = 679;

        long startTime;
        long endTime;
        long elapsedTime;
//        int[] sol = tSm(array, target);

//        System.out.println("The Sum of " + arraydeques[sol[0]] + " & " + array[sol[1]] + " is equals to:"+ target);

        System.out.println("Pairs in the array that sum up to " + target + ":");
//        tSm(array, target);
        startTime = System.nanoTime();
        HashApp(array, target);
        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("Time: "+ elapsedTime +"ns");

    }

    public static void tSm(int[] array, int target) {

        if (array == null || array.length < 2) {
            System.out.println("Array is null or contains less than 2 elements.");
            return;
        }

        //Brute Force Approach
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println("\t" + array[i] +", "+ array[j]);
                }
            }

        }
    }

    public static void HashApp(int[] array, int target) {
        Hashtable<Integer, Integer> table = new Hashtable<>();

        for (int i = 0; i < array.length; i++) {
            int remInt = target - array[i];
            if (table.containsKey(remInt)) {
                System.out.println("\t"+array[i]+", "+remInt);
            }
            table.put(i, array[i]);
        }

    }

    public static int[] theArray(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }
}

