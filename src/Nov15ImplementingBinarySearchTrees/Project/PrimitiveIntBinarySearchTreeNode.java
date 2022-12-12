package Nov15ImplementingBinarySearchTrees.Project;

public class PrimitiveIntBinarySearchTreeNode {
    // Instance Variables

    private int element;
    private PrimitiveIntBinarySearchTreeNode leftChild;
    private PrimitiveIntBinarySearchTreeNode rightChild;

    // Constructors
    public PrimitiveIntBinarySearchTreeNode(int element) {
        this.element = element;
        this.leftChild = null;
        this.rightChild = null;
    }

    // Methods
    public int getElement() {
        return this.element;
    }

    public PrimitiveIntBinarySearchTreeNode getLeftChild() {
        return this.leftChild;
    }

    public PrimitiveIntBinarySearchTreeNode getRightChild() {
        return this.rightChild;
    }

    public void setLeftChild(PrimitiveIntBinarySearchTreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(PrimitiveIntBinarySearchTreeNode rightChild) {
        this.rightChild = rightChild;
    }

//    public boolean insert(int element) {
//        if (element == this.element) {
//            return false;
//        } else if (element < this.element) {
//            if (this.leftChild == null) {
//                this.leftChild = new PrimitiveIntBinarySearchTreeNode(element);
//                return true;
//            } else {
//                return this.leftChild.insert(element);
//            }
//        } else {
//            if (this.rightChild == null) {
//                this.rightChild = new PrimitiveIntBinarySearchTreeNode(element);
//                return true;
//            } else {
//                return this.rightChild.insert(element);
//            }
//        }
//    }
//
//    public PrimitiveIntBinarySearchTreeNode getParent(int element) {
//        if (this.leftChild != null && this.leftChild.element == element) {
//            return this;
//        } else if (this.rightChild != null && this.rightChild.element == element) {
//            return this;
//        } else if (element < this.element) {
//            if (this.leftChild == null) {
//                return null;
//            } else {
//                return this.leftChild.getParent(element);
//            }
//        } else {
//            if (this.rightChild == null) {
//                return null;
//            } else {
//                return this.rightChild.getParent(element);
//            }
//        }
//    }
}
