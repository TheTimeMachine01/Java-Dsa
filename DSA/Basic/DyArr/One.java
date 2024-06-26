package DSA.Basic.DyArr;

public class One<T> {

    private int size;
    private int capacity;
    private Object[] array;

    public One() {
        this.capacity = 10;
        this.array = new Object[capacity];
    }

    public One(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data) {
        if(size >= capacity) {
            grow();
        }
        array[size] = data;
        size++;
    }

    public void insert(int index,Object data) {

        if(size >= capacity) {
            grow();
        }

        for(int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;
    }

    public void delete(Object data) {
        for (int i = 0; i < size; i++) {
            if(array[i] == data) {
                for (int j = 0; j < (size - i - 1 ); j++) {
                    array[i + j] = array[i + j + 1];
                }
                array[size - 1] = null;
                size--;
                if(size <= capacity/3) {
                    shrink();
                }
                break;
            }
        }
    }

    public int search(Object data) {

        for (int i = 0; i < size; i++) {
            if(array[i] == data) {
                return i;
            }
        }
        return -1;
    }

    private void grow() {

        int newCapacity = capacity * 2;
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    private void shrink() {

        int newCapacity = capacity / 2;
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;

    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {

        String string = "";

        for (int i = 0; i < capacity; i++) {
            string += array[i] + ", ";
        }

        if(!"".equals(string)) {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        } else {
            string = "[]";
        }

        return string;
    }


    public static void main(String[] args) {

        @SuppressWarnings("rawtypes")
        One one = new One<>(5);

        one.add("A");
        one.add("B");
        one.add("C");
        one.add("D");
        one.add("E");
        one.add("F");


        one.delete("A");
        one.delete("B");
        one.delete("C");
        one.insert(0, "X");
        one.insert(0, "Y");
        one.insert(0, "Z");

        System.out.println(" ");
        System.out.println(" ");

        // System.out.println("the index of C is: "+ one.search("C"));

        System.out.println(one);
        System.out.println("Size: "+ one.size);
        System.out.println("Capacity: "+ one.capacity);
        System.out.println("Empty: "+ one.isEmpty());

        System.out.println(" ");
        System.out.println(" ");
    }

}
