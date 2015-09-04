package learningarrays;

import java.util.Scanner;
import java.util.Arrays;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instantiating Scanner
		Scanner sc1 = new Scanner(System.in);
		
		//asking the user to enter the size of the array in order to make the program dynamic
		System.out.println("Enter the size of the array");
		int size = sc1.nextInt();
		int[] arr1 = new int[size];
		
		//arr1[0] = 10;
		//arr1[1] = 20;
		//arr1[2] = 30;
		//arr1[3] = 40;
		//arr1[4] = 50;
		
		//array length
		System.out.println("Array length :"+arr1.length);
		
		
		
		//dynamic assignment of values
		System.out.println("Enter the values against each array");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i] = sc1.nextInt();
		}
		
		Arrays.sort(arr1);
		
		System.out.println("The list of sorted arrays are");
		//printing of elements using for loop
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
	}

}