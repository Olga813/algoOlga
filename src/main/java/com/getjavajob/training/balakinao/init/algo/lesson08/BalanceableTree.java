package com.getjavajob.training.balakinao.init.algo.lesson08;

import com.getjavajob.training.balakinao.init.algo.lesson07.Node;

import java.util.Comparator;

public class BalanceableTree<E> extends BinarySearchTree <E> {
    public BalanceableTree() {
        super();
    }

    public BalanceableTree(Comparator<E> comparator) {
       super(comparator);
    }
    private void relink(NodeImpl <E> parent, NodeImpl <E> child, boolean makeLeftChild) {
        Node <E> parentParent = parent(parent);
        if (makeLeftChild) {
            Node <E> leftCild = left(child);
            child.setLeft(parent);
            parent.setParent(child);
            parent.setRight(leftCild);
        } else {
            Node <E> rightCild = right(child);
            child.setRight(parent);
            parent.setParent(child);
            parent.setLeft(rightCild);
        }
        if (parentParent == null) {
            root = child;
            child.setParent(root);
        } else if (parent.equals(right(parentParent))) {

            child.setParent(parentParent);
            ((NodeImpl <E>) parentParent).setRight(child);
        } else {
            child.setParent(parentParent);
            ((NodeImpl <E>) parent(parent)).setLeft(parent);
        }
    }

    private Node <E> relinkReturnNode(NodeImpl <E> parent, NodeImpl <E> child, boolean makeLeftChild) {
        Node <E> parentParent = parent(parent);
        if (makeLeftChild) {
            Node <E> leftCild = left(child);
            child.setLeft(parent);
            parent.setParent(child);
            parent.setRight(leftCild);
        } else {
            Node <E> rightCild = right(child);
            child.setRight(parent);
            parent.setParent(child);
            parent.setLeft(rightCild);
        }
        if (parentParent == null) {
            root = child;
            child.setParent(root);

        } else if (parent.equals(right(parentParent))) {
            child.setParent(parentParent);
            ((NodeImpl <E>) parentParent).setRight(child);
        } else {
            child.setParent(parentParent);
            ((NodeImpl <E>) parent(parent)).setLeft(parent);
        }
        return child;
    }

    protected void rotate(Node <E> n) throws IllegalStateException {
        if ((n == null) || parent(n) == null) {
            throw new IllegalArgumentException("Note n no parent");
        }
        boolean left = left(parent(n)).equals(n);
        relink((NodeImpl <E>) parent(n), (NodeImpl <E>) n, !left);
    }


    protected Node <E> reduceSubtreeHeight(Node <E> n) {
        Node <E> n2 = parent(n);
        Node <E> n1 = parent(n2);
        if ((n == null) || parent(n) == null) {
            throw new IllegalArgumentException("Note n no parent/parent(parent(n))");
        }
        boolean leftElementN = n.equals(left(n2));
        boolean leftElementN2 = n2.equals(left(n1));
        if ((leftElementN == leftElementN2)) {
            relink((NodeImpl <E>) n1, (NodeImpl <E>) n2, !leftElementN2);
            return n2;
        } else if (!leftElementN) {
            n = relinkReturnNode((NodeImpl <E>) n2, (NodeImpl <E>) n, true);
            leftElementN = n.equals(left(parent(n)));
            return relinkReturnNode((NodeImpl <E>) parent(n), (NodeImpl <E>) n, leftElementN);
        }
        relink((NodeImpl <E>) n2, (NodeImpl <E>) n, !leftElementN);
        n = right(right(n1));
        return reduceSubtreeHeight(n);
    }

}