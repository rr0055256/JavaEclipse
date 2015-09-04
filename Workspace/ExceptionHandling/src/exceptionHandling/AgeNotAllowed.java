package exceptionHandling;

public class AgeNotAllowed extends Throwable{
	void ageEntered()
	{
		System.out.println("Age cannot be less than 18 years");
	}
}
