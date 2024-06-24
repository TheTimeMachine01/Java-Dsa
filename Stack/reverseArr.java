class CuStack {

    private final int maxSize;
    private final int[] stackArray;
    private int top;

    public CuStack(int size) {

        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public boolean push(int value) {
        if (top >= maxSize - 1) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            stackArray[++top] = value;
            return true;
        }
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return stackArray[top--];
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}

public class reverseArr {

    public static void rev(int Arr[], int n) {

        CuStack obj = new CuStack(n);

        for (int i = 0; i < n; i++) {

            obj.push(Arr[i]);
        }

        for (int i = 0; i < n; i++) {
            
            Arr[i] = obj.pop();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(Arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        
        int n = 5;

        int[] a = new int[] {100, 200, 300, 400, 500};

        rev(a, n);
    }
    
}
