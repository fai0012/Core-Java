package collections;
import java.util.*;
public class Hashset {
	public static void main (String[]args) {
		
	Set<String> hashset = new HashSet<String>();	
	
	boolean a1 = hashset.add("A");
	System.out.println(a1);
	boolean a2 = hashset.add("A");
	System.out.println(a2);
	hashset.add("B");
	hashset.add("C");
	
	System.out.println(hashset);
	
	System.out.println("set is contain A or not ? " + hashset.contains("A"));
	hashset.remove("B");
	
	System.out.println("set after remove B "+ hashset);
	
	for(String item : hashset) {
		System.out.print(item);
	}
	}
	


}
