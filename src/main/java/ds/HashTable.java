package ds;

public class HashTable<K, V> {
    private static int INITIAL_CAPACITY = 16;
    private Entry<K, V>[] table;
    private int size;
    
    @SuppressWarnings("unchecked")
    public HashTable() {
        table = (Entry<K, V>[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }
    
    private void checkKey(K key) {
        if (key == null) {
            throw new NullKeyException();
        }
    }
    
    public void clear() {
    }
    
    public int size() {
        return 0;
    }
    
    public boolean isEmpty() {
        return false;
    }
    
    public V get(K key) {
        return null;
    }
    
    public V put(K key, V value) {
        return null;
    }
    
    public V remove(K key) {
        return null;
    }
    
    public boolean contains(K key) {
        return false;
    }
    
    private static class Entry<K, V> {
        private K key;
        private V value;
        private Entry<K, V> next;
        
        public Entry(K key, V value) {
            this(key, value, null);
        }
        
        public Entry(K  key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}
