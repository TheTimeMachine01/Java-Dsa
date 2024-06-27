package LeetCode.TwoSum.TwoSumHashTable;

import java.util.Hashtable;

public class TwoSum {
    public int[] twoSum(int[] numbs, int target) {
        int[] result = new int[2];

        Hashtable<Integer, Integer> table = new Hashtable<>();

        for (int i = 0; i < numbs.length; i++) {
            int difference = target - numbs[i];
            if (table.containsKey(difference)) {
                result[1] = i;
                result[0] = table.get(difference);
                return result;
            }
            table.put(numbs[i], i);
        }
        return result;
    }
}
