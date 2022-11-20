package Nov17ImplementingHashSets.LabActivityImplementingHashSet;

public class PrimitiveIntSeparateChainingHashSetNode {
    // Instance variables
    private int element;
    private PrimitiveIntSeparateChainingHashSetNode nextNode;

    // Constructor
    public PrimitiveIntSeparateChainingHashSetNode(int element, PrimitiveIntSeparateChainingHashSetNode nextNode) {
        this.element = element;
        this.nextNode = nextNode;
    }

    // Methods
    public int getElement() {
        return element;
    }

    public PrimitiveIntSeparateChainingHashSetNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(PrimitiveIntSeparateChainingHashSetNode nextNode) {
        this.nextNode = nextNode;
    }
}
