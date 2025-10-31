package basicCode;

import java.util.Scanner;

public class FindlargestNumber {
	    public static void main(String[] args) {
	        
	    	 Scanner sc = new Scanner(System.in);
	         System.out.print("Enter first number1: ");
	         int num1 = sc.nextInt();
	         
	         System.out.print("Enter second number2: ");
	         int num2 = sc.nextInt();
	      
	        if(num1 > num2) {
	            System.out.println("num1 is larger");
	        } else {
	            System.out.println("num2 is larger");
	        
	            sc.close();
	        }
	        
	    }
	}


