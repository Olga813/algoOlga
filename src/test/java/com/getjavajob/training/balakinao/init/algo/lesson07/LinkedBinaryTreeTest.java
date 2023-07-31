package com.getjavajob.training.balakinao.init.algo.lesson07;

import java.util.Collection;
import java.util.LinkedList;

import static test.Assert.assertEquals;

public class LinkedBinaryTreeTest {

    public static void main(String[] args) {
        testTreeIsEmpty();
        testTreeValidate();
        testTreeAddRoot();
        testTreeAdd();
        testTreeAddLeft();
        testTreeAddRight();
        testTreeSet();
        testTreeRemove();
        testTreeLeft();
        testTreeRight();
        testTreeRoot();
        testTreeParent();
        testTreeSize();
        testTreeSibling();
        testTreeChildren();
        testTreeChildrenNumber();
        testTreeIsInternal();
        testTreeIsExternal();
        testTreeIsRoot();
        testPreOder();
        testPostOder();
        testBreadthFirst();
        testNodes();
        testInOrder();
    }

    public static void testTreeIsEmpty() {
        LinkedBinaryTree <Integer> treeActual = new LinkedBinaryTree <>();
        Node <Integer> node1 = treeActual.add(null, 1);
        Node <Integer> node2 = treeActual.addLeft(node1, 2);
        Node <Integer> node3 = treeActual.addRight(node1, 3);
        treeActual.add(node2, 4);
        treeActual.add(node2, 5);
        treeActual.add(node3, 6);
        treeActual.add(node3, 7);
        assertEquals("lesson07.LinkedBinaryTreeTest.testTreeIsEmpty", false, treeActual.isEmpty());
    }

    public static void testTreeValidate() {
        LinkedBinaryTree <Integer> treeActual = new LinkedBinaryTree <>();
        Node <Integer> node1 = treeActual.add(null, 1);
        Collection <Node <Integer>> collectionExpected = new LinkedList <>();
        collectionExpected.add(node1);
        assertEquals("lesson07.LinkedBinaryTreeTest.testNodes", "1", treeActual.validate(node1).toString());
    }

    public static void testTreeAddRoot() {
        LinkedBinaryTree <Integer> treeActual = new LinkedBinaryTree <>();
        Node <Integer> node1 = treeActual.addRoot(1);
        Node <Integer> node2 = treeActual.add(node1, 2);
        Node <Integer> node3 = treeActual.add(node1, 3);
        Node <Integer> node4 = treeActual.add(node2, 4);
        Node <Integer> node5 = treeActual.add(node2, 5);
        Node <Integer> node6 = treeActual.add(node3, 6);
        Node <Integer> node7 = treeActual.add(node3, 7);
        Collection <Node <Integer>> collectionExpected = new LinkedList <>();
        collectionExpected.add(node4);
        collectionExpected.add(node2);
        collectionExpected.add(node5);
        collectionExpected.add(node1);
        collectionExpected.add(node6);
        collectionExpected.add(node3);
        collectionExpected.add(node7);
        assertEquals("lesson07.LinkedBinaryTreeTest.testTreeAddRoot", collectionExpected, treeActual.nodes());
    }

    public static void testTreeAdd() {
        LinkedBinaryTree <Integer> treeActual = new LinkedBinaryTree <>();
        Node <Integer> node1 = treeActual.add(null, 1);
        Node <Integer> node2 = treeActual.add(node1, 2);
        Node <Integer> node3 = treeActual.add(node1, 3);
        Node <Integer> node4 = treeActual.add(node2, 4);
        Node <Integer> node5 = treeActual.add(node2, 5);
        Node <Integer> node6 = treeActual.add(node3, 6);
        Node <Integer> node7 = treeActual.add(node3, 7);
        Collection <Node <Integer>> collectionExpected = new LinkedList <>();
        collectionExpected.add(node4);
        collectionExpected.add(node2);
        collectionExpected.add(node5);
        collectionExpected.add(node1);
        collectionExpected.add(node6);
        collectionExpected.add(node3);
        collectionExpected.add(node7);
        assertEquals("lesson07.LinkedBinaryTreeTest.testTreeAdd", collectionExpected, treeActual.nodes());
    }

    public static void testTreeAddLeft() {
        LinkedBinaryTree <Integer> treeActual = new LinkedBinaryTree <>();
        Node <Integer> node1 = treeActual.add(null, 1);
        Node <Integer> node2 = treeActual.addLeft(node1, 2);
        Node <Integer> node3 = treeActual.add(node1, 3);
        Node <Integer> node4 = treeActual.add(node2, 4);
        Node <Integer> node5 = treeActual.add(node2, 5);
        Node <Integer> node6 = treeActual.add(node3, 6);
        Node <Integer> node7 = treeActual.add(node3, 7);
        Collection <Node <Integer>> collectionExpected = new LinkedList <>();
        collectionExpected.add(node4);
        collectionExpected.add(node2);
        collectionExpected.add(node5);
        collectionExpected.add(node1);
        collectionExpected.add(node6);
        collectionExpected.add(node3);
        collectionExpected.add(node7);
        assertEquals("lesson07.LinkedBinaryTreeTest.testTreeAddLeft", collectionExpected,
            treeActual.nodes());
    }

    public static void testTreeAddRight() {
        LinkedBinaryTree <Integer> treeActual = new LinkedBinaryTree <>();
        Node <Integer> node1 = treeActual.add(null, 1);
        Node <Integer> node2 = treeActual.addLeft(node1, 2);
        Node <Integer> node3 = treeActual.addRight(node1, 3);
        Node <Integer> node4 = treeActual.add(node2, 4);
        Node <Integer> node5 = treeActual.add(node2, 5);
        Node <Integer> node6 = treeActual.add(node3, 6);
        Node <Integer> node7 = treeActual.add(node3, 7);
        Collection <Node <Integer>> collectionExpected = new LinkedList <>();
        collectionExpected.add(node4);
        collectionExpected.add(node2);
        collectionExpected.add(node5);
        collectionExpected.add(node1);
        collectionExpected.add(node6);
        collectionExpected.add(node3);
        collectionExpected.add(node7);
        assertEquals("lesson07.LinkedBinaryTreeTest.testTreeAddRight", collectionExpected,
            treeActual.nodes());
    }

    public static void testTreeSet() {
        LinkedBinaryTree <Integer> treeActual = new LinkedBinaryTree <>();
        Node <Integer> node1 = treeActual.add(null, 1);
        Node <Integer> node2 = treeActual.addLeft(node1, 2);
        Node <Integer> node3 = treeActual.add(node1, 3);
        treeActual.set(node3, 555);
        Collection <Node <Integer>> collectionExpected = new LinkedList <>();
        collectionExpected.add(node2);
        collectionExpected.add(node1);
        Node <Integer> node4 = treeActual.right(node1);
        collectionExpected.add(node4);
        assertEquals("lesson07.LinkedBinaryTreeTest.testTreeSet", collectionExpected, treeActual.nodes()
        );
    }

    public static void testTreeRemove() {
        LinkedBinaryTree <Integer> treeActual = new LinkedBinaryTree <>();
        Node <Integer> node1 = treeActual.add(null, 1);
        Node <Integer> node2 = treeActual.addLeft(node1, 2);
        Node <Integer> node3 = treeActual.addRight(node1, 3);
        Node <Integer> node4 = treeActual.add(node2, 4);
        Node <Integer> node5 = treeActual.add(node2, 5);
        Node <Integer> node6 = treeActual.add(node3, 6);
        Node <Integer> node7 = treeActual.add(node3, 7);
        treeActual.remove(node6);
        Collection <Node <Integer>> collectionExpected = new LinkedList <>();
        collectionExpected.add(node4);
        collectionExpected.add(node2);
        collectionExpected.add(node5);
        collectionExpected.add(node1);
        collectionExpected.add(node3);
        collectionExpected.add(node7);
        assertEquals("lesson07.LinkedBinaryTreeTest.testTreeRemove", collectionExpected, treeActual.nodes()
        );
    }

    public static void testTreeLeft() {
        LinkedBinaryTree <Integer> treeActual = new LinkedBinaryTree <>();
        Node <Integer> node1 = treeActual.add(null, 1);
        treeActual.addLeft(node1, 2);
        treeActual.addRight(node1, 3);
        assertEquals("lesson07.LinkedBinaryTreeTest.testTreeAddLeft", "2", treeActual.left(node1).toString());
    }

    public static void testTreeRight() {
        LinkedBinaryTree <Integer> treeActual = new LinkedBinaryTree <>();
        Node <Integer> node1 = treeActual.add(null, 1);
        treeActual.addLeft(node1, 2);
        treeActual.addRight(node1, 3);
        assertEquals("lesson07.LinkedBinaryTreeTest.testTreeRight", "3",
            treeActual.right(node1).toString());
    }

    public static void testTreeRoot() {
        LinkedBinaryTree <Integer> treeActual = new LinkedBinaryTree <>();
        treeActual.addRoot(1);
        assertEquals("lesson07.LinkedBinaryTreeTest. testTreeRoot", "1",
            treeActual.root().toString());
    }

    public static void testTreeParent() {
        LinkedBinaryTree <Integer> treeActual = new LinkedBinaryTree <>();
        Node <Integer> node1 = treeActual.add(null, 1);
        Node <Integer> node2 = treeActual.addLeft(node1, 2);
        treeActual.addRight(node1, 3);
        assertEquals("lesson07.LinkedBinaryTreeTest.testTreeAddLeft", node1,
            treeActual.parent(node2));
    }

    public static void testTreeSize() {
        LinkedBinaryTree <Integer> treeActual = new LinkedBinaryTree <>();
        Node <Integer> node1 = treeActual.add(null, 1);
        Node <Integer> node2 = treeActual.add(node1, 2);
        Node <Integer> node3 = treeActual.add(node1, 3);
        treeActual.add(node2, 4);
        treeActual.add(node2, 5);
        treeActual.add(node3, 6);
        treeActual.add(node3, 7);
        assertEquals("lesson07.LinkedBinaryTreeTest.testTreeSize", 7,
            treeActual.size());
    }

    public static void testTreeSibling() {
        LinkedBinaryTree <Integer> treeActual = new LinkedBinaryTree <>();
        Node <Integer> node1 = treeActual.add(null, 1);
        Node <Integer> node2 = treeActual.addLeft(node1, 2);
        Node <Integer> node3 = treeActual.addRight(node1, 3);
        treeActual.add(node2, 4);
        treeActual.add(node2, 5);
        treeActual.add(node3, 6);
        treeActual.add(node3, 7);
        assertEquals("lesson07.LinkedBinaryTreeTest.testTreeSibling", "3",
            treeActual.sibling(node2).toString());
    }

    public static void testTreeChildren() {
        LinkedBinaryTree <Integer> treeActual = new LinkedBinaryTree <>();
        Node <Integer> node1 = treeActual.add(null, 1);
        Node <Integer> node2 = treeActual.addLeft(node1, 2);
        Node <Integer> node3 = treeActual.addRight(node1, 3);
        Node <Integer> node4 = treeActual.add(node2, 4);
        Node <Integer> node5 = treeActual.add(node2, 5);
        treeActual.add(node3, 6);
        treeActual.add(node3, 7);
        Collection <Node <Integer>> collectionExpected = new LinkedList <>();
        collectionExpected.add(node4);
        collectionExpected.add(node5);
        assertEquals("lesson07.LinkedBinaryTreeTest.testTreeChildren", collectionExpected, treeActual.children(node2)
        );
    }

    public static void testTreeChildrenNumber() {
        LinkedBinaryTree <Integer> treeActual = new LinkedBinaryTree <>();
        Node <Integer> node1 = treeActual.add(null, 1);
        Node <Integer> node2 = treeActual.addLeft(node1, 2);
        Node <Integer> node3 = treeActual.addRight(node1, 3);
        treeActual.add(node2, 4);
        treeActual.add(node2, 5);
        treeActual.add(node3, 6);
        assertEquals("lesson07.LinkedBinaryTreeTest.testTreeChildrenNumber", 1, treeActual.childrenNumber(node3));
    }

    public static void testTreeIsInternal() {
        LinkedBinaryTree <Integer> treeActual = new LinkedBinaryTree <>();
        Node <Integer> node1 = treeActual.add(null, 1);
        Node <Integer> node2 = treeActual.addLeft(node1, 2);
        Node <Integer> node3 = treeActual.addRight(node1, 3);
        treeActual.add(node2, 4);
        treeActual.add(node2, 5);
        treeActual.add(node3, 6);
        treeActual.add(node3, 7);
        assertEquals("lesson07.LinkedBinaryTreeTest.testTreeIsInternal", true, treeActual.isInternal(node2)
        );
    }

    public static void testTreeIsExternal() {
        LinkedBinaryTree <Integer> treeActual = new LinkedBinaryTree <>();
        Node <Integer> node1 = treeActual.add(null, 1);
        Node <Integer> node2 = treeActual.addLeft(node1, 2);
        Node <Integer> node3 = treeActual.addRight(node1, 3);
        Node <Integer> node4 = treeActual.add(node2, 4);
        treeActual.add(node2, 5);
        treeActual.add(node3, 6);
        treeActual.add(node3, 7);
        assertEquals("lesson07.LinkedBinaryTreeTest.testTreeIsExternal", true, treeActual.isExternal(node4)
        );
    }

    public static void testTreeIsRoot() {
        LinkedBinaryTree <Integer> treeActual = new LinkedBinaryTree <>();
        Node <Integer> node1 = treeActual.add(null, 1);
        Node <Integer> node2 = treeActual.addLeft(node1, 2);
        Node <Integer> node3 = treeActual.addRight(node1, 3);
        treeActual.add(node2, 4);
        treeActual.add(node2, 5);
        treeActual.add(node3, 6);
        treeActual.add(node3, 7);
        assertEquals("lesson07.LinkedBinaryTreeTest.testTreeIsRoot", true, treeActual.isRoot(node1)
        );
    }

    public static void testPreOder() {
        LinkedBinaryTree <Integer> treeActual = new LinkedBinaryTree <>();
        Node <Integer> node1 = treeActual.add(null, 1);
        Node <Integer> node2 = treeActual.add(node1, 2);
        Node <Integer> node3 = treeActual.add(node1, 3);
        Node <Integer> node4 = treeActual.add(node2, 4);
        Node <Integer> node5 = treeActual.add(node2, 5);
        Node <Integer> node6 = treeActual.add(node3, 6);
        Node <Integer> node7 = treeActual.add(node3, 7);
        Collection <Node <Integer>> collectionExpected = new LinkedList <>();
        collectionExpected.add(node1);
        collectionExpected.add(node2);
        collectionExpected.add(node4);
        collectionExpected.add(node5);
        collectionExpected.add(node3);
        collectionExpected.add(node6);
        collectionExpected.add(node7);
        assertEquals("lesson07.LinkedBinaryTreeTest.testPreOder", collectionExpected,
            treeActual.preOrder());
    }

    public static void testPostOder() {
        LinkedBinaryTree <Integer> treeActual = new LinkedBinaryTree <>();
        Node <Integer> node1 = treeActual.add(null, 1);
        Node <Integer> node2 = treeActual.add(node1, 2);
        Node <Integer> node3 = treeActual.add(node1, 3);
        Node <Integer> node4 = treeActual.add(node2, 4);
        Node <Integer> node5 = treeActual.add(node2, 5);
        Node <Integer> node6 = treeActual.add(node3, 6);
        Node <Integer> node7 = treeActual.add(node3, 7);
        Collection <Node <Integer>> collectionExpected = new LinkedList <>();
        collectionExpected.add(node4);
        collectionExpected.add(node5);
        collectionExpected.add(node2);
        collectionExpected.add(node6);
        collectionExpected.add(node7);
        collectionExpected.add(node3);
        collectionExpected.add(node1);
        assertEquals("lesson07.LinkedBinaryTreeTest.testPostOder", collectionExpected,
            treeActual.postOrder());
    }

    public static void testBreadthFirst() {
        LinkedBinaryTree <Integer> treeActual = new LinkedBinaryTree <>();
        Node <Integer> node1 = treeActual.add(null, 1);
        Node <Integer> node2 = treeActual.add(node1, 2);
        Node <Integer> node3 = treeActual.add(node1, 3);
        Node <Integer> node4 = treeActual.add(node2, 4);
        Node <Integer> node5 = treeActual.add(node2, 5);
        Node <Integer> node6 = treeActual.add(node3, 6);
        Node <Integer> node7 = treeActual.add(node3, 7);
        Collection <Node <Integer>> collectionExpected = new LinkedList <>();
        collectionExpected.add(node1);
        collectionExpected.add(node2);
        collectionExpected.add(node3);
        collectionExpected.add(node4);
        collectionExpected.add(node5);
        collectionExpected.add(node6);
        collectionExpected.add(node7);
        assertEquals("lesson07.LinkedBinaryTreeTest.testBreadthFirst", collectionExpected,
            treeActual.breadthFirst());
    }

    public static void testNodes() {
        LinkedBinaryTree <Integer> treeActual = new LinkedBinaryTree <>();
        Node <Integer> node1 = treeActual.add(null, 1);
        Node <Integer> node2 = treeActual.add(node1, 2);
        Node <Integer> node3 = treeActual.add(node1, 3);
        Node <Integer> node4 = treeActual.add(node2, 4);
        Node <Integer> node5 = treeActual.add(node2, 5);
        Node <Integer> node6 = treeActual.add(node3, 6);
        Node <Integer> node7 = treeActual.add(node3, 7);
        Collection <Node <Integer>> collectionExpected = new LinkedList <>();
        collectionExpected.add(node4);
        collectionExpected.add(node2);
        collectionExpected.add(node5);
        collectionExpected.add(node1);
        collectionExpected.add(node6);
        collectionExpected.add(node3);
        collectionExpected.add(node7);
        assertEquals("lesson07.LinkedBinaryTreeTest.testNodes", collectionExpected,
            treeActual.nodes());
    }

    public static void testInOrder() {
        LinkedBinaryTree <Integer> treeActual = new LinkedBinaryTree <>();
        Node <Integer> node1 = treeActual.add(null, 1);
        Node <Integer> node2 = treeActual.add(node1, 2);
        Node <Integer> node3 = treeActual.add(node1, 3);
        Node <Integer> node4 = treeActual.add(node2, 4);
        Node <Integer> node5 = treeActual.add(node2, 5);
        Node <Integer> node6 = treeActual.add(node3, 6);
        Node <Integer> node7 = treeActual.add(node3, 7);
        Collection <Node <Integer>> collectionExpected = new LinkedList <>();
        collectionExpected.add(node4);
        collectionExpected.add(node2);
        collectionExpected.add(node5);
        collectionExpected.add(node1);
        collectionExpected.add(node6);
        collectionExpected.add(node3);
        collectionExpected.add(node7);
        assertEquals("lesson07.LinkedBinaryTreeTest.testInOrder", collectionExpected,
            treeActual.inOrder());
    }

}