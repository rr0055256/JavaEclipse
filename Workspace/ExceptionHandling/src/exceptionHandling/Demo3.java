package exceptionHandling;

import java.io.IOException;

//import java.lang.Exception;
public class Demo3 {

	/**	
	 * @param args
	 */
	public static void main(String[] args){
		// TODO Auto-generated method stub
		try{
			doSomething();
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
	static void doSomething()throws IOException{
		if(Math.random()>0.5)
		{
			throw new IOException();
		}
		throw new RuntimeException();
	}

}
