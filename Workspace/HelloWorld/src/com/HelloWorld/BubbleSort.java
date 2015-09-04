package com.HelloWorld;

public class BubbleSort {
	//public static int y=0;
	public static void main(String[] args) {
		System.out.println("Program started");
		int[] x = new int[10];
		int y=0;
		
		x[0] = 1;
		x[1] = 2;
		x[2] = 10;
		x[3] = 8;
		x[4] = 7;
		x[5] = 6;
		x[6] = 4;
		x[7] = 3;
		x[8] = 9;
		x[9] = 5;
		
		int count =0 ;
		
		System.out.println("The elements of the array before sorting are");
		
		for(int k=0;k<x.length;k++)
		{
			System.out.println(x[k]);
		}
		
		
		System.out.println("Size of the array is "+x.length);
		int j=0;
		for(int i=0;i<x.length;i++)
		{
			for(j=0;j<x.length;j++)
			{
				count++;
				if(i+j == x.length)
					break;
				if((i+j)<x.length & x[i]<x[i+j])
				{
					y=x[i+j];
					x[i+j]=x[i];
					x[i]=y;
					//break;
				}
				
			}
			if(x[x.length-1]==10 && x[x.length-x.length]==1)
				break;
		}
		System.out.println("The elements of the array after sorting are");
		
		for(int k=0;k<x.length;k++)
		{
			System.out.println(x[k]);
		}
		
		System.out.println("Number of iterations - "+count);
		System.out.println("Program ended");
		
	}

}