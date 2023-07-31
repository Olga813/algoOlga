package com.getjavajob.training.balakinao.init.algo.lesson09;

import com.getjavajob.training.balakinao.init.algo.lesson07.Node;
import com.getjavajob.training.balakinao.init.algo.lesson08.BalanceableTree;

import java.util.Comparator;
import java.util.Objects;

public class RedBlackTree<E> extends BalanceableTree<E> {
    public static final String ANSI_RESET = "\u001B[0m"; // for method print
    public static final String ANSI_RED = "\u001B[31m"; // for method print

    public RedBlackTree() {
        super();
    }

    public RedBlackTree(Comparator<E> comparator) {
        super(comparator);
    }

    public RedBlackTree(E root) {
        this.size = 1;
        this.root = new NodeImplRedBlack<>(root);
    }
@Override
    protected NodeImplRedBlack<E> validate(Node<E> n) throws IllegalArgumentException {
        if (n == null || n instanceof NodeImplRedBlack<E>) {
            return (NodeImplRedBlack<E>) n;
        }
        throw new IllegalArgumentException("Validates the node is not an instance of supported NodeImplRedBlack");
    }
    public void printTree() {
        printTree("", root);
    }

    public void printTree(String result, Node <E> n) {
        if (n != null) {
            printTree(result + "", left(n));
            System.out.println(result + "" + n.getElement()+(isRed(n) ? ANSI_RED + n.getElement() + ANSI_RESET : n.getElement()));
            printTree(result + "", right(n));
        }
    }
    @Override
    public Node <E> add(Node <E> currentNode, E value) {
           if (root==null) { return addRoot(value);}
            NodeImplRedBlack<E> parent = (NodeImplRedBlack<E>) root;
            NodeImplRedBlack<E> newNode = (NodeImplRedBlack) createNode(value, null, null, parent, true);
            while (true) {
                parent = (NodeImplRedBlack)currentNode;
                newNode.setParent(parent);
                if (compare(value, currentNode.getElement()) < 0) {
                    currentNode = left(currentNode);
                    if (currentNode == null) {
                        size++;
                        validate(parent).setLeft(newNode);
                        fixRedBlackPropertiesAfterInsert(newNode);
                        return newNode;
                    }
                } else if (compare(value, currentNode.getElement()) > 0) {
                                currentNode = right(currentNode);
                    if (currentNode == null) {
                        parent.setRight(newNode);
                        size++;
                      fixRedBlackPropertiesAfterInsert(newNode);
                        return newNode;
                    }
                } else if (compare(value, currentNode.getElement()) == 0) {
                    fixRedBlackPropertiesAfterInsert(newNode);
                    return newNode;
                }
                return newNode;
            }
        }

   @Override
    public Node<E> addRoot(E e) throws IllegalStateException {
        if (!isEmpty())
            throw new IllegalArgumentException("Tree already has a root");
        size = 1;
        root = createNode(e, null, null, null, true);
        return root;
    }

    public void fixRedBlackPropertiesAfterInsert(Node<E> node) {
        Node parent = parent(node);
        if (parent == null) {
            makeBlack(node);
            return;
        }
        if (isBlack(parent)) {
            return;
        }
        Node grandparent = parent(parent);
        if (grandparent == null) {
            makeBlack(parent);
            return;
        }
        Node uncle = getUncle(parent);
        if (uncle != null && isRed(uncle)) {
            makeBlack(parent);
            makeRed(grandparent);
            makeBlack(uncle);
            fixRedBlackPropertiesAfterInsert(grandparent);
        } else if (parent == left(grandparent)) {
            if (node == right(parent)) {
                rotateLeft(parent);
                parent = node;
            }
            rotateRight(grandparent);
            makeBlack(parent);
            makeRed(grandparent);
        } else {
            if (node == left(parent)) {
                rotateRight(parent);
                parent = node;
            }
            rotateLeft(grandparent);
            makeBlack(parent);
            makeRed(grandparent);
        }
    }

    public void rotateRight(Node node) {
        Node parent = parent(node);
        Node leftChild = left(node);
        validate(node).setLeft(right(leftChild));
        if (right(leftChild) != null) {
            validate(right(leftChild)).setParent(node);
        }
        validate((leftChild)).setRight(node);
        validate(node).setParent(leftChild);
        replaceParentsChild(parent, node, leftChild);
    }

    public void rotateLeft(Node node) {
        Node parent = parent(node);
        Node rightChild = right(node);
        validate(node).setRight(left(rightChild));
        if (left(rightChild) != null) {
            validate(left(rightChild)).setParent(node);
        }
        validate(rightChild).setLeft(node);
        validate(node).setParent(rightChild);
        replaceParentsChild(parent, node, rightChild);
    }

    public void replaceParentsChild(Node parent, Node oldChild, Node newChild) {
        if (parent == null) {
            root = newChild;
        } else if (left(parent) == oldChild) {
            validate(parent).setLeft(newChild);
        } else if (right(parent) == oldChild) {
            validate(parent).setRight(newChild);
        } else {
            throw new IllegalStateException("Node is not a child of its parent");
        }
        if (newChild != null) {
            validate(newChild).setParent(parent);
        }
    }

    /*  public void deleteNode(Node<E> key) {
          Node<E> node = root;
          while (node != null && node.getElement() != key) {
              if (compare(key, node.getElement())<0) {
                  node =left(node);
              } else {
                  node = right(node);
              }
          }
          if (node == null) {
              return;
          }
          Node movedUpNode;
          boolean deletedNodeColor;
          if (left(node) == null || right(node) == null) {
              movedUpNode = deleteNodeWithZeroOrOneChild(node);
              deletedNodeColor = color(node);
          } else {
              Node inOrderSuccessor = findMinimum(right(node));
              (validate(node)).getElement() = (validate(inOrderSuccessor)).getElement();
              movedUpNode = deleteNodeWithZeroOrOneChild(inOrderSuccessor);
              deletedNodeColor =color(inOrderSuccessor);
          }
          if (deletedNodeColor==false) {
              fixRedBlackPropertiesAfterDelete(movedUpNode);
              if (movedUpNode.getClass() == NilNode.class) {
                  replaceParentsChild(parent(movedUpNode), movedUpNode, null);
              }
          }
      }
        private Node deleteNodeWithZeroOrOneChild(Node node) {
            if (left(node) != null) {
                replaceParentsChild(parent(node), node, left(node));
                return left(node);
            }
            else if (right(node) != null) {
                replaceParentsChild(parent(node), node, right(node));
                return right(node);
            }
            else {
                Node newChild = color(node)==false ?new NilNode(): null;
                replaceParentsChild(parent(node), node, newChild);
                return newChild;
            }
        }

        private Node findMinimum(Node node) {
            while (left(node) != null) {
                node = left(node);
            }
            return node;
        }
        private void fixRedBlackPropertiesAfterDelete(Node node) {
            if (node == root) {
                node.setColor(false);
                return;
            }
            Node sibling = getSibling(node);
            if (color(sibling)) {
                handleRedSibling(node, sibling);
                sibling = getSibling(node);
                if (isBlack(left(sibling) )&& isBlack(right(sibling))) {
                    sibling.setColor(true);
                    if (color(parent(node)) == true) {
                       parent(node).setColor(false);
                    } else {
                        fixRedBlackPropertiesAfterDelete(parent(node));
                    }
                } else {
                    handleBlackSiblingWithAtLeastOneRedChild(node, sibling);
                }
            }
        }*/
    private Node getSibling(Node node) {
        Node parent = parent(node);
        if (node == left(parent)) {
            return right(parent);
        } else if (node == right(parent)) {
            return left(parent);
        } else {
            throw new IllegalStateException("Parent is not a child of its grandparent");
        }
    }

    private void handleRedSibling(Node node, Node sibling) {
        validate(sibling).setColor(false);
        validate(parent(node)).setColor(true);
        if (node == left(parent(node))) {
            rotateLeft(parent(node));
        } else {
            rotateRight(parent(node));
        }
    }

    private void handleBlackSiblingWithAtLeastOneRedChild(Node node, Node sibling) {
        boolean nodeIsLeftChild = node == left(parent(node));
        if (nodeIsLeftChild && isBlack(right(sibling))) {
            validate(left(sibling)).setColor(false);
            validate(sibling).setColor(true);
            rotateRight(sibling);
            sibling = right(parent(node));
        } else if (!nodeIsLeftChild && isBlack(left(sibling))) {
            validate(right(sibling)).setColor(false);
            validate(sibling).setColor(true);
            rotateLeft(sibling);
            sibling = left(parent(node));
        }
        validate(sibling).setColor(color(parent(node)));
        validate(parent(node)).setColor(false);
        if (nodeIsLeftChild) {
            validate(right(sibling)).setColor(false);
            rotateLeft(parent(node));
        } else {
            validate(left(sibling)).setColor(false);
            rotateRight(parent(node));
        }
    }

    private Node getUncle(Node parent) {
        Node grandparent = parent(parent);
        if (left(grandparent) == parent) {
            return right(grandparent);
        } else if (right(grandparent) == parent) {
            return left(grandparent);
        } else {
            throw new IllegalStateException("Parent is not a child of its grandparent");
        }
    }

    private Node<E> createNode(E element, Node left, Node right, Node<E> parent, boolean color) {
        return new NodeImplRedBlack<E>(element, left, right, parent, color);
    }

    private boolean isBlack(Node<E> n) {
        return validate(n).getColor() == false;
    }

    private boolean color(Node<E> n) {
        return validate(n).getColor() == true;
    }

    private boolean isRed(Node<E> n) {
        return validate(n).getColor() == true;
    }

    private void makeBlack(Node<E> n) {
        validate(n).setColor(false);

    }

    private void makeRed(Node<E> n) {
        validate(n).setColor(true);
    }

    private static class NilNode<E> extends NodeImplRedBlack<E> {
        private NilNode() {
            super(false);
        }
    }


    private static class NodeImplRedBlack<E> extends NodeImpl<E> {
        protected boolean color;

        public NodeImplRedBlack() {
            super();
            this.color = true;
        }

        public NodeImplRedBlack(boolean color) {
            super();
            this.color = color;
        }

        public NodeImplRedBlack(E root) {
            super(root);
            this.color = true;
        }

        public NodeImplRedBlack(E element, Node<E> left, Node<E> right, Node parent, boolean color) {
            super(element, left, right, parent);
            this.color = true;
        }

        public void setColor(boolean color) {
            this.color = color;
        }

        public boolean getColor() {
            return color;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            NodeImplRedBlack<?> node = (NodeImplRedBlack<?>) o;
            return Objects.equals(element, node.element) && Objects.equals(left, node.left) && Objects.equals(right,
                    node.right) && Objects.equals(parent, node.parent);
        }
    }

}