package collections;

import java.util.ArrayList;

public class ArrayListExample1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("grapes");
		list.add("Mango");
		list.add("banana");
		//accessing the element    
		  System.out.println("Returning element: "+list.get(1));//it will return the 2nd element, because index starts from 0  
		  //changing the element  
		  list.set(1,"Dates");  
		  //Traversing list  
for(String fruit:list)
	System.out.println(fruit);
}
}