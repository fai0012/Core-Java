package basicCode;
// scannar library import to get user input
import java.util.Scanner;

	public class CheckEvenOdd {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number: ");
	        int num = sc.nextInt();

	        if(num % 2 == 0) {  // if reminder is equal to zero then print even else odd
	            System.out.println("Even");
	        } else {
	            System.out.println("Odd");
	            sc.close();// we need to close scanner to avoid resources leak
	        }
	    }
	}



