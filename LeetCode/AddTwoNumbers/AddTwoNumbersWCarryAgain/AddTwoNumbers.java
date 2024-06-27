package LeetCode.AddTwoNumbers.AddTwoNumbersWCarryAgain;

import DSA.Basic.LinkedList.Link;

public class AddTwoNumbers {
    public static Link<Integer> addTwoNumbers(Link<Integer> l1, Link<Integer> l2) {
        Link<Integer> result = new Link<>();
        int i = 0, j = 0;
        int carry = 0;

        while (i < l1.size() || j < l2.size() || carry != 0) {
            int sum = carry;
            if(i < l1.size()) {
                sum += l1.get(i);
                i++;
            }

            if (j < l2.size()) {
                sum += l2.get(j);
                j++;
            }
            carry = sum / 10;
            result.add(sum % 10);
        }
        return result;
    }

    public static void main(String[] args) {

        Link<Integer> l1 = new Link<>();
        l1.add(2);
        l1.add(4);
        l1.add(3);

        Link<Integer> l2 = new Link<>();
        l2.add(5);
        l2.add(6);
        l2.add(4);

        System.out.println("\n Test case: 1");
        PrintList.print(addTwoNumbers(l1, l2));
    }

    private static class PrintList {
        public static void print(Link<Integer> l3) {
            for (int i = 0; i < l3.size(); i++) {
                System.out.println("\t Value at Index "+ i + ": "+ l3.get(i));
            }
        }
    }
}
