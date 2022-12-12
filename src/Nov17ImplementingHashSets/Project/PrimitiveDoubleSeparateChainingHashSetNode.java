package Nov17ImplementingHashSets.Project;

public class PrimitiveDoubleSeparateChainingHashSetNode {
    // INSTANCE VARIABLES
    private double element;
    private PrimitiveDoubleSeparateChainingHashSetNode nextNode;

    // CONSTRUCTOR
    public PrimitiveDoubleSeparateChainingHashSetNode(double element, PrimitiveDoubleSeparateChainingHashSetNode nextNode)
    {
        this.element = element;
        this.nextNode = nextNode;
    }

    // INSTANCE METHODS
    public double getElement()
    {
        return element;
    }

    public PrimitiveDoubleSeparateChainingHashSetNode getNextNode()
    {
        return nextNode;
    }

    public void setNextNode(PrimitiveDoubleSeparateChainingHashSetNode nextNode)
    {
        this.nextNode = nextNode;
    }
}
