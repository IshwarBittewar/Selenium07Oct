package Collection;

import java.util.HashSet;

public class SetInterface1 {

	public static void main(String[] args) {
		HashSet hs= new HashSet();
		
		hs.add("null");
		hs.add(1);
		hs.add("ishwar");
		hs.add("@");
		hs.add(2);
		hs.add(2);
		
		for(Object ab:hs) {
			System.out.println(ab);
		}

	}

}
