package oops;

public class BOABank extends Bank{
	
	public int CreditCardNum;
	
	public void CCBalance() {
		
		System.out.println("Inside CC Balance");
		this.CreditCardNum = 1000;
		super.AccountNum = 123456; //-> Super refers to parent class
		this.AccountNum = 7898;
	}
	public void CloseAccount(int CCNum) {
		System.out.println("Inside Bank Close Account(BOA)");
	}
	
}