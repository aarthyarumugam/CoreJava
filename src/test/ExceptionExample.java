package test;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array = {3,4,5};
int num = 10;

try {
	int res = num/0;
	System.out.println(" "+ res);
	System.out.println("Name is:");//--> will not be executed due to exception in previous line
}

catch(ArithmeticException e) {
	System.out.println("Inside catch block of Arithmetic Exception");
}

try {
	System.out.println(array[5]);
	
}

catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("Inside catch block");
}

finally {
	System.out.println("Inside Finally Block");
}

System.out.println("After Exception");
	}
	

}
