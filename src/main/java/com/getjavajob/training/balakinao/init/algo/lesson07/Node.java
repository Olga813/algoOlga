package com.getjavajob.training.balakinao.init.algo.lesson07;

/**
 * An abstraction for a node of a tree
 *
 * @param <E> element
 */
/**
 * Абстракция для узла дерева
 *
 * Элемент @param <E>
 */
public interface Node<E> {

    /**
     *
     * @return the element stored at this node
     */
    /**
     *
     * @вернуть элемент, хранящийся в этом узле
     */
    E getElement();

    //void setColor(boolean color);
}
