package Nov22ImplmentingHashMaps.LabActivityHashMap;

public class PrimitiveIntKeyStringValueSeparateChainingHashMap {
    // Instance Variables
    private int numberOfBuckets;
    private int size;
    private PrimitiveIntKeyStringValueSeparateChainingHashMapNode[] bucket;

    // Constructor
    public PrimitiveIntKeyStringValueSeparateChainingHashMap() {
        this.numberOfBuckets = 10;
        this.size = 0;
        this.bucket = new PrimitiveIntKeyStringValueSeparateChainingHashMapNode[this.numberOfBuckets];
    }

    public PrimitiveIntKeyStringValueSeparateChainingHashMap(int numberOfBuckets) {
        if (numberOfBuckets < 1) {
            throw new IllegalArgumentException("numberOfBuckets must be greater than 0");
        } else {
            this.numberOfBuckets = numberOfBuckets;
            this.size = 0;
            this.bucket = new PrimitiveIntKeyStringValueSeparateChainingHashMapNode[this.numberOfBuckets];
        }
    }

    // Private Method
    private int hashCodeIndex(int key) {
        int hashCode = Math.abs(key);
        return (hashCode % this.numberOfBuckets);
    }

    // Public Methods
    public String put(int key, String value) {
        int hashCodeIndex = hashCodeIndex(key);
        PrimitiveIntKeyStringValueSeparateChainingHashMapNode currentNode = this.bucket[hashCodeIndex];
        while (currentNode != null) {
            if (currentNode.getKey() == key) {
                String oldValue = currentNode.getValue();
                currentNode.setValue(value);
                return oldValue;
            }
            currentNode = currentNode.getNextNode();
        }
        this.bucket[hashCodeIndex] = new PrimitiveIntKeyStringValueSeparateChainingHashMapNode(key, value, this.bucket[hashCodeIndex]);
        this.size++;
        return null;
    }

    public int getSize() {
        return this.size;
    }

    public String get(int key) {
        int hashCodeIndex = hashCodeIndex(key);
        PrimitiveIntKeyStringValueSeparateChainingHashMapNode currentNode = this.bucket[hashCodeIndex];
        while (currentNode != null) {
            if (currentNode.getKey() == key) {
                return currentNode.getValue();
            }
            currentNode = currentNode.getNextNode();
        }
        return null;
    }

    public double loadFactor() {
        return (double) this.size / this.numberOfBuckets;
    }
}
