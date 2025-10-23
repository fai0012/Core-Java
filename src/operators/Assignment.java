package operators;

public class Assignment {

	    public static void main(String[] args) {
	        int a = 8;
	        
	        a += 2;  // same as a = a + 5
	        System.out.println("After += : " + a);
	        
	        a -= 5;  // same as a = a - 3
	        System.out.println("After -= : " + a);
	        
	        a *= 6;  // same as a = a * 2
	        System.out.println("After *= : " + a);
	        
	        a /= 2;  // same as a = a / 4
	        System.out.println("After /= : " + a);
	        
	        a %= 6;  // same as a = a % 3
	        System.out.println("After %= : " + a);
	    }
	}

