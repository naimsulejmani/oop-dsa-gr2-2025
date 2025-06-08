package dsa.hash_tables;

import java.util.ArrayList;
import java.util.Arrays;

public class HashTable<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;// 75%

    //    private Entry<K,V>[] hashTable;
    private ArrayList<Entry<K, V>>[] hashTable;
    private int size;

    public HashTable() {
        this(DEFAULT_CAPACITY);
    }

    public HashTable(int defaultCapacity) {
        this.hashTable = new ArrayList[defaultCapacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public int hash(K key) {
        return (key.hashCode() & 0x7FFFFFFF) % hashTable.length;
    }

    public void put(K key, V value) {
        int hashIndex = hash(key);

        Entry<K, V> newEntry = new Entry<>(key, value);

        if (hashTable[hashIndex] == null) {
            hashTable[hashIndex] = new ArrayList<>();
            hashTable[hashIndex].add(newEntry);
        } else {
            for (Entry<K, V> entry : hashTable[hashIndex]) {
                if (entry.getKey().equals(key)) {
                    entry.setValue(value);
                    return;
                }
            }
            hashTable[hashIndex].add(newEntry);
        }
        size++;
    }

    public V get(K key) {
        int hashIndex = hash(key);
        for (Entry<K, V> entry : hashTable[hashIndex]) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public boolean containsKey(K key) {
        return get(key) != null;
    }

    public K getKey(V value) {
        for (ArrayList<Entry<K, V>> entries : hashTable) {
            if (entries != null) {
                for (Entry<K, V> entry : entries) {
                    if (entry.getValue().equals(value)) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public boolean containsValue(V value) {
        return getKey(value) != null;
    }

    public void remove(K key) {
        int hashIndex = hash(key);
        for (Entry<K, V> entry : hashTable[hashIndex]) {
            if (entry.getKey().equals(key)) {
                hashTable[hashIndex].remove(entry);
                size--;
                return;
            }
        }
    }

    public void clear() {
//        for(int i = 0; i<hashTable.length; i++) {
//            hashTable[i] = null;
//        }

        Arrays.fill(hashTable, null);
    }

    public K[] keys() {
        Object[] keys = new Object[size];
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] != null) {
                for (Entry<K, V> entry : hashTable[i]) {
                    keys[i] = entry.getKey();
                    if (hashTable[i].size() > 1) {
                        i++;
                    }
                }
            }
        }
        return (K[]) keys;
    }

    public V[] values() {
        Object[] values = new Object[size];
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] != null) {
                for (Entry<K, V> entry : hashTable[i]) {
                    values[i] = entry.getValue();
                    if (hashTable[i].size() > 1) {
                        i++;
                    }
                }
            }
        }
        return (V[]) values;
    }
}








