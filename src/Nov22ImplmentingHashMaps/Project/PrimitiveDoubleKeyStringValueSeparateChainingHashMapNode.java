package Nov22ImplmentingHashMaps.Project;

public class PrimitiveDoubleKeyStringValueSeparateChainingHashMapNode {
    // INSTANCE VARIABLES
    private double key;
    private String value;
    private PrimitiveDoubleKeyStringValueSeparateChainingHashMapNode nextNode;

    // CONSTRUCTORS
    public PrimitiveDoubleKeyStringValueSeparateChainingHashMapNode(double key, String value, PrimitiveDoubleKeyStringValueSeparateChainingHashMapNode nextNode)
    {
        this.key = key;
        this.value = value;
        this.nextNode = nextNode;
    }

    // INSTANCE METHODS
    public double getKey()
    {
        return key;
    }

    public String getValue()
    {
        return value;
    }

    public PrimitiveDoubleKeyStringValueSeparateChainingHashMapNode getNextNode()
    {
        return nextNode;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public void setNextNode(PrimitiveDoubleKeyStringValueSeparateChainingHashMapNode nextNode)
    {
        this.nextNode = nextNode;
    }

}
