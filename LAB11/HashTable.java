
public class HashTable {

	private int _numBuckets;
	private Node[] _buckets;
	private int _count;
	private double _loadFactor;
	private double _maxLoadFactor;
	
	public HashTable(){
	// constructor for the class that sets the member variables
		_numBuckets = 7;
		_buckets = new Node[_numBuckets];
		_count = 0;
		_loadFactor = 0.0;
		_maxLoadFactor = 0.7;
	}

	private Node _locate(Object key){
	// given a key, return the node/bucket associated
		int hashCode = key.hashCode();
		int bucketNum = hashCode % _numBuckets;
		return _locate(key, bucketNum);
	}

	private Node _locate(Object key, int bucketNum){
	// given a key and bucket number return the node associated
		Node bucketList = _buckets[bucketNum];
		while(bucketList != null)
		{
			if(key == bucketList._key){				// If the key matches the key of the current node
				break;								// in bucketList, then return the bucketList.
			}
			bucketList = bucketList._nextNode;		// Otherwise move to the next node.
		}
		return bucketList;
	}

	public void add(Object key, Object value){
	// if a key already exists, replace the associated value with a new value, otherwise create a new key with associated value.
		int bucketLoc = key.hashCode() % _numBuckets;
		if(_locate(key) == null){
			Node newNode = new Node(key,value,_buckets[bucketLoc]);
			_buckets[bucketLoc] =  newNode;
			_count++;
			_loadFactor = (double) _count / (double) _numBuckets;
			if(_loadFactor > _maxLoadFactor){
				_increaseTableSize();
			}
		}else{
			_buckets[bucketLoc]._value = value;
		}
	}

	public void _increaseTableSize(){
	// increase the _buckets array by double plus 1 (to make it odd)
		Node[] largerBuckets = new Node[_numBuckets * 2 + 1];
		Node[] oldBuckets = _buckets;
		_buckets = largerBuckets;
		_numBuckets = _numBuckets * 2 + 1;
		_count = 0;
		_loadFactor = 0.0;
		int i = 0;
		for(Node eachNode : oldBuckets){
			_buckets[i] = eachNode;
			i++;
		}
	}

	public Object get(Object key){
	// get the value of a node given the key
		Node tempNode = _locate(key);
		if(tempNode != null){
			return tempNode._value;
		}else{
			return null;
		}
	}

	public void dump(){
	// display all the nodes/buckets in _buckets
		for(int n=0; n<_numBuckets; n++){
			Node current = _buckets[n];
			if(current != null){
				System.out.println(n + ": " + current.toString());
			}else{
				System.out.println(n + ": null");
			}
		}
	}

	@Override
	public String toString(){
	// more useful toString method that shows only the nodes in the _buckets array
		String s = "{";
		boolean first = true;
		for(int n=0; n<_numBuckets; n++)
		{
			Node node = _buckets[n];
			if(node != null)
			{
				if(first)
					first = false;
				else
					s += ", ";
				s += node.toString();
			}
		}
		s += "}";
		return s;
	}
}
