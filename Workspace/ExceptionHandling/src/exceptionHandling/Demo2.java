package exceptionHandling;
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		System.out.println("Program Started");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the age ");
		int age = sc1.nextInt();
		//AgeNotAllowed a = new AgeNotAllowed();
		Register r = new Register();
		try{
			//if(age>=18){
				//a.ageEntered(age);
				boolean resp = r.register(age);
				if(resp==true)
				System.out.println("Registered");
				
			}
		catch(AgeNotAllowed a){
			System.out.println("Age cannot be less than 18 years");
		}
		finally{
			System.out.println("This is finally block of Java which I learnt today");
		}
		System.out.println("Program Ended");
	}
}
