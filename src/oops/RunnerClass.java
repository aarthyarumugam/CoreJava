package oops;

public class RunnerClass {

	public static void main(String[] args) {

//=============================================
//Runner Class Example
//=============================================	
//		
//		Employee E1 = new Employee();
//		E1.Name ="Mike";
//		E1.EmpId =1000;
//		E1.Department ="HR";
//		E1.Display();
//		
//      System.out.println(E1.Name);
// 	    System.out.println(E1.EmpId);
// 	    System.out.println(E1.Department);
//		
//      Employee E2 = new Employee();
//      E2.Name ="Harry";
//      E2.EmpId =1001;
//      E2.Department ="Mech";
//      E2.Display();
// 		
//		Employee E2 = new Employee("Harry",1001,"Mech"); //--> Usage of param constructor
//		E2.Display();
//      System.out.println(E2.Name);
//      System.out.println(E2.EmpId);
//      System.out.println(E2.Department);
//
//	}
//		
//=============================================
//	Inheritance Example
//=============================================
//		
//	Bank B = new Bank();
//	B.DisplayBalance();
//	
//	int Bal = B.GetBalance();
//	
//	System.out.println("The Balance is : " + B.GetBalance());
//	System.out.println("The Balance is : " + Bal);
//	
//	BOABank B1 = new BOABank();
//	B1.CCBalance();
//	B1.DisplayBalance();
//	}
//
//=============================================
//		OverLoading Example
//=============================================	
//		
//		OverLoadingExample obj = new OverLoadingExample();
//		int RecArea = obj.GetArea(3,4);
//		int SqArea = obj.GetArea(4);
//		double SqArea1 = obj.GetArea(4.2);
//		float SqArea2 = obj.GetArea(4.32f);
//		
//		System.out.println(" Rec Area " +  RecArea);
//		System.out.println(" Square Area " +  SqArea);
//		System.out.println(" Square Double " +  SqArea1);
//		System.out.println(" Square float " +  SqArea2);	
//		
//=============================================
//		Overriding Example
//=============================================
//		
		Bank B = new Bank();
		BOABank B1 = new BOABank();
		B1.CloseAccount(123456);
		B.CloseAccount(12345);
//		
//=============================================
//		Abstraction Example
//=============================================
//
//		Browser Br = new Browser(); --> incorrect 
		Browser Br = new Chrome();
		Chrome Ch = new Chrome();
		Ch.OpenBrowser();
		Br.OpenBrowser();
		Br.CloseBrowser();
		Br.DisplayBrowser();
		Ch.Show();
//		Br.Show(); --> incorrect as child implementation cannot be used by parent class instance
//		
//=============================================
//		Interface Example
//=============================================
//
	HondaCar HC = new HondaCar();
//       OR
    CarInterface honda = new HondaCar();
//=============================================
//	Encapsulation Example
//=============================================	
    
    EncapsulationEx en = new EncapsulationEx();
     en.setBalance(100000);
     int Bal = en.getBalance();
    System.out.println("The Balance is " + Bal);
}
}
