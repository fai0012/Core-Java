package string;

import java.util.Scanner;
public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter a word to count vowels");
        String s = sc.nextLine().toLowerCase();
        int count = 0;
        for (char c : s.toCharArray()) if ("aeiou".indexOf(c) >= 0) count++;
        System.out.println("Vowels = " + count);
    sc.close();
    }
}


