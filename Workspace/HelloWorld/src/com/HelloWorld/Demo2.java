package com.HelloWorld;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Program started");
		int[] bs = new int[] {1,2,8,9,6,4,7,5,3,10};
		
		//System.out.println(bs.length);
		int i =0,y=0;
		while(i<bs.length)
		{
			System.out.println("Inside the while loop");
			if((i+1)<bs.length && bs[i]>bs[i+1])
			{
				y=bs[i];
				bs[i]=bs[i+1];
				bs[i+1]=y;
			}
			i++;
			continue;
		}
		
		
		for(i=0;i<bs.length;i++)
		{
			System.out.println(bs[i]);
		}
		
		System.out.println("Program ended");
	}

}