package dsa.recursion;

public class Factorial {
    public static long factorial(int num) {
        if (num <= 1) return 1;
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        long num = factorial(5);
        System.out.println("The factorial of 5 is " + num);

    }
}
