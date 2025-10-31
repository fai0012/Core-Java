package basicCode;

import java.util.Scanner;

public class SwapTwonumber_with_method_calling {
	
	static void swapnumberwithvariable(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("swap two numbers with third variable a :"+a+" b: "+b);
	}
	static void swapnumberswithoutvariable (int a, int b) {
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("swap two numbers without variable a: "+a+ " b: "+b);
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter first number a :");
		int a = sc.nextInt();
		
		System.out.println("please enter secound number b :");
		int b = sc.nextInt();
		
		// calling the methods one by one with both logics
		
		swapnumberwithvariable(a , b);
		swapnumberswithoutvariable(a, b);
		sc.close();
		
	}
}
