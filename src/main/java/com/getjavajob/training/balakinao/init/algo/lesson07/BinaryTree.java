package com.getjavajob.training.balakinao.init.algo.lesson07;

/**
 * An interface for a binary tree, in which each node has at most two children
 *
 * @param <E> element
 */
/**
 * Интерфейс для бинарного дерева, в котором каждый узел имеет не более двух дочерних элементов.
 *
 * Элемент @param <E>
 */
public interface BinaryTree<E> extends Tree<E> {

    /**
     *
     * @param p node
     * @return the node of <i>node</i>'s left child (of null if no child exists)
     * @throws IllegalArgumentException
     */
    /**
     *
     * @param p узел
     * @вернуть узел левого дочернего элемента <i>node</i> (нулевого, если дочерний элемент не существует)
     * @throws IllegalArgumentException
     */
   Node<E> left(Node<E> p) throws IllegalArgumentException;

    /**
     *
     * @param p node
     * @return the node of <i>node</i>'s right child (of null if no child exists)
     * @throws IllegalArgumentException
     */
    /**
     *
     * @param p узел
     * @вернуть узел правого дочернего узла <i>node</i> (нулевого, если дочернего элемента не существует)
     * @throws IllegalArgumentException
     */
    Node<E> right(Node<E> p) throws IllegalArgumentException;

    /**
     *
     * @param p node
     * @return the node of <i>node</i>'s sibling (of null if no sibling exists)
     * @throws IllegalArgumentException
     */
    /**
     *
     * @param p узел
     * @вернуть узел родственного узла <i>node</i> (нулевого, если родственного узла не существует)
     * @throws IllegalArgumentException
     */
    Node<E> sibling(Node<E> p) throws IllegalArgumentException;

    /**
     * Creates a new left child of {@link Node} <i>n</i> storing element <i>e</i>
     *
     * @param n node
     * @param e    element
     * @return created node
     * @throws IllegalArgumentException if <i>node</i> already has a left child
     */
    /**
     * Создает новый левый дочерний элемент {@link Node} <i>n</i>, сохраняющий элемент <i>e</i>
     *
     * @param n узел
     * Элемент @param
     * @return созданный узел
     * @throws IllegalArgumentException, если <i>node</i> уже имеет левого потомка
     */
    Node<E> addLeft(Node<E> n, E e) throws IllegalArgumentException;

    /**
     * Creates a new right child of {@link Node} <i>n</i> storing element <i>e</i>
     *
     * @param n node
     * @param e    element
     * @return created node
     * @throws IllegalArgumentException if <i>n</i> already has a right child
     */
    /**
     * Создает новый правый дочерний элемент {@link Node} <i>n</i>, сохраняя элемент <i>e</i>
     *
     * @param n узел
     * Элемент @param
     * @return созданный узел
     * @throws IllegalArgumentException, если <i>n</i> уже имеет правильный дочерний элемент
     */
    Node<E> addRight(Node<E> n, E e) throws IllegalArgumentException;

}
