package collectionArrayList;

import java.util.ArrayList;
import java.util.List;

public class Demoarraylist {
	public static void main(String []args){
		
	List<Integer> arrayList = new ArrayList<Integer>(5);
		for (int i =1 ; i<=5; i++) 
			arrayList.add(i); 
		System.out.println(arrayList);//printing elements	
	
		arrayList.remove(3);   // remove the element in 3rd index in array list which is index start from 0
		System.out.println(arrayList);//again printing elements after remove elements
		
		
	for(int i = 0; i < arrayList.size(); i++) {
		System.out.print(arrayList.get(i) + " ");
	}
	System.out.println();
	
	for(int i :arrayList) {
		System.out.print(i+" ");
	}
	
	}
	
} 