package LeetCode.AddTwoNumbers.AddTwoNumbersWCarry;

import DSA.Basic.LinkedList.Link;

public class AddTwoNumbers {

    public static Link<Integer> addTwoNumbers(Link<Integer> l1, Link<Integer> l2) {

        if(l1.size() != l2.size() || l1.size() > l2.size()) {
            for (int i = 0; i < l1.size(); i++) {
                if (l2.size() == i) l2.add(0);
            }
        } else if (l2.size() != l1.size() || l2.size() > l1.size()) {
            for (int i = 0; i < l2.size(); i++) {
                if (l1.size() == i)  l1.add(0);
            }
        }

        Link<Integer> l3 = new Link<>();

        int i = 0;
        int carry = 0;
        int sum = 0;
        int rem;

        for (; i < l1.size(); i++) {
            if(l1.get(i) != 0 || l2.get(i) != 0) {

                sum = l1.get(i) + l2.get(i) + carry;
                rem = sum % 10;
                carry = sum / 10;
                sum = rem;
            }
            l3.add(sum);
        }
        if (carry != 0) {
            l3.add(carry);
        }
        return l3;
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

        l1 = new Link<>();
        l1.add(0);

        l2 = new Link<>();
        l2.add(0);

        System.out.println("\n Test case: 2");
        PrintList.print(addTwoNumbers(l1, l2));

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

        System.out.println("\n Test case: 3");
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
