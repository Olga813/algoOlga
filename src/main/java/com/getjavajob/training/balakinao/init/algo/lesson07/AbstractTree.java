package com.getjavajob.training.balakinao.init.algo.lesson07;

import java.util.Collection;
import java.util.Iterator;

/**
 * An abstract base class providing some functionality of the Tree interface
 *
 * @param <E> element
 */
/**
 * Абстрактный базовый класс, предоставляющий некоторую функциональность интерфейса Tree.
 *
 * Элемент @param <E>
 */
public abstract class AbstractTree<E> implements Tree<E> {
    @Override
    public boolean isInternal(Node<E> n) throws IllegalArgumentException {
        return false;
    }

    @Override
    public boolean isExternal(Node<E> n) throws IllegalArgumentException {
        return false;
    }

    @Override
    public boolean isRoot(Node<E> n) throws IllegalArgumentException {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new ElementIterator();
    }

    /**
     *
     * @return an iterable collection of nodes of the tree in preorder
     */
    /**
     *
     * @return итерируемая коллекция узлов дерева в предварительном порядке
     */
    public Collection<Node<E>> preOrder() {
        return null;
    }

    /**
     *
     * @return an iterable collection of nodes of the tree in postorder
     */
    /**
     *
     * @return итерируемая коллекция узлов дерева в обратном порядке
     */
    public Collection<Node<E>> postOrder() {
        return null;
    }

    /**
     *
     * @return an iterable collection of nodes of the tree in breadth-first order
     */
    /**
     *
     * @return итерируемая коллекция узлов дерева в порядке ширины
     */
    public Collection<Node<E>> breadthFirst() {
        return null;
    }

    /**
     * Adapts the iteration produced by {@link Tree#nodes()}
     */
    /**
     * Адаптирует итерацию, созданную {@link Tree#nodes()}.
     */
    private class ElementIterator implements Iterator<E> {
        private Iterator<Node<E>> it = nodes().iterator();

        @Override
        public boolean hasNext() {
            return it.hasNext();
        }

        @Override
        public E next() {
            return it.next().getElement();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
