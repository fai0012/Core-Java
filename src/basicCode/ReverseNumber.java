package basicCode;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        long num = sc.nextLong();

        long rev = 0;

        while(num != 0) {
            long digit = num % 10;  
            rev = rev * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reverse: " + rev);
    sc.close();
    }
}

