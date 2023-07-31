package com.getjavajob.training.balakinao.init.algo.lesson07;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class LinkedBinaryTree<E> extends AbstractBinaryTree <E> {

    protected int size;
    protected Node <E> root;

    public LinkedBinaryTree() {
        super();
    }

    public LinkedBinaryTree(E root) {
        this.size = 1;
        this.root = new NodeImpl <>(root);
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public void printTree() {
        printTree("", root);
    }

    public void printTree(String result, Node <E> n) {
        if (n != null) {
            printTree(result + "", left(n));
            System.out.println(result + "" + n.getElement());
            printTree(result + "", right(n));
        }
    }

    protected NodeImpl <E> validate(Node <E> n) throws IllegalArgumentException {
        if (n == null || n instanceof NodeImpl <E>) {
            return (NodeImpl <E>) n;
        }
        throw new IllegalArgumentException("Validates the node is not an instance of supported NodeImpl");
    }

    protected Node createNode(E element, Node left, Node right, Node parent) {
        return new NodeImpl(element, left, right, parent);
    }

    protected boolean hasLeft(Node v) throws IllegalArgumentException {
        return (validate(v).getLeft() != null);
    }

    protected boolean hasRight(Node v) throws IllegalArgumentException {
        return (validate(v).getRight() != null);
    }

    @Override
    public Node <E> addRoot(E e) throws IllegalStateException {
        if (!isEmpty())
            throw new IllegalArgumentException("Tree already has a root");
        size = 1;
        root = createNode(e, null, null, null);
        return root;
    }

    @Override
    public Node <E> add(Node <E> n, E e) throws IllegalArgumentException {
        if (isEmpty()) {
            return addRoot(e);
        } else if (!hasLeft(n)) {
            return addLeft(n, e);
        } else if (!hasRight(n)) {
            return addRight(n, e);
        }
        throw new IllegalArgumentException("Already have two children");
    }

    @Override
    public Node <E> addLeft(Node <E> n, E e) throws IllegalArgumentException {
        if (hasLeft(n))
            throw new UnsupportedOperationException("Node already has a left child");
        Node timeLeftNode = createNode(e, null, null, n);
        validate(n).setLeft(timeLeftNode);
        size++;
        return timeLeftNode;
    }

    @Override
    public Node <E> addRight(Node <E> n, E e) throws IllegalArgumentException {
        if (hasRight(n))
            throw new UnsupportedOperationException("Node already has a right child");
        Node timeRightNode = createNode(e, null, null, n);
        validate(n).setRight(timeRightNode);
        size++;
        return timeRightNode;
    }

    @Override
    public E set(Node <E> n, E e) throws IllegalArgumentException {
        E tamp = validate(n).getElement();
        validate(n).setElement(e);
        return tamp;
    }

    @Override
    public E remove(Node n) throws IllegalArgumentException {
        if (hasLeft(n) && hasRight(n))
            throw new UnsupportedOperationException("Cannot remove node 2 children");
        Node timeNode;
        if (hasLeft(n))
            timeNode = left(n);
        else if (hasRight(n))
            timeNode = right(n);
        else
            timeNode = null;
        if (n == root()) {
            if (timeNode != null)
                validate(timeNode).setParent(null);
            root = timeNode;
        } else {
            NodeImpl timeParent = (NodeImpl) parent(n);
            if (hasLeft(timeParent) && n == left(timeParent))
                timeParent.setLeft(timeNode);
            else
                timeParent.setRight(timeNode);
            if (timeNode != null)
                validate(timeNode).setParent(timeParent);
        }
        size--;
        return (E) n.getElement();
    }

    @Override
    public Node <E> left(Node <E> n) throws IllegalArgumentException {
        return (n == null) ? null : validate(n).getLeft();
    }

    @Override
    public Node <E> right(Node <E> n) throws IllegalArgumentException {
        return (n == null) ? null : validate(n).getRight();
    }

    @Override
    public Node <E> root() {
        return (root == null) ? null : root;
    }

    @Override
    public Node <E> parent(Node <E> n) throws IllegalArgumentException {
        return (n == null) ? null : validate(n).getParent();
    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public Node <E> sibling(Node <E> n) throws IllegalArgumentException {
        validate(n);
        if (n == null || validate(n).getParent() == null || childrenNumber(validate(n).getParent()) == 1) {
            return null;
        }
        Node <E> leftChildren = left(validate(n).getParent());
        return leftChildren.equals(n) ? right(validate(n).getParent()) :
                leftChildren;
    }

    @Override
    public Collection <Node <E>> children(Node <E> n) throws IllegalArgumentException {
        validate(n);
        if (childrenNumber(n) == 0) {
            return null;
        }
        Collection <Node <E>> templist = new LinkedList <>();
        templist.add(left(n));
        templist.add(right(n));
        return templist;
    }

    @Override
    public int childrenNumber(Node <E> n) throws IllegalArgumentException {
        validate(n);
        int childrenNumber = 0;
        if (hasLeft(n) == true) {
            childrenNumber++;
        }
        if (hasRight(n) == true) {
            childrenNumber++;
        }
        return childrenNumber;
    }

    @Override
    public boolean isInternal(Node <E> n) throws IllegalArgumentException {
        validate(n);
        return (hasLeft(n) || hasRight(n));
    }

    @Override
    public boolean isExternal(Node <E> n) throws IllegalArgumentException {
        return !isInternal(n);
    }

    @Override
    public boolean isRoot(Node <E> n) throws IllegalArgumentException {
        return (n == null) ? null : n.equals(root);
    }

    @Override

    public Collection <Node <E>> preOrder() {
        Collection <Node <E>> templist = new LinkedList <>();
        if (root != null) {
            preorder(root, templist);
        }
        return templist;
    }

    protected void preorder(Node <E> node, Collection <Node <E>> templist) {
        if (node != null) {
            templist.add(node);
            preorder(validate(node).getLeft(), templist);
            preorder(validate(node).getRight(), templist);
        }
    }

    @Override
    public Collection <Node <E>> postOrder() {
        Collection <Node <E>> templist = new LinkedList <>();
        if (root != null) {
            postOrder(root, templist);
        }
        return templist;
    }

    protected void postOrder(Node <E> node, Collection <Node <E>> templist) {
        if (node != null) {
            postOrder(validate(node).getLeft(), templist);
            postOrder(validate(node).getRight(), templist);
            templist.add(node);
        }
    }

    @Override
    public Collection <Node <E>> breadthFirst() {
        Queue <Node <E>> queue = new LinkedList <>();
        Collection <Node <E>> result = new LinkedList <>();
        Node <E> node = root;
        queue.add(node);
        while (!queue.isEmpty()) {
            if (!queue.isEmpty()) {
                node = queue.poll();
                result.add(node);
            }
            if (left(node) != null) {
                queue.add(left(node));
            }
            if (right(node) != null) {
                queue.add(right(node));
            }
        }
        return result;
    }

    @Override
    public Collection <Node <E>> nodes() {
        Collection <Node <E>> templist = new LinkedList <>();
        inOrder(root, templist);
        return templist;
    }

    @Override
    public Collection <Node <E>> inOrder() {
        Collection <Node <E>> templist = new LinkedList <>();
        inOrder(root, templist);
        return templist;
    }

    protected void inOrder(Node <E> node, Collection <Node <E>> templist) {
        if (node != null) {
            inOrder(validate(node).getLeft(), templist);
            templist.add(node);
            inOrder(validate(node).getRight(), templist);
        }
    }

    protected static class NodeImpl<E> implements Node <E> {

        public E element;
        public Node left;
        public Node right;

        public Node parent;

        public NodeImpl() {
            super();
        }

        public NodeImpl(E root) {
            this.element = root;
        }

        public NodeImpl(E element, Node <E> left, Node <E> right, Node parent) {
            this.element = element;
            this.left = left;
            this.right = right;
            this.parent = parent;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node getParent() {
            return parent;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

        @Override
        public E getElement() {
            return element;
        }



        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            NodeImpl <?> node = (NodeImpl <?>) o;
            return Objects.equals(element, node.element) && Objects.equals(left, node.left) && Objects.equals(right,
                    node.right) && Objects.equals(parent, node.parent);
        }

        @Override
        public int hashCode() {
            return Objects.hash(element, left, right, parent);
        }

        @Override
        public String toString() {
            return "" + element;
        }
    }

}