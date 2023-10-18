package Collection;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		ArrayList al1= new ArrayList();
		
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(4);
		al1.add("ishwar");
		al1.add("bittewar");
		al1.add(5);
		al1.add(5);
		al1.add("ishwar");
		System.out.println(al1.size());
		al1.set(8, "qweert");
		al.add("qwert");
		al.add("asdfg");
		al.add("zxcv");
		
		System.out.println(al.contains("qwert"));
//		System.out.println(al.set(0, null));
//		System.out.println(al.remove(0));
//		System.out.println(al.indexOf(al));
//		System.out.println(al);
//		for each loop
		
		
		System.out.println(al1);
		System.out.println(al.addAll(al1));
		for(Object ab:al) {
			
			System.out.println(ab);
		}
		
		
   }
	

}
