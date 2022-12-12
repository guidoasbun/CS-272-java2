package Nov15ImplementingBinarySearchTrees.Project;


// CLASS: PrimitiveIntBinarySearchTreeNode
//
// CONSTRUCTORS
// PrimitiveIntBinarySearchTreeNode(element: int)
//
// INSTANCE METHODS
// getElement(): int
// getLeftChild(): PrimitiveIntBinarySearchTreeNode
// getRightChild(): PrimitiveIntBinarySearchTreeNode
// setLeftChild(leftChild: PrimitiveIntBinarySearchTreeNode): void
// setRightChild(rightChild: PrimitiveIntBinarySearchTreeNode): void

public class PrimitiveIntBinarySearchTree {
    // INSTANCE VARIABLES
    private int size;
    private PrimitiveIntBinarySearchTreeNode root;

    // CONSTRUCTORS
    public PrimitiveIntBinarySearchTree() {
        this.size = 0;
        this.root = null;
    }

    // INSTANCE METHODS
    public boolean insert(int element) // refer to lesson notes
    {
        PrimitiveIntBinarySearchTreeNode newNode = new PrimitiveIntBinarySearchTreeNode(element);
        if (size == 0) {
            root = newNode;
        } else {
            PrimitiveIntBinarySearchTreeNode parent = getParent(element);
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

    private PrimitiveIntBinarySearchTreeNode getParent(int element) // refer to lesson notes
    {
        PrimitiveIntBinarySearchTreeNode parent = null;
        PrimitiveIntBinarySearchTreeNode current = root;
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

    public void traverse(String algorithm) {
        switch (algorithm) {
            case "InOrder":
                traverseInOrder(root);
                break;
            case "PreOrder":
                traversePreOrder(root);
                break;
            case "PostOrder":
                traversePostOrder(root);
                break;
            default:
                System.out.println("Invalid traversal algorithm");
        }
    }

    // Traverse output should be on only one line with a comma and space after each number
    private void traverseInOrder(PrimitiveIntBinarySearchTreeNode node) {
        if (node != null) {
            traverseInOrder(node.getLeftChild());
            System.out.print(node.getElement() + ", ");
            traverseInOrder(node.getRightChild());
        }
    }

    // Traverse output should be on only one line with a comma and space after each number
    private void traversePreOrder(PrimitiveIntBinarySearchTreeNode node) {
        if (node != null) {
            System.out.print(node.getElement() + ", ");
            traversePreOrder(node.getLeftChild());
            traversePreOrder(node.getRightChild());
        }
    }

    // Traverse output should be on only one line with a comma and space after each number
    private void traversePostOrder(PrimitiveIntBinarySearchTreeNode node) {
        if (node != null) {
            traversePostOrder(node.getLeftChild());
            traversePostOrder(node.getRightChild());
            System.out.print(node.getElement() + ", ");
        }
    }
}
