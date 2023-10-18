package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator1 {

	public static void main(String[] args) {
LinkedList al1= new LinkedList();
		
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(4);
		//al1.add("ishwar");
//		al1.add("bittewar");
		al1.add(5);
		al1.add(5);
//		al1.add("ishwar");
		
System.out.println(al1);

	ListIterator it =al1.listIterator();
	
	while(it.hasNext()) {
		
		Integer I =(Integer) it.next();
		
		if(I==5) {
			it.remove();
		}
		else if(I==4){
		it.add(5);	
		}
		else if(I==1) {
			it.set(66);
		}
	}
	System.out.println(al1);

	}

}
