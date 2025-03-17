package dsa.recursion;

import java.util.Scanner;

public class Binary {

    public static String convert(int N) {
        if (N == 0 || N == 1) return String.valueOf(N);
        return convert(N / 2) + convert(N % 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(convert(number));
    }
}
