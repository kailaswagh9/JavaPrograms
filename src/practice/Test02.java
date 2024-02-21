package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Test02 {

	public static void main(String[] args) {		
		ArrayList<String> al = new ArrayList<>();
		al.add("monday");
		al.add("Tuesday");
		al.add("Wednesday");
		al.add("One");
		al.add("Two");
		
		/*	
		LinkedList<String> ll = new LinkedList<>();
		
//		al.removeAll(ll);
//
		for(int i=0;i<al.size();i++) {
			if(al.get(i).contains("y")) {	
				
			}else {
				ll.add(al.get(i));
			}
		}
		

		
		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
				System.out.println(it.next());
		}
		
		*/
		System.out.println(al);
		
		
		
	}

}
