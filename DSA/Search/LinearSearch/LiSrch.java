package DSA.Search.LinearSearch;

public class LiSrch {



    public static void main(String[] args) {

        int[] array = {9,1,3,8,6,8,5};

        int index = Lin(array, 1);

        if(index != -1) {
            System.out.println("Element Found at index:" + index);
        } else {
            System.out.println("Element not found");
        }
    }

    private static int Lin(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
