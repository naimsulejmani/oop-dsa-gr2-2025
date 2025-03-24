package dsa.recursion;

public class Detyra1 {
    //printimi i numrave prej 10 deri ne 1 duke perdorerur rekurzion
    public static void main(String[] args) {
//        print(10);
        printArray(new int[]{4, 5, 123, 123, 54}, 0);
    }

    public static void printArray(int[] array, int index) {
        if (index >= array.length) return;
        System.out.println(array[index]);
        printArray(array, index + 1);
    }

    public static void print(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        print(num - 1);

    }
}
