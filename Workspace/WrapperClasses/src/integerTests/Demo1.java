package integerTests;

public class Demo1 {

	public static void main(String[] args) {
		Integer[] x = new Integer[10];
		
		x[0] = 10;
		x[1] = 11;
		x[2] = 12;
		x[3] = 13;
		x[4] = 14;
		x[5] = 15;
		x[6] = 16;
		x[7] = 17;
		x[8] = 18;
		
		for(int i=0;i<10;i++)
		{
			System.out.println("x["+i+"] = "+x[i]);
		}
	}

}
