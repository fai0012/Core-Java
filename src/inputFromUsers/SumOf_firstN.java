package inputFromUsers;

	import java.util.Scanner;
	public class SumOf_firstN {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	       System.out.println("enter a number");
	        int n = sc.nextInt(); // enter N
	        int sum = 0;
	        for (int i = 1; i <= n; i++) sum += i;
	        System.out.println("Sum = " + sum);
	   sc.close();
	    }
	}


