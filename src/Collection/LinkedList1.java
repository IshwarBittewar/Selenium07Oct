package Collection;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Vector;

public class LinkedList1 {

	public static void main(String[] args) {
		
		
		
		Vector ll= new Vector();
		
		
		ll.add("ishwar");
		ll.add(1);
		ll.add("bittewar");
		ll.add(2);
		ll.add('@');
		
		for(int i=1; i<=10; i++) {
			ll.add(i);
			
		}
		
//		System.out.println(ll);
		
//		/for retrieve the the element one by one we go the cursors
		
		Enumeration e= ll.elements();
		
		while (e.hasMoreElements()) {
			
			Integer i =(Integer) e.nextElement();
			
			
			
		}
		System.out.println(ll);
	}
}
