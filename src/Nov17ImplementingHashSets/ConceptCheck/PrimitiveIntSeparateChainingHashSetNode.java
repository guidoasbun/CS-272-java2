package Nov17ImplementingHashSets.ConceptCheck;

public class PrimitiveIntSeparateChainingHashSetNode {
    // INSTANCE VARIABLES
    private int element;
    private PrimitiveIntSeparateChainingHashSetNode nextNode;

    // CONSTRUCTOR
    public PrimitiveIntSeparateChainingHashSetNode(int element, PrimitiveIntSeparateChainingHashSetNode node) {
        this.element = element;
        this.nextNode = node;
    }

    // INSTANCE METHODS
    public int getElement() {
        return this.element;
    }

    public PrimitiveIntSeparateChainingHashSetNode getNextNode() {
        return this.nextNode;
    }

    public void setNextNode(PrimitiveIntSeparateChainingHashSetNode node) {
        this.nextNode = node;
    }

    public void setElement(int element) {
        this.element = element;
    }

}
