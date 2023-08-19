package rahulshettyacademy;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
		hm.put(0, "hello");
		hm.put(1, "Gudbye");
		hm.put(42, "morning");
		hm.put(3, "evening");
		System.out.println(hm.get(42));
		hm.remove(42);
		System.out.println(hm.get(42));
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();
		// hashtable -pass table set collections
		while (it.hasNext()) {
			//System.out.println(it.next());
			Map.Entry mp = (Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		 Hashtable<String, Integer> hashtable = new Hashtable<>();
		 
	        // Adding elements to the hashtable
	        hashtable.put("A", 1);
	        hashtable.put("B", 2);
	        hashtable.put("C", 3);
	 
	        // Getting values from the hashtable
	        int valueA = hashtable.get("A");
	        System.out.println("Value of A: " + valueA);
	 
	        // Removing elements from the hashtable
	        hashtable.remove("B");
	 
	        // Enumerating the elements of the hashtable
	        Enumeration<String> keys = hashtable.keys();
	        while (keys.hasMoreElements()) {
	            String key = keys.nextElement();
	            System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
	        }

	}

}
