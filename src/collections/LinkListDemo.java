package collections;
import java.util.LinkedList;

	public class LinkListDemo {
		public static void main(String []args) {
	
			LinkedList<String> list = new LinkedList<String>();
			
			
			list.add("A");
			list.add("B");
			System.out.println(list);
			
			list.addLast("E");
			System.out.println(list);
			
			list.addFirst("D");
			System.out.println(list);
			
			list.add(3,"C");
			
			System.out.println(list);
			
			list.remove(0);
			System.out.println(list);
		}
}
