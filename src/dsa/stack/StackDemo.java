package dsa.stack;

public class StackDemo {
    public static void main(String[] args) throws StackUnderflowException {
        StackArray<String> emrat = new StackArray<>(3);
        try {
            emrat.push("Filan");
            emrat.push("Naim");
            emrat.push("Hana");
            emrat.push("Avdi");

        } catch (StackOverflowException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("sa emra: "+emrat.size());
        System.out.println("minimum: "+emrat.getMinimum());
        System.out.println("i fundit: "+emrat.pop());
        System.out.println(emrat.pop());
        System.out.println(emrat.pop());
        System.out.println(emrat.pop());
    }
}
