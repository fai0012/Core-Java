package inputFromUsers;

	import java.util.Scanner;
	public class Factorial {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	       System.out.println("please enter A number :");
	        int n = sc.nextInt(); // enter non-negative integer
	        long fact = 1;
	        for (int i = 2; i <= n; i++) fact *= i;
	        System.out.println(n + "! = " + fact);
	   sc.close();
	    }
	}


