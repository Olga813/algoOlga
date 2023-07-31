package com.getjavajob.training.balakinao.init.algo.lesson06;

public class AssociativeArray<K, V> {

    final int MAXIMUM_CAPACITY = 1073741824;
    private final int capacity = 16;
    Node[] table;
    private float loadFactor = 0.75f;
    private int threshold = 12;
    private int size;

    public AssociativeArray() {
        this.table = new Node[capacity];
    }

    public AssociativeArray(int capacity) {
        this(capacity, 0.75f);
    }

    public AssociativeArray(int capacity, float loadFactor) {
        if (capacity < 0)
            throw new IllegalArgumentException("Illegal initial capacity: " +
                capacity);
        else if (capacity > MAXIMUM_CAPACITY) {
            capacity = MAXIMUM_CAPACITY;
        } else if (loadFactor <= 0) {
            throw new IllegalArgumentException("Illegal load factor: " +
                loadFactor);
        }
        this.loadFactor = loadFactor;
        resize(capacity);
        this.threshold = (int) (loadFactor * capacity);
    }
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Node<K,V> element : table) {
            for (Node<K,V> e = element; e!=null ; e=e.next) {
                if (result.toString().isEmpty()){
                    result.append("{").append(e);}
                else {
                    result.append(", ").append(e);
                }
            }
        }
        return result+"}";
    }
    public int hash(int h) {
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }

    public int indexFor(int hashCode, int length) {
        return hashCode &( length-1);
    }

    public V add(K key, V value) {
        if (key == null)
            return putForNullKey(value);
        int hash = hash(key.hashCode());
        int i = indexFor(hash, table.length);
        for (Node <K, V> e = table[i]; e != null; e = e.next) {
            Object k;
            if (e.hash == hash && ((k = e.key) == key || key.equals(k))) {
                V oldValue = e.value;
                e.value = value;
                return oldValue;
            }
        }
        addNode(hash, key, value, i);
        return null;
    }

    private V putForNullKey(V value) {
        for (Node <K, V> e = table[0]; e != null; e = e.next) {
            if (e.key == null) {
                V oldValue = e.value;
                e.value = value;
                return oldValue;
            }
        }
        addNode(0, null, value, 0);
        return null;
    }

    void addNode(int hash, K key, V value, int bucketIndex) {
        Node <K, V> e = table[bucketIndex];
        table[bucketIndex] = new Node <K, V>(hash, key, value, e);
        if (size++ >= threshold)
            resize(2 * table.length);
    }

   public void resize(int newCapacity) {
        Node[] oldTable = table;
        int oldCapacity = oldTable.length;
        if (oldCapacity == MAXIMUM_CAPACITY) {
            threshold = Integer.MAX_VALUE;
            return;
        }
        Node[] newTable = new Node[newCapacity];
        transfer(newTable);
        table = newTable;
        threshold = (int)(newCapacity * loadFactor);
    }
   public void transfer(Node[] newTable) {
        Node[] src = table;
        int newCapacity = newTable.length;
        for (int j = 0; j < src.length; j++) {
            Node<K,V> e = src[j];
            if (e != null) {
                src[j] = null;
                do {
                    Node<K,V> next = e.next;
                    int i = indexFor(e.hash, newCapacity);
                    e.next = newTable[i];
                    newTable[i] = e;
                    e = next;
                } while (e != null);
            }
        }
    }

    public V remove(K key) {
        Node <K, V> e = removeNodeForKey(key);
        return (e == null ? null : e.value);
    }

    public Node <K, V> removeNodeForKey(Object key) {
        int hash = (key == null) ? 0 : hash(key.hashCode());
        int i = indexFor(hash, table.length);
        Node <K, V> prev = table[i];
        Node <K, V> e = prev;
        while (e != null) {
            Node <K, V> next = e.next;
            Object k;
            if (e.hash == hash &&
                ((k = e.key) == key || (key != null && key.equals(k)))) {
                size--;
                if (prev == e)
                    table[i] = next;
                else
                    prev.next = next;
                return e;
            }
            prev = e;
            e = next;
        }
        return e;
    }

  public V get(K key) {
        if (key == null)
            return getForNullKey();
        int hash = hash(key.hashCode());
        for (Node <K, V> e = table[indexFor(hash, table.length)]; e != null; e = e.next) {
            Object k;
            if (e.hash == hash && ((k = e.key) == key || key.equals(k)))
                return e.value;
        }
        return null;
    }

    private V getForNullKey() {
        for (Node <K, V> e = table[0]; e != null; e = e.next) {
            if (e.key == null)
                return e.value;
        }
        return null;
    }

    public int size() {
        return size;
    }

    private static class Node<K, V> {

        final int hash;
        final K key;
        V value;
        Node <K, V> next;

        public Node(int hash, K key, V value, Node <K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public V setValue(V newValue) {
            V oldValue = value;
            value = newValue;
            return oldValue;
        }

        @Override
        public String toString() {
            return ""+key +"="+ value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node <V, K> node = (Node <V, K>) o;
            return key.equals(node.key) && value.equals(node.value);
        }

        public final int hashCode() {
            return (key==null   ? 0 : key.hashCode()) ^
                (value==null ? 0 : value.hashCode());
        }
    }

}