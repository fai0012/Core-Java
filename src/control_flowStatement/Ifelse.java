package control_flowStatement;

public class Ifelse {
	public static void main (String []args) {
		int myAge = 19;
				int votingAge = 18;
				
				if(myAge >= votingAge) {
					System.out.println("congrats you are eligible for voting");
				}else {
					System.out.println("you are not eligible for voting required 18 and your age is " +myAge );
				}
	}

}
