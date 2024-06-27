package LeetCode.TwoSum.TwoSumBruteForce;

public class TwoSum {
    public int[] twoSum(int[] numbs, int target) {
        // Array to store the result indices
        int[] result = new int[2];

        for (int i = 0; i < numbs.length; i++) {
            for (int j = i + 1; j < numbs.length; j++) {
                if (numbs[i] + numbs[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] numbs = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(numbs, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}

