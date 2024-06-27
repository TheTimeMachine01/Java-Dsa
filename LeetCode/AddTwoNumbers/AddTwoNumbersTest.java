package LeetCode.AddTwoNumbers;

import DSA.Basic.LinkedList.Link;
import LeetCode.AddTwoNumbers.AddTwoNumbersWCarry.AddTwoNumbers;

import java.util.Arrays;

//import static LeetCode.AddTwoNumbers.AddTwoNumbersWCarry.AddTwoNumbers.addTwoNumbers;
import static LeetCode.AddTwoNumbers.AddTwoNumbersWCarryAgain.AddTwoNumbers.addTwoNumbers;

public class AddTwoNumbersTest {

    public static void main(String[] args) {
        AddTwoNumbers solution = new AddTwoNumbers();

        //Test Case 1
        Link<Integer> l1 = new Link<>();
        l1.add(2);
        l1.add(4);
        l1.add(3);

        Link<Integer> l2 = new Link<>();
        l2.add(5);
        l2.add(6);
        l2.add(4);

        System.out.println("\nTest case 1:");
        int[] expected1 = {7, 0, 8};
        int[] array1 = addTwoNumbers(l1, l2).toArray(); // Expected output: 7 -> 0 > 8
        if(Arrays.equals(expected1, array1)) {
            System.out.println("\t"+Arrays.toString(array1));
            System.out.println("\u001B[32m ===== Test Case Passed! ===== \u001B[0m");
        } else {
            System.out.println(Arrays.toString(array1));
            System.out.println("\u001B[31m ===== Test Case Failed! ===== \u001B[0m");
        }

        //Test Case 2
        l1 = new Link<>();
        l1.add(0);

        l2 = new Link<>();
        l2.add(0);

        System.out.println("\nTest case 2:");
        int[] expected2 = {0};
        int[] array2 = addTwoNumbers(l1, l2).toArray(); // Expected output: 7 -> 0 > 8
        if(Arrays.equals(expected2, array2)) {
            System.out.println("\t"+Arrays.toString(array2));
            System.out.println("\u001B[32m ===== Test Case Passed! ===== \u001B[0m");
        } else {
            System.out.println(Arrays.toString(array2));
            System.out.println("\u001B[31m ===== Test Case Failed! ===== \u001B[0m");
        }

        //Test Case 3
        l1 = new Link<>();
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);

        l2 = new Link<>();
        l2.add(9);
        l2.add(9);
        l2.add(9);
        l2.add(9);

        System.out.println("\nTest case 3:");
        int[] expected3 = {8, 9, 9, 9, 0, 0, 0, 1};
        int[] array3 = addTwoNumbers(l1, l2).toArray(); // Expected output: 7 -> 0 > 8
        if(Arrays.equals(expected3, array3)) {
            System.out.println("\t"+Arrays.toString(array3));
            System.out.println("\u001B[32m ===== Test Case Passed! ===== \u001B[0m");
        } else {
            System.out.println(Arrays.toString(array3));
            System.out.println("\u001B[31m ===== Test Case Failed! ===== \u001B[0m");
        }
    }

    private static class PrintList {
        public static void print(Link<Integer> l3) {
            for (int i = 0; i < l3.size(); i++) {
                System.out.println("\t Value at Index "+ i + ": "+ l3.get(i));
            }
            System.out.println("\u001B[34m Failed! \u001B[0m");
        }
    }
}
