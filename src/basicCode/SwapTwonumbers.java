package basicCode;

import java.util.Scanner;
public class SwapTwonumbers {

	public static void main(String[]args) {
		
		Scanner a1 = new Scanner(System.in);
		
		System.out.println("please enter a first number(a): ");
		int a = a1.nextInt();
		
		System.out.println("please enter a second number(b) ");
		int b = a1.nextInt();
		
		System.out.println("before swapping a: " +a+ " ,b " +b );
		
		//swapping method 1 with third variable
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("after swapping with variable a : "+a+ " b,"+b );
		
		// swapping method 2 without using third variable 
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("after swapping with variable a : "+a+ " b,"+b);
		
		 a1.close();
	}
}
