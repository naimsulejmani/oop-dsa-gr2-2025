package dsa.hash_tables;

public class EntryDemo {
    public static void main(String[] args) {
        Entry<String, String> entry1 = new Entry<>("IP", "192.168.0.1");
        Entry<String, String> entry2 = new Entry<>("PORT", "8080");
        Entry<String, String> entry3 = new Entry<>("API_URL", "https://api.example.com");
        Entry<Integer, String> entry4 = new Entry<>(1, "Real Madrid");
        Entry<String, Double> entry5 = new Entry<>("Priam", 2_000_000.0);

        System.out.println(entry1);
        System.out.println(entry2);
        System.out.println(entry3);
        System.out.println(entry4);
        System.out.println(entry5);
    }
}
