package collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap {
public static void main (String []args) {
	HashMap<String, Integer> map = new HashMap<>();
	map.put("a",10);
	map.put("b", 20);
	map.put("c", 30);
	
	System.out.println("size of map is : " +map.size());
	System.out.println(map);
	
	if (map.containsKey("a")) { //map provide containskey to check elements are present are not
		Integer a = map.get("a");
		System.out.println("value for key " + "\"a\" is:- "+a );
		}
	System.out.println();  // using for new line 
	for(String key : map.keySet()) {
		System.out.println("key "+ key +", value "+ map.get(key));
	}
	System.out.println(); //using for new line
	
	// using map.entry set using Map.Entry Library
	for(Entry<String,Integer> entry : map.entrySet()) {
		System.out.println("key "+entry.getKey()+", value "+ entry.getValue());
	}
	}
}
