package learningarrays;

public class Demo2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = new int[] {10,20,30};
		
		int[] arr3 = new int[] {40,50,60};
		
		byte a=4;
		int[] arr4 = new int[] {'a','b',4};
		arr2=arr3;
		System.out.println("The values stored against the array are");
		
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr3[i]);
		}
		System.out.println("The values stored in the a array");
		for(int i=0;i<arr4.length;i++)
		{
			System.out.println(arr4[i]);
		}
		
	}
}
