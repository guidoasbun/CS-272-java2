package Nov22ImplmentingHashMaps.LabActivityHashMap;

public class PrimitiveIntKeyStringValueSeparateChainingHashMapNode {
    // Instance Variables
    private int key;
    private String value;
    private PrimitiveIntKeyStringValueSeparateChainingHashMapNode nextNode;

    // Constructor
    public PrimitiveIntKeyStringValueSeparateChainingHashMapNode(int key, String value, PrimitiveIntKeyStringValueSeparateChainingHashMapNode nextNode) {
        this.key = key;
        this.value = value;
        this.nextNode = nextNode;
    }

    // Methods
    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public PrimitiveIntKeyStringValueSeparateChainingHashMapNode getNextNode() {
        return nextNode;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setNextNode(PrimitiveIntKeyStringValueSeparateChainingHashMapNode nextNode) {
        this.nextNode = nextNode;
    }
}
