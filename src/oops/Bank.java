package oops;

public class Bank{
	
	public int AccountNum;
	
	public void DisplayBalance() {
		System.out.println("Inside Account Balance");
	}
	
	public int GetBalance() {
		
		return 100;
	}
	
	public void CloseAccount(int AccountNum) {
		System.out.println("Inside Bank Close Account");
	}
	
	}
