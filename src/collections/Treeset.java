package collections;
import java.util.TreeSet;
public class Treeset {

	public static void main(String[]args) {
		
		TreeSet<String> treeset = new TreeSet<String>();
		
		treeset.add("D");
		treeset.add("A");
		treeset.add("C");
		treeset.add("B");
		treeset.add("F");
		treeset.add("F");
		                     
		System.out.println(treeset); //TreeSet is always mantain the natural order of elements and always contain unique elements
	
		
	}
}
