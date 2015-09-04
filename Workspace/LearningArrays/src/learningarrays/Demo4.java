package learningarrays;

import java.util.ArrayList;
import java.util.List;

public class Demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arr = new ArrayList<String>();
		arr.add("oslo");
		arr.add("Rome");
		arr.add("Paris");
		
		System.out.println(arr);
		
		System.out.println(arr.indexOf("Paris"));
		arr.add(2, "London");
		
		System.out.println(arr);
		
		arr.clear();
	
		//System.out.println("My list "+arr);
		arr.add("Bengaluru");
		arr.add("Mysuru");
		arr.add("Belagavi");
		
		System.out.println(arr);
		
		System.out.println(arr.contains("Bengaluru")+" "+arr.contains("Nanjangud"));
		System.out.println("ArrayList Size "+arr.size());
		System.out.println("Index of Bengaluru "+arr.indexOf("Bengaluru"));
	}
}