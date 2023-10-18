package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {

	public static void main(String[] args) {
		
ArrayList al1= new ArrayList();
		
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(4);
		//al1.add("ishwar");
//		al1.add("bittewar");
		al1.add(5);
		al1.add(5);
//		al1.add("ishwar");
		
//		for(int i=0; i<=al1.size(); i++) {
//			
//			System.out.println(i);
//		}
		
//		by using the iterator we can perform read remove operation
		
		Iterator itr=  al1.iterator();
		
		while(itr.hasNext()) {
			
			Integer I = (Integer) itr.next();
if(I%2==1) {
			System.out.println(I);
			
}
//else {
//	itr.remove();
//}
		}
System.out.println(al1);
	}

}
