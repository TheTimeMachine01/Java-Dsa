package recr;

public class recursion {

    public static void main(String[] args) {

        int num = 3;
        int power = 6;
        
        System.out.println("the factorial of num: "+ num +" is "+ factorial(num));

        System.out.println("the value "+ power +" to the power of "+ num +" is: "+ power(num, power));
    }

    private static int factorial(int value) {
        
        if(value < 1) return 1; //base case
        return value * factorial(value - 1); //recursive case
    }

    private static int power(int num, int power) {
        
        if(power < 1) return 1; //base case
        return num * power(num, power - 1); //recursive case
    }

}
