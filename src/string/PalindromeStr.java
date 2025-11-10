package string;

import java.util.Scanner;
public class PalindromeStr {
    public static void main(String[] args) {
      
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter a word to check");
    	String s = sc.nextLine().replaceAll("\\s+","").toLowerCase();
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(rev) ? "Palindrome" : "Not Palindrome");
   sc.close();
    }
}


