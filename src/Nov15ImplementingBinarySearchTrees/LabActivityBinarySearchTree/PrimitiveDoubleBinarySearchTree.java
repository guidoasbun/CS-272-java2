package Nov15ImplementingBinarySearchTrees.LabActivityBinarySearchTree;

public class PrimitiveDoubleBinarySearchTree {
    // Instance variables
    private int size;
    private PrimitiveDoubleBinarySearchTreeNode root;

    // Constructors
    public PrimitiveDoubleBinarySearchTree() {
        this.size = 0;
        this.root = null;
    }

    public PrimitiveDoubleBinarySearchTree(double rootElement) {
        this.size = 1;
        this.root = new PrimitiveDoubleBinarySearchTreeNode(rootElement);
    }

    public PrimitiveDoubleBinarySearchTree(double[] array) {
        for (int i = 1; i < array.length; i++) {
            this.insert(array[i]);
        }
    }

    // Methods
    public boolean insert(double element) {
        PrimitiveDoubleBinarySearchTreeNode newNode = new PrimitiveDoubleBinarySearchTreeNode(element);
        if (size == 0) {
            root = newNode;
        } else {
            PrimitiveDoubleBinarySearchTreeNode parent = getParent(element);
            if (parent == null) {
                return false;
            } else if (parent.getElement() > element) {
                parent.setLeftChild(newNode);
            } else {
                parent.setRightChild(newNode);
            }
        }
        size++;
        return true;
    }

    public int getSize() {
        return this.size;
    }

    public boolean search(double element) {
        PrimitiveDoubleBinarySearchTreeNode current = root;
        while (current != null) {
            if (current.getElement() == element) {
                return true;
            } else if (current.getElement() > element) {
                current = current.getLeftChild();
            } else {
                current = current.getRightChild();
            }
        }
        return false;
    }

    private PrimitiveDoubleBinarySearchTreeNode getParent(double element) {
        PrimitiveDoubleBinarySearchTreeNode parent = root;
        PrimitiveDoubleBinarySearchTreeNode current = root;
        while (current != null) {
            if (element == current.getElement()) {
                return null;
            } else if (element < current.getElement()) {
                parent = current;
                current = current.getLeftChild();
            } else {
                parent = current;
                current = current.getRightChild();
            }
        }
        return parent;
    }
}
