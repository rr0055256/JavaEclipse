package com.HelloWorld;

public class Sample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AnotherSampleClass asc = new AnotherSampleClass();
		Sample2 s2 = new Sample2();
		s2=asc;
		System.out.println(s2.getClass());
		System.out.println(asc.getClass());
	}
}
class AnotherSampleClass extends Sample2{
	
}
