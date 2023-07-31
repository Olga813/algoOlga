package com.getjavajob.training.balakinao.init.algo.lesson08;

import com.getjavajob.training.balakinao.init.algo.lesson07.LinkedBinaryTree;
import com.getjavajob.training.balakinao.init.algo.lesson07.Node;

import java.util.Collection;
import java.util.Comparator;

public class BinarySearchTree<E> extends LinkedBinaryTree <E> {
    public BinarySearchTree() {
    }

    public BinarySearchTree(Comparator <E> comparator) {
        this.comparator = comparator;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder = toString(stringBuilder, root);
        return "(" + stringBuilder + ")";
    }


    public StringBuilder toString(StringBuilder result, Node <E> n) {
        if (n != null) {
            result.append(n.getElement());
            if (left(n) != null) {
                result.append("(");
                toString(result, left(n));
            }

            if (left(n) != null) {
                result.append(",");
                toString(result, right(n));
            }

            if (right(n) != null) {
                result.append(")");
            }
        }
        return result;
    }

     private Comparator <E> comparator;



    protected int compare(E val1, E val2) {
     return comparator==null ? ((Comparable<? super E>)val1).compareTo((E)val2)
            : comparator.compare((E)val1, (E)val2);
    }

    public Node <E> treeSearch(Node <E> n, E val) {
        Collection <Node <E>> nodes = preOrder();
        if (root != null & !root.equals(val) & val != null) {
            for (Node <E> node : nodes) {
                if (n.equals(node)) {
                    return node;
                }
            }
        }
        return null;
    }

    public Node <E> add(E value) throws IllegalArgumentException {
        if (isEmpty()) {
            return addRoot(value);
        }
        return add(root, value);
    }

    public Node <E> add(Node <E> currentNode, E value) {
        NodeImpl <E> parentNode = (NodeImpl <E>) root;
        NodeImpl newNode = (NodeImpl) createNode(value, null, null, parentNode);
        while (true) {
            parentNode = (NodeImpl <E>) currentNode;
            newNode.setParent(parentNode);
            if (compare(value, currentNode.getElement()) < 0) {
                currentNode = left(currentNode);
                if (currentNode == null) {
                    size++;
                    validate(parentNode).setLeft(newNode);
                    return newNode;
                }
            } else if (compare(value, currentNode.getElement()) > 0) {
                currentNode = right(currentNode);
                if (currentNode == null) {
                    parentNode.setRight(newNode);
                    size++;
                    return newNode;
                }
            } else if (compare(value, currentNode.getElement()) == 0) {
                return newNode;
            }
        }
    }

}