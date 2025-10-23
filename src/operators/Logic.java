package operators;

public class Logic {
	
    public static void main(String[] args) {
        int a = 10, b = 20;
        
        System.out.println((a < b) && (b > 5));   // AND
        System.out.println((a > b) || (b > 5));   // OR
        System.out.println(!(a == b));            // NOT
    }

}
