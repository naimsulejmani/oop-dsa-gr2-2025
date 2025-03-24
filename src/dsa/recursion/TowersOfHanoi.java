package dsa.recursion;

public class TowersOfHanoi {
    public static void towersOfHanoi(int n, char from, char to, char aux) {

        if (n == 1) {
            System.out.println("Move disk 1 from rod " + from + " to rod " + to);
            return;
        }
        towersOfHanoi(n - 1, from, aux, to);
        System.out.println("Move disk " + n + " from rod " + from + " to rod " + to);
        towersOfHanoi(n - 1, aux, to, from);
    }

    public static void main(String[] args) {
        towersOfHanoi(4, 'S', 'D', 'I');
    }
}
