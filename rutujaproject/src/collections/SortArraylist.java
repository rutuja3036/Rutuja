package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArraylist {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("grapes");
		list.add("mango");
		list.add("banana");
		Collections.sort(list);
		System.out.println(list);
		
		
	}
}
