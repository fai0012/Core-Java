package inputFromUsers;

import java.util.Scanner;

public class DoubleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.println("Price is: " + price);
    sc.close();
    }
    
}

