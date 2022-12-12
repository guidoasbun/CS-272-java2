package Nov22ImplmentingHashMaps.Project;

public class PrimitiveDoubleKeyStringValueSeparateChainingHashMap {
    // INSTANCE VARIABLES
    private int numberOfBuckets;
    private int size;
    private PrimitiveDoubleKeyStringValueSeparateChainingHashMapNode[] bucket;

    // CONSTRUCTORS
    public PrimitiveDoubleKeyStringValueSeparateChainingHashMap()
    {
        size = 0;
        numberOfBuckets = 10;
        bucket = new PrimitiveDoubleKeyStringValueSeparateChainingHashMapNode[numberOfBuckets];
    }

    // INSTANCE METHODS
    private int hashCodeIndex(double key)
    {
        int hashCode = (int)Math.abs(key) * 1000;
        return(hashCode % numberOfBuckets);
    }

    public String put(double key, String value)
    {
        int hashCodeIndex = hashCodeIndex(key);
        PrimitiveDoubleKeyStringValueSeparateChainingHashMapNode currentNode = bucket[hashCodeIndex];
        while(currentNode != null)
        {
            if(currentNode.getKey() == key)
            {
                String oldValue = currentNode.getValue();
                currentNode.setValue(value);
                return oldValue;
            }
            currentNode = currentNode.getNextNode();
        }
        bucket[hashCodeIndex] = new PrimitiveDoubleKeyStringValueSeparateChainingHashMapNode(key, value, bucket[hashCodeIndex]);
        size++;
        return null;
    }

    public String get(double key)
    {
        int hashCodeIndex = hashCodeIndex(key);
        PrimitiveDoubleKeyStringValueSeparateChainingHashMapNode currentNode = bucket[hashCodeIndex];
        while(currentNode != null)
        {
            if(currentNode.getKey() == key)
            {
                return currentNode.getValue();
            }
            currentNode = currentNode.getNextNode();
        }
        return null;
    }

    public double loadFactor()
    {
        return (double)size / (double)numberOfBuckets;
    }
    public boolean remove(double key)
    {
        int hashCodeIndex = hashCodeIndex(key);
        PrimitiveDoubleKeyStringValueSeparateChainingHashMapNode currentNode = bucket[hashCodeIndex];
        PrimitiveDoubleKeyStringValueSeparateChainingHashMapNode previousNode = null;
        while(currentNode != null)
        {
            if(currentNode.getKey() == key)
            {
                if(previousNode == null)
                {
                    bucket[hashCodeIndex] = currentNode.getNextNode();
                }
                else
                {
                    previousNode.setNextNode(currentNode.getNextNode());
                }
                size--;
                return true;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNextNode();
        }
        return false;
    }
}
