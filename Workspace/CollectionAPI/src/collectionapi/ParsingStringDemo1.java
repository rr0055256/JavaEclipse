package collectionapi;

public class ParsingStringDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("********************");
		String str1 = "1231";
		String str2 = "123.54";
		
		int x = Integer.parseInt(str1);
		double y = Double.parseDouble(str2);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println("********************");
		
	}

}
