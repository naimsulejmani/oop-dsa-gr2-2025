package dsa.hash_tables;

public class HashTableDemo {
    public static void main(String[] args) {
        HashTable<String, String> hashTable = new HashTable<>();
        hashTable.put("IP", "192.168.0.1");
        hashTable.put("PORT", "8080");
        hashTable.put("API_URL", "https://api.example.com");
        hashTable.put("PORT", "9090");
        hashTable.put("URL", "https://example.com");
        hashTable.put("SECRET_KEY","12312312391789237489");
        hashTable.put("TOTAL_USERS","1000");
        hashTable.put("TOKEN","123123123123");
        hashTable.put("a","shkronja 1");
        hashTable.put("b","shkronja 2");
    }
}
