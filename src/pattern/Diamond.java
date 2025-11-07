package pattern;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("enter Diamond Half of height :");
        int n = sc.nextInt(); // try odd n or treat n as half-height
        // upper
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int k = 1; k <= 2*i - 1; k++) System.out.print("*");
            System.out.println();
        }
        // lower
        for (int i = n-1; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int k = 1; k <= 2*i - 1; k++) System.out.print("*");
            System.out.println();
       sc.close();
        }
    }
}
