package learningarrays;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Multi Dimension array initialization
		int[][] arr1 = new int[3][];
		
		int[][][] arr2 = new int[][][]{
											{
												{10,20,30},{20,30,40},{40,50,60},{60,70,80}
											},
											{
												{2,3,4},{3,4,5},{4,5,6},{5,6,7}
											},
											{
												{4,5,6},{6,7,8},{8,9,10}
											}
									};
		
		//arr2[0] = 10;
		//arr2[1] = 20;
		//arr2[2] = 30;
		
		try{
		System.out.println(arr2[2][0][0]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		//System.out.println(arr1[0][0]);
	
	}

}
