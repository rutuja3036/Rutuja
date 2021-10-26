package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HasSet1 {
	public static void main(String[] args) {
		//Creating HashSet and adding elements  
	    HashSet<String> set=new HashSet();  
	           set.add("One");    
	           set.add("Two");    
	           set.add("Three");   
	           set.add("Four");  
	           set.add("Five");  
	           Iterator<String> itr=set.iterator();  
	           while(itr.hasNext())  
	           {  
	           System.out.println(itr.next());  
	           }  
	 }  
	}


