package oops_concepts;

class encapsulation {
	private String acctName;
	private int acctBal;
	
	
	public void setacctName(String name) {
		acctName = name;	
	}
	public String getacctName() {
		return acctName;
	}
	
	public void setacctBal(int Balance) {
		acctBal = Balance;
	}
	public int getacctBal() {
		return acctBal;
	}
	public static void main (String []args) {
		
		encapsulation test = new encapsulation();
		test.setacctName ("faizan");
		test.setacctBal(5000);
		
		System.out.println("Acct holder Name: " + test.getacctName());
      System.out.println("Acct Balance: " + test.getacctBal());
	}
}
