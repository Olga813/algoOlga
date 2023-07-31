package com.getjavajob.training.balakinao.init.algo.lesson08;

import com.getjavajob.training.balakinao.init.algo.lesson07.Node;

import static test.Assert.assertEquals;

public class BalanceableTreeTest {

    public static void main(String[] args) {
        testReduceSubtreeHeightRightLeft();
        testReduceSubtreeHeightRightRight();
        testReduceSubtreeHeightLeftLeft();
        testReduceSubtreeHeightLeftRight();

        testRotateLeftHasNotParent();
        testRotateRightHasNotParent();
        testRotateRightHasChild();
        testRotateLeftHasChild();
        testRotateRightHasParent();
        testRotateLeftHasParent();
    }

    public static void testRotateRightHasNotParent() {
        BalanceableTree <Integer> balanceableTree = new BalanceableTree <>();
        balanceableTree.add(20);
        Node <Integer> n10 = balanceableTree.add(10);
        balanceableTree.add(30);
        balanceableTree.rotate(n10);
        assertEquals("lesson08.BalanceableTreeTest.testRotateRightHasNotParent", "[10, 20, 30]",
            balanceableTree.preOrder().toString());
    }

    public static void testRotateLeftHasNotParent() {
        BalanceableTree <Integer> balanceableTree = new BalanceableTree <>();
        balanceableTree.add(20);
        balanceableTree.add(10);
        Node <Integer> n30 = balanceableTree.add(30);
        balanceableTree.rotate(n30);
        assertEquals("lesson08.BalanceableTreeTest.testRotateLeftHasNotParent", "[30, 20, 10]",
            balanceableTree.preOrder().toString());
    }

    public static void testRotateRightHasParent() {
        BalanceableTree <Integer> balanceableTree = new BalanceableTree <>();
        balanceableTree.add(40);
        balanceableTree.add(30);
        balanceableTree.add(50);
        Node <Integer> n45 = balanceableTree.add(45);
        balanceableTree.add(60);
        balanceableTree.rotate(n45);
        assertEquals("lesson08.BalanceableTreeTest.testRotateRightHasParent", "[40, 30, 45, 50, 60]",
            balanceableTree.preOrder().toString());
    }

    public static void testRotateLeftHasParent() {
        BalanceableTree <Integer> balanceableTree = new BalanceableTree <>();
        balanceableTree.add(40);
        balanceableTree.add(30);
        balanceableTree.add(50);
        balanceableTree.add(45);
        Node <Integer> n60 = balanceableTree.add(60);
        balanceableTree.rotate(n60);
        assertEquals("lesson08.BalanceableTreeTest.testRotateLeftHasParent", "[40, 30, 60, 50, 45]",
            balanceableTree.preOrder().toString());
    }

    public static void testRotateLeftHasChild() {
        BalanceableTree <Integer> balanceableTree = new BalanceableTree <>();
        balanceableTree.add(40);
        balanceableTree.add(30);
        Node <Integer> n50 = balanceableTree.add(50);
        balanceableTree.add(45);
        balanceableTree.add(60);
        balanceableTree.rotate(n50);
        assertEquals("lesson08.BalanceableTreeTest.testRotateLeftHasChild", "[50, 40, 30, 45, 60]",
            balanceableTree.preOrder().toString());
    }

    public static void testRotateRightHasChild() {
        BalanceableTree <Integer> balanceableTree = new BalanceableTree <>();
        balanceableTree.add(40);
        Node <Integer> n30 = balanceableTree.add(30);
        balanceableTree.add(50);
        balanceableTree.add(25);
        balanceableTree.add(35);
        balanceableTree.rotate(n30);
        assertEquals("lesson08.BalanceableTreeTest.testRotateRightHasChild", "[30, 25, 40, 35, 50]",
            balanceableTree.preOrder().toString());
    }

    public static void testReduceSubtreeHeightLeftLeft() {
        BalanceableTree <Integer> balanceableTree = new BalanceableTree <>();
        balanceableTree.add(10);
        balanceableTree.add(7);
        balanceableTree.add(18);
        balanceableTree.add(16);
        Node <Integer> n15 = balanceableTree.add(15);
        assertEquals("lesson08.BalanceableTreeTest.testReduceSubtreeHeightLeftLeft", "16",
            balanceableTree.reduceSubtreeHeight(n15).toString());
        assertEquals("lesson08.BalanceableTreeTest.testReduceSubtreeHeightLeftLeft", "[10, 7, 16, 15, 18]",
            balanceableTree.preOrder().toString());

    }

    public static void testReduceSubtreeHeightRightRight() {
        BalanceableTree <Integer> balanceableTree = new BalanceableTree <>();
        balanceableTree.add(10);
        balanceableTree.add(7);
        balanceableTree.add(16);
        balanceableTree.add(15);
        balanceableTree.add(18);
        balanceableTree.add(25);
        Node <Integer> n30 = balanceableTree.add(30);
        assertEquals("lesson08.BalanceableTreeTest.testReduceSubtreeHeightRightRight", "25",
            balanceableTree.reduceSubtreeHeight(n30).toString());
        assertEquals("lesson08.BalanceableTreeTest.testReduceSubtreeHeightRightRight", "[10, 7, 16, 15, 25, 18, 30]",
            balanceableTree.preOrder().toString());
    }

    public static void testReduceSubtreeHeightRightLeft() {
        BalanceableTree <Integer> balanceableTree = new BalanceableTree <>();
        balanceableTree.add(10);
        balanceableTree.add(7);
        balanceableTree.add(16);
        balanceableTree.add(15);
        balanceableTree.add(18);
        balanceableTree.add(30);
        Node <Integer> n25 = balanceableTree.add(25);
        assertEquals("lesson08.BalanceableTreeTest.testReduceSubtreeHeightRightLeft", "25",
            balanceableTree.reduceSubtreeHeight(n25).toString());
        assertEquals("lesson08.BalanceableTreeTest.testReduceSubtreeHeightRightLeft", "[10, 7, 16, 15, 25, 18, 30]",
            balanceableTree.preOrder().toString());
    }

    public static void testReduceSubtreeHeightLeftRight() {
        BalanceableTree <Integer> balanceableTree = new BalanceableTree <>();
        balanceableTree.add(10);
        balanceableTree.add(7);
        balanceableTree.add(18);
        balanceableTree.add(15);
        Node <Integer> n16 = balanceableTree.add(16);
        assertEquals("lesson08.BalanceableTreeTest.testReduceSubtreeHeightLeftRight", "16",
            balanceableTree.reduceSubtreeHeight(n16).toString());
        assertEquals("lesson08.BalanceableTreeTest.testReduceSubtreeHeightLeftRight", "[10, 7, 16, 15, 18]",
            balanceableTree.preOrder().toString());
    }

}