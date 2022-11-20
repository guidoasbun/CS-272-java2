package Nov17ImplementingHashSets.LabActivityImplementingHashSet;

public class PrimitiveIntSeparateChainingHashSet {
    // Instance variables
    private int numberOfBuckets;
    private int size;
    private PrimitiveIntSeparateChainingHashSetNode[] bucket;

    // Constructor
    public PrimitiveIntSeparateChainingHashSet() {
        this.numberOfBuckets = 10;
        this.size = 0;
        this.bucket = new PrimitiveIntSeparateChainingHashSetNode[this.numberOfBuckets];
    }

    public PrimitiveIntSeparateChainingHashSet(int numberOfBuckets) {
        this.numberOfBuckets = numberOfBuckets;
        this.size = 0;
        this.bucket = new PrimitiveIntSeparateChainingHashSetNode[this.numberOfBuckets];
    }

    // Private Methods
    private int hashCodeIndex(int element) {
        int hashCode = Math.abs(element);
        return (hashCode % this.numberOfBuckets);
    }

    // Public Methods
    public boolean add(int element) {
        int index = hashCodeIndex(element);
        PrimitiveIntSeparateChainingHashSetNode currentNode = this.bucket[index];
        while (currentNode != null) {
            if (currentNode.getElement() == element) {
                return false;
            }
            currentNode = currentNode.getNextNode();
        }
        PrimitiveIntSeparateChainingHashSetNode newNode = new PrimitiveIntSeparateChainingHashSetNode(element, this.bucket[index]);
        this.bucket[index] = newNode;
        this.size++;
        return true;
    }

    public int getSize() {
        return this.size;
    }

    public boolean contains(int element) {
        int index = hashCodeIndex(element);
        PrimitiveIntSeparateChainingHashSetNode currentNode = this.bucket[index];
        while (currentNode != null) {
            if (currentNode.getElement() == element) {
                return true;
            }
            currentNode = currentNode.getNextNode();
        }
        return false;
    }
}
