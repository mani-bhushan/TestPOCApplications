package app.org.com.ds.algos;

import java.util.HashSet;
import java.util.Set;

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
public class MyHashSet {

	private Set myHashSet;
	
	private String[] setArray;
	
	int capacity;
    int size;
    float load_factor;
	
	public MyHashSet() {
        this.myHashSet = new HashSet<>();
        setArray = new String[5];
    }
    
    public void add(int key) {
        this.myHashSet.add(key);
    }
    
    public void remove(int key) {
        
    }
    
    public boolean contains(int key) {
		return false;
    }
	
	public static void main(String[] args) {
		String[] strArray = {"MyHashSet","add","add","contains","contains","add","contains","remove","contains"};
		// Integer[] intArray = {};
	}

}
