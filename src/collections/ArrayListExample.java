package collections;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] array1 = {"abc","pqr","xyz","asdasd","rtert"};
		
		ArrayList<String> List1 = new ArrayList<String>();
		List1.add("John");
		List1.add("Leeana");
		List1.add("Priyanka");
		List1.add("Rohan");
		List1.add("Lawrence");
		
		System.out.println("The list contains:  " +List1);
		System.out.println("Size of Array List is  "+List1.size());	
		System.out.println(" The data at 4th position is: " +List1.get(3));
		
		List1.remove(1);
		
		System.out.println("The list contains:  " +List1);
		System.out.println("Size of Array List is  "+List1.size());		
		System.out.println(" The data at 4th position is: " +List1.get(3));
		
		List1.set(0, "James");
		System.out.println("The list now contains:  " +List1);
		
		List1.add(1,"Leeana");
		System.out.println("The list now contains:  " +List1);
		
		Collections.sort(List1);
		System.out.println("Sorted List:  " +List1);
		
		for(int index=0;index<List1.size();index++) {
			System.out.println(List1.get(index));
		}
		
		for(String name:List1)
		{
			System.out.println(name);
		}
		
		List1.sort(Collections.reverseOrder());
		System.out.println("The list now contains:  " +List1);
		
		for(int index=0;index<List1.size();index++) {
			if(List1.get(index) == "Priyanka")
       {
			System.out.println(index);
		}

	}

}
}
