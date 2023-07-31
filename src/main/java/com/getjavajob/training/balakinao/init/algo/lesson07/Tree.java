package com.getjavajob.training.balakinao.init.algo.lesson07;

import java.util.Collection;
import java.util.Iterator;

/**
 * An interface for a tree where nodes can have an arbitrary number of children
 *
 * @param <E> element of a tree
 */
/**
 * Интерфейс для дерева, в котором узлы могут иметь произвольное количество дочерних элементов
 *
 * @param <E> элемент дерева
 */
public interface Tree<E> extends Iterable<E> {

    // accessor methods

    /**
     * @return the node of the root of the tree (or null if empty)
     */
    // методы доступа

    /**
     * @вернуть узел корня дерева (или нуль, если пусто)
     */
    Node<E> root();

    /**
     *
     * @param n node
     * @return the node of the parent of the tree (or null if empty)
     * @throws IllegalArgumentException
     */
    /**
     *
     * @param n узел
     * @вернуть узел родителя дерева (или ноль, если он пуст)
     * @throws IllegalArgumentException
     */
    Node<E> parent(Node<E> n) throws IllegalArgumentException;

    /**
     *
     * @param n node
     * @return an iterable collection containing the children of node <i>node</i> (if any)
     * @throws IllegalArgumentException
     */
    /**
     *
     * @param n узел
     * @вернуть итерируемую коллекцию, содержащую дочерние элементы узла <i>node</i> (если есть)
     * @throws IllegalArgumentException
     */
    Collection<Node<E>> children(Node<E> n) throws IllegalArgumentException;

    /**
     *
     * @param n node
     * @return the number of children of node <i>n</i>
     * @throws IllegalArgumentException if <i>n</i> instance is not of supported type
     */
    /**
     *
     * @param n узел
     * @вернуть количество дочерних элементов узла <i>n</i>
     * @throws IllegalArgumentException, если экземпляр <i>n</i> не относится к поддерживаемому типу
     */
    int childrenNumber(Node<E> n) throws IllegalArgumentException;

    // update methods supported by this class

    // обновляем методы, поддерживаемые этим классом

    /**
     * Places element <i>e</i> at the root of an empty tree and returns its new {@link Node}
     *
     * @param e element
     * @return created root
     * @throws IllegalStateException if tree is not empty
     */
    /**
     * Помещает элемент <i>e</i> в корень пустого дерева и возвращает его новый {@link Node}
     *
     * Элемент @param
     * @return создал корень
     * @throws IllegalStateException, если дерево не пусто
     */
    Node<E> addRoot(E e) throws IllegalStateException;

    /**
     * Creates a new child of {@link Node} <i>p</i> storing element <i>e</i>
     *
     * @param p parent node
     * @param e element
     * @return created node
     * @throws IllegalArgumentException
     */
    /**
     * Создает новый дочерний элемент {@link Node} <i>p</i>, сохраняющий элемент <i>e</i>
     *
     * @param p родительский узел
     * Элемент @param
     * @return созданный узел
     * @throws IllegalArgumentException
     */
    Node<E> add(Node<E> p, E e) throws IllegalArgumentException;

    /**
     * Replaces the element at {@link Node} <i>n</i> with <i>e</i>
     *
     * @param n node
     * @param e element
     * @return replace element
     * @throws IllegalArgumentException
     */
    /**
     * Заменяет элемент в {@link Node} <i>n</i> на <i>e</i>
     *
     * @param n узел
     * Элемент @param
     * @return заменить элемент
     * @throws IllegalArgumentException
     */
    E set(Node<E> n, E e) throws IllegalArgumentException;

    /**
     * Replaces the element at {@link Node} <i>n</i> with <i>e</i>
     *
     * @param n node
     * @return replace element
     * @throws IllegalArgumentException
     */
    /**
     * Заменяет элемент в {@link Node} <i>n</i> на <i>e</i>
     *
     * @param n узел
     * @return заменить элемент
     * @throws IllegalArgumentException
     */
    E remove(Node<E> n) throws IllegalArgumentException;

    // query methods

    /**
     *
     * @param n node
     * @return true if node <i>n</i> has at least one child
     * @throws IllegalArgumentException if <i>n</i> instance is not of supported type
     */
    // методы запроса

    /**
     *
     * @param n узел
     * @return true, если узел <i>n</i> имеет хотя бы одного потомка
     * @throws IllegalArgumentException, если экземпляр <i>n</i> не относится к поддерживаемому типу
     */
    boolean isInternal(Node<E> n) throws IllegalArgumentException;

    /**
     *
     * @param n node
     * @return true if node <i>n</i> does not have any children
     * @throws IllegalArgumentException if <i>n</i> instance is not of supported type
     */
    /**
     *
     * @param n узел
     * @return true, если узел <i>n</i> не имеет потомков
     * @throws IllegalArgumentException, если экземпляр <i>n</i> не относится к поддерживаемому типу
     */
    boolean isExternal(Node<E> n) throws IllegalArgumentException;

    /**
     *
     * @param n node
     * @return true if node <i>n</i> is the root of the tree
     * @throws IllegalArgumentException if <i>n</i> instance is not of supported type
     */
    /**
     *
     * @param n узел
     * @return true, если узел <i>n</i> является корнем дерева
     * @throws IllegalArgumentException, если экземпляр <i>n</i> не относится к поддерживаемому типу
     */
    boolean isRoot(Node<E> n) throws IllegalArgumentException;

    // general methods

    /**
     *
     * @return the number of nodes (and hence elements) that are contained in the tree
     */
    // общие методы

    /**
     *
     * @вернуть количество узлов (и, следовательно, элементов), содержащихся в дереве
     */
    int size();

    /**
     *
     * @return true if the tree does not contain any nodes (and thus no elements)
     */
    /**
     *
     * @return true, если дерево не содержит узлов (и, следовательно, элементов)
     */
    boolean isEmpty();

    /**
     *
     * @return an iterator for all elements in the tree (so that the tree itself is {@link Iterable})
     */
    /**
     *
     * @вернуть итератор для всех элементов дерева (чтобы само дерево было {@link Iterable})
     */
    @Override
    Iterator<E> iterator();

    /**
     *
     * @return an iterable collection of all nodes of the tree
     */
    /**
     *
     * @return итерируемая коллекция всех узлов дерева
     */
    Collection<Node<E>> nodes();

}
