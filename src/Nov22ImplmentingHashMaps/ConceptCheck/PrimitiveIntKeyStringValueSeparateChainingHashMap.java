package Nov22ImplmentingHashMaps.ConceptCheck;

public class PrimitiveIntKeyStringValueSeparateChainingHashMap {
    // INSTANCE VARIABLES
    private int numberOfBuckets;
    private int size;
    private PrimitiveIntKeyStringValueSeparateChainingHashMapNode[] bucket;

    // CONSTRUCTORS
    public PrimitiveIntKeyStringValueSeparateChainingHashMap() {
        this.numberOfBuckets = 10;
        this.size = 0;
        this.bucket = new PrimitiveIntKeyStringValueSeparateChainingHashMapNode[this.numberOfBuckets];
    }

    // INSTANCE METHODS

}
