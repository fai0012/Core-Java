package inputFromUsers;

import java.util.Scanner;

public class CharInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        System.out.println("You entered: " + ch);
  sc.close();
    }
}
