package com.getjavajob.training.balakinao.init.algo.lesson07;

import java.util.Collection;

public abstract class AbstractBinaryTree<E> extends AbstractTree<E> implements BinaryTree<E> {
    @Override
    public Node<E> sibling(Node<E> n) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Collection<Node<E>> children(Node<E> n) throws IllegalArgumentException {
        return null;
    }

    @Override
    public int childrenNumber(Node<E> n) throws IllegalArgumentException {
        return 0;
    }

    public Collection<Node<E>> inOrder() {
        return null;
    }
}
