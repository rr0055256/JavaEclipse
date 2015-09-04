package collectionapi;

public class HashCodeDemo1 {
	public static void main(String[] args) {
		Student1 st1 = new Student1(32873,"Ramesh");
		
		Student1 st2 = new Student1(32875,"Suresh");
		
		System.out.println(st1);
		System.out.println(st2);
		
		//printing hashcodes
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		
		boolean result = st1.equals(st2);
		System.out.println(result);
	}
}
