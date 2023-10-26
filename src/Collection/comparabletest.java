package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class comparabletest {

	public static void main(String[] args) {
		PriorityQueue pq= new PriorityQueue<Company>();
		
		pq.offer(new Company(2,"b","abc"));
		pq.offer(new Company(1,"a","xyz"));
	   
//	
		
		
		System.out.println(pq);
		
//		Collections.sort((List<T>) pq);
		System.out.println(pq);
		
		
	}

	

	
	

}
