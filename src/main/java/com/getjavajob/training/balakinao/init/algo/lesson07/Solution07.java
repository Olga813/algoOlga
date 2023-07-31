package com.getjavajob.training.balakinao.init.algo.lesson07;

import java.util.Collection;
import java.util.Iterator;

public class Solution07 {

    public static void main(String[] args) throws InterruptedException {

        LinkedBinaryTree <Integer> linkedBinaryTree = new LinkedBinaryTree <>();
        System.out.println("Add a root to the tree");
        linkedBinaryTree.addRoot(25);
        linkedBinaryTree.printTree();
        Node <Integer> root = linkedBinaryTree.root();
        System.out.println("Add an element to the left of the root in the tree");
        linkedBinaryTree.addLeft(root, 15);
        linkedBinaryTree.printTree();
        Node <Integer> node2 = linkedBinaryTree.left(root);
        System.out.println("Add an element to the right of the root in the tree");
        linkedBinaryTree.addRight(root, 50);
        linkedBinaryTree.printTree();
        Node <Integer> node3 = linkedBinaryTree.right(root);
        System.out.println("Add an element of the node3 in the tree");
        linkedBinaryTree.printTree();
        Node <Integer> node4 = linkedBinaryTree.add(node2, 10);
        Node <Integer> node5 = linkedBinaryTree.add(node2, 22);
        Node <Integer> node6 = linkedBinaryTree.add(node3, 35);
        Node <Integer> node7 = linkedBinaryTree.add(node3, 70);
        System.out.println("Testing the Collection method");
        Collection <Node <Integer>> collection = linkedBinaryTree.inOrder();
        for (Node <Integer> node : collection) {
            System.out.println(node);
        }
        System.out.println("Iterable collection of nodes of the tree in breadth-first order");
        for (Node <Integer> node : linkedBinaryTree.breadthFirst()) {
            System.out.println(node);
        }
        System.out.println("Iterable collection of nodes of the tree in inorder");
        for (Node <Integer> node : linkedBinaryTree.inOrder()) {
            System.out.println(node);
        }
        System.out.println("Iterable collection of nodes of the tree in preorder");
        for (Node <Integer> node : linkedBinaryTree.preOrder()) {
            System.out.println(node);
        }
        System.out.println("Iterable collection of nodes of the tree in postorder");
        for (Node <Integer> node : linkedBinaryTree.postOrder()) {
            System.out.println(node);
        }
        System.out.println("Replace the root with a new element");
        linkedBinaryTree.set(root, 11);
        linkedBinaryTree.printTree();
        System.out.println("Delete node4");
        linkedBinaryTree.remove(node4);
        linkedBinaryTree.printTree();
        System.out.println("Tree size: " + linkedBinaryTree.size());
        System.out.println("Node3 parent: " + linkedBinaryTree.parent(node3));
        System.out.println("Let's check the work of the iterator");
        Iterator <Integer> linkedBinaryTreeIterator = linkedBinaryTree.iterator();
        for (Integer element : linkedBinaryTree) {
            System.out.println(element);
        }
        System.out.println("Let's check the work of the isEmpty " + linkedBinaryTree.isEmpty());
        System.out.println("Sibling node3 " + linkedBinaryTree.sibling(node2));
        System.out.println("Children number node3 " + linkedBinaryTree.childrenNumber(node2));
        System.out.println("Children root " + linkedBinaryTree.children(root));
        System.out.println("Node3 is internal " + linkedBinaryTree.isInternal(node3));
        System.out.println("Node4 is external " + linkedBinaryTree.isExternal(node4));
        System.out.println("Node4 is root " + linkedBinaryTree.isRoot(node4));
    }

}