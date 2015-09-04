package collectionapi;
import java.util.TreeSet;

public class TreeSetDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SortByAge ageWise = new SortByAge();
		TreeSet s1 = new TreeSet(ageWise);
		
		//sorted according to the student id
		
		s1.add(new Student(12334,"Ramesh",25));
		s1.add(new Student(12556,"Mahesh",18));
		s1.add(new Student(198726,"Jaggesh",20));
		s1.add(new Student(123,"Kamesh",45));
		
		System.out.println("Set Elements");
		for(Object o:s1)
		{
			System.out.println(o);
		}
		
	}

}
