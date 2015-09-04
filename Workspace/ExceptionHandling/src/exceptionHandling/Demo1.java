package exceptionHandling;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		System.out.println("Program Started");
		Sample1 s1 = new Sample1();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the value of numerator");
		Integer num = sc1.nextInt();
		System.out.println("Enter the value of denominator");
		Integer den = sc1.nextInt();
		try{
		Integer result = s1.disp(num, den);
		}
		catch(ArithmeticException e)
		{
			System.out.println("A number cannot be divided by zero,"+"please check the value entered against denominator");
		}
		/*if(result==0)
		{
			System.out.println("Any number divided by zero is indeterminate");
		}
		else
		{
			System.out.println("The value of result is "+result);
		}*/
		System.out.println("Program Ended");
	}
}
