package com.getjavajob.training.balakinao.init.algo.lesson06;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapMatrix<K, V> implements Matrix <V> {

    Map <Key, V> hashMap;

    public HashMapMatrix() {
        this.hashMap = new HashMap <>();
    }

    @Override
    public void set(int i, int j, V value) {
        if (i < 0 || j< 0) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds"); }
        Key key = new Key(i, j);
        hashMap.put(key, value);
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (result.toString().isEmpty()) {
                result.append("{").append(entry);
            } else {
                result.append(", ").append(entry);
            }
        }
            result.append("}");
            return result.toString();
    }
    @Override
    public V get(int i, int j) {
        Key key = new Key(i, j);
        return  hashMap.get(key);
    }

    public static class Key {

        int i;
        int j;

        @Override
        public String toString() {
            return "Key:" +
                "i=" + i +
                ", j=" + j;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Key key = (Key) o;
            return i == key.i && j == key.j;
        }

        @Override
        public int hashCode() {
            return Objects.hash(i, j);
        }

        public Key(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
}