package inputFromUsers;


	import java.util.Scanner;

	public class SentenceInput {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter your address: ");
	        String address = sc.nextLine();

	  
	       System.out.println("Address: " + address);
	    sc.close();
	    }
	}
