package Nov17ImplementingHashSets.Project;

public class PrimitiveDoubleSeparateChainingHashSet {
    // INSTANCE VARIABLES
    private int numberOfBuckets;
    private int size;
    private PrimitiveDoubleSeparateChainingHashSetNode[] bucket;

    // CONSTRUCTORS
    public PrimitiveDoubleSeparateChainingHashSet()
    {
        numberOfBuckets = 10;
        size = 0;
        bucket = new PrimitiveDoubleSeparateChainingHashSetNode[numberOfBuckets];
    }

    public PrimitiveDoubleSeparateChainingHashSet(int numberOfBuckets)
    {
        this.numberOfBuckets = numberOfBuckets;
        size = 0;
        bucket = new PrimitiveDoubleSeparateChainingHashSetNode[numberOfBuckets];
    }

    // Add array elements into the hash set
    public PrimitiveDoubleSeparateChainingHashSet(int numberOfBuckets, double[] array)
    {
        this.numberOfBuckets = numberOfBuckets;
        size = 0;
        bucket = new PrimitiveDoubleSeparateChainingHashSetNode[numberOfBuckets];
        for (int i = 0; i < array.length; i++)
        {
            add(array[i]);
        }
    }

    // INSTANCE METHODS
    private int hashCodeIndex(double element)
    {
        int hashCode = (int)Math.abs(element * 10.0);
        return(hashCode % numberOfBuckets);
    }

    // Refer to lesson notes
    // If adding the new element causes the load factor > 0.5 then
    // double the number of buckets and then move element to
    // their correct buckets
    public boolean add(double element)
    {
        int hashCodeIndex = hashCodeIndex(element);
        PrimitiveDoubleSeparateChainingHashSetNode newNode = new PrimitiveDoubleSeparateChainingHashSetNode(element, null);
        if (bucket[hashCodeIndex] == null) {
            bucket[hashCodeIndex] = newNode;
        } else {
            PrimitiveDoubleSeparateChainingHashSetNode current = bucket[hashCodeIndex];
            while (current.getNextNode() != null) {
                if (current.getElement() == element) {
                    return false;
                }
                current = current.getNextNode();
            }
            if (current.getElement() == element) {
                return false;
            }
            current.setNextNode(newNode);
        }
        size++;
        return true;
    }

    public int getSize()
    {
        return size;
    }

    // Refer to lesson notes
    public double loadFactor()
    {
        return this.size / (double)this.numberOfBuckets;
    }

    // Remove element and return true if the element was removes or false if it was not removed
    public boolean remove(double element)
    {
        int index = hashCodeIndex(element);
        PrimitiveDoubleSeparateChainingHashSetNode currentNode = bucket[index];
        PrimitiveDoubleSeparateChainingHashSetNode previousNode = null;
        while (currentNode != null)
        {
            if (currentNode.getElement() == element)
            {
                if (previousNode == null)
                {
                    bucket[index] = currentNode.getNextNode();
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

    public boolean contains(double element)
    {
        int index = hashCodeIndex(element);
        PrimitiveDoubleSeparateChainingHashSetNode currentNode = bucket[index];
        while (currentNode != null)
        {
            if (currentNode.getElement() == element)
            {
                return true;
            }
            currentNode = currentNode.getNextNode();
        }
        return false;
    }
}
