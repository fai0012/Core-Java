package string;

import java.util.Scanner;
public class ReverseStrng {
    public static void main(String[] args) {
       
    	System.out.println("enter a sentence which you want a reverse");
    	Scanner sc = new Scanner(System.in);
    	String s = sc.nextLine();
       
        
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse().toString());

    sc.close();
    }
}
