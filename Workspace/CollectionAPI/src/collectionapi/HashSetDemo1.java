package collectionapi;

import java.util.HashSet;

public class HashSetDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashSet<String> s1 = new HashSet<String>();
		
		s1.add("varun");
		s1.add("Ramesh");
		s1.add("Suresh");
		s1.add("chandan");
		s1.add("arun");
		
		System.out.println("Set Size :"+s1.size());
		
		for(String name:s1)
		{
			System.out.println(name);
		}
	}

}
