package inputFromUsers;

import java.util.Scanner;

public class StringInput {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter your city: ");
	        String city = sc.next();

	        System.out.println("City: " + city);
	 sc.close();  
	 }
}
