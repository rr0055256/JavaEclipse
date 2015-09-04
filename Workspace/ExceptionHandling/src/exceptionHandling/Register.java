package exceptionHandling;

public class Register {
	boolean register(int age) throws AgeNotAllowed
	{
		if(age>=18)
		{
			return true;
		}
		else
		{
			AgeNotAllowed ab=new AgeNotAllowed();
			ab.ageEntered();
			return false;
		}
			
	}
}
