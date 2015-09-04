package collectionapi;

import java.util.PriorityQueue;

public class PriorityQueueDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		PriorityQueue q1 = new PriorityQueue();
		
		q1.add("Varun");
		q1.add("Ramesh");
		q1.add("Suresh");
		q1.add("Chandan");
		q1.add("Arun");
		
		System.out.println("Queue Size : "+q1.size());
		
		Object o1 = q1.poll();
		
		while(o1 != null)
		{
			System.out.println(o1);
			//o1=o1.poll();
		}
		System.out.println("Queue Size ="+q1.size());
	}

}
