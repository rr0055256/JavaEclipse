package exceptionHandling;

public class Sample1 {
	public Integer disp(Integer num,Integer den) throws ArithmeticException
	{
		Integer res=0;
		//try{
		res = num/den;
		return res;
		/*}
		catch(ArithmeticException e)
		{
			System.out.println("A number cannot be divided by zero,"+"please check the value entered against denominator");
			System.out.println("Error is "+e.getMessage());
			return res;
		}*/
	}
}
