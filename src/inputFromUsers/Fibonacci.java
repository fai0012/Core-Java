package inputFromUsers;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
       
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
    	int n = sc.nextInt(); // number of terms
       
    	
    	int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + (i==n ? "" : " "));
            int next = a + b;
            a = b; b = next;
       sc.close();
        }
    }
}

