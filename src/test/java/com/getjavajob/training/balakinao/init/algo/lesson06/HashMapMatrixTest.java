package com.getjavajob.training.balakinao.init.algo.lesson06;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

import static test.Assert.assertEquals;

    public class HashMapMatrixTest {
        public static void main(String[] args) {
            testHashMapMatrixTestSet();
            testHashMapMatrixTestGet();
        }

        public static void testHashMapMatrixTestSet() {
            HashMapMatrix <Key, Integer> matrixNumbers = new HashMapMatrix <>();
            Map <HashMapMatrix.Key,Integer> hashMap = new HashMap <>();
            for (int i = 0; i < 10; i++) {
                matrixNumbers.set(9,i, i);
                hashMap.put(new HashMapMatrix.Key(9,i),i);
            }
        assertEquals("lesson06.HashMapMatrixTest.testHashMapMatrixTestSet", hashMap.toString(), matrixNumbers.toString());
        }

        public static void testHashMapMatrixTestGet() {
            HashMapMatrix <Key, Integer> matrixNumbers = new HashMapMatrix <>();
            for (int i = 0; i < 10; i++) {
                matrixNumbers.set(i,10, i);
            }
            assertEquals("lesson06.HashMapMatrixTest.testHashMapMatrixTestGet", "4",matrixNumbers.get(4,10).toString());
        }

    }