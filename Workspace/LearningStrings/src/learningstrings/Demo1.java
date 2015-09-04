package learningstrings;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Main Method started");
			String s1 = new String("Udemy");
			String s2 = new String("Udemy");
			
			
			String s3 = "udemy";
			String s4 = "udemy";
			
			System.out.println("s1==s2 :"+(s1==s2));
			System.out.println("s3==s4 :"+(s3==s4));
			
			System.out.println("s1.equals(s2) :"+s1.equals(s2));
			System.out.println("s3.equals(s4) :"+s3.equals(s4));
			
			System.out.println("Main Method ended");
	}

}
