package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample3 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("tiger");
		names.add("Lion");
		names.add("Cheetah");
		names.add("Elephant");
		Iterator itr = names.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());	
	}
}
}
