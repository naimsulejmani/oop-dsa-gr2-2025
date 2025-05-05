package dsa.queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> rradhetPerQeveri = new Queue<>();
        try {
            rradhetPerQeveri.enqueue("LVV");
            rradhetPerQeveri.enqueue("PDK");
            rradhetPerQeveri.enqueue("LDK");
            String skaShance = rradhetPerQeveri.peek();
            System.out.println("Partia qe do te qeverise eshte: " + skaShance);
            System.out.println("Partia e pare: " + rradhetPerQeveri.dequeue());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}






