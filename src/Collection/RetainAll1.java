package Collection;

import java.util.ArrayList;

public class RetainAll1 {
	public static void main(String[] args) {
ArrayList al1= new ArrayList();
		
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(4);
		al1.add("ishwar");
		al1.add("bittewar");
		
		
		ArrayList al= new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(33);
		al.add(44);
		al.add(55);
		
		System.out.println(al);
		System.out.println(al1);
		
//		al1.retainAll(al);
//		
//		System.out.println(al);
//		al.clear();
//		System.out.println(al);
//	Addall method
		
		al.addAll(al1);
		System.out.println(al);
		
		
		
	}

}
