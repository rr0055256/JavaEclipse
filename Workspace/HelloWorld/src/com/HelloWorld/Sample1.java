package com.HelloWorld;

public class Sample1 extends Sample {
	public static void main(String[] args) {
		System.out.println("Program Started");
		try{
			System.out.println("Executing outer try block");	
			try{
				int i=12;
				int j=2;
				j=i/0;
				System.out.println("j value is "+j);
			}
			catch(ArithmeticException e)
			{
				System.out.println("A number cannot be divided by ZERO");
			}
			Sample1 s1 = (Sample1)new Sample();
			s1.amma();
		}
		catch(ClassCastException e)
		{
			System.out.println("Sample cannot be casted to Sample1 as Sample1 does not contain properties of Sample");
		}
		System.out.println("Program Ended");
	}

}
