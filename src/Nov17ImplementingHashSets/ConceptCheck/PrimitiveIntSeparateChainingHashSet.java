package Nov17ImplementingHashSets.ConceptCheck;

public class PrimitiveIntSeparateChainingHashSet {
    // INSTANCE VARIABLES
    private int numberOfBuckets; // total number of buckets
    private int size; // number of nodes
    private PrimitiveIntSeparateChainingHashSetNode[] bucket; // the bucket

    // CONSTRUCTOR
    public PrimitiveIntSeparateChainingHashSet() {
        this.numberOfBuckets = 10;
        this.size = 0;
        this.bucket = new PrimitiveIntSeparateChainingHashSetNode[this.numberOfBuckets];
    }

    // INSTANCE METHODS
    public double getLoadFactor() {
        return (double) this.size / this.numberOfBuckets;
    }

}
