package learningstrings;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method Started");
		String s1 = new String();
		s1 = "javadeveloper";
		System.out.println("The given string is :"+s1);
		System.out.println(s1.charAt(2));
		System.out.println(s1.endsWith("per"));
		System.out.println(s1.hashCode());
		System.out.println(s1.indexOf("dev"));
		System.out.println(s1.indexOf("a"));
		System.out.println(s1.indexOf("a", 3));
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.startsWith("java"));
		System.out.println(s1.endsWith("per"));
		System.out.println(s1.substring(1));
		System.out.println(s1.substring(1, 2));
		System.out.println(s1.split("dev",2));
		System.out.println("Main Method Ended");

	}

}
