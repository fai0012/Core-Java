package arrayDemo;

public class ArrayMaxMin {
   public static void main(String[] args) {
	        int[] a = {5, 2, 9, 1, 7};
	        int max = a[0], min = a[0];
	        for (int v : a) {
	            if (v > max) max = v;
	            if (v < min) min = v;
	        }
	        System.out.println("Max=" + max + " Min=" + min);
	    }
	}


