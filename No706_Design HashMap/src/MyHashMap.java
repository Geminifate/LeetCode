import java.util.ArrayList;

public class MyHashMap {

	/** Initialize your data structure here. */
    private ArrayList<Integer> key_list;
    private ArrayList<Integer> val_list;
    public MyHashMap() {
    	key_list = new ArrayList();
    	val_list = new ArrayList();
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
    	if (key_list.contains(key)) {
    		int index = key_list.indexOf(key);
    		val_list.set(index, value);
		}else {
			key_list.add(key);
	        val_list.add(value);
		}
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
    	if (key_list.contains(key)) {
    		int index = key_list.indexOf(key);
            return val_list.get(index);
		}
    	return -1;
        
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        if (key_list.contains(key)) {
    	    int index = key_list.indexOf(key);
    	    key_list.remove(index);
    	    val_list.remove(index);
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */