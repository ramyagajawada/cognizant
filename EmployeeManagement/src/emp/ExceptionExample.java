package emp;

import java.io.IOException;

public class ExceptionExample {
	
	public static void main(String ar[])
	{
	int a=5,b=0;
	try{
		System.out.println(a/b);
	new ArithmeticException();
	}
	catch(ArithmeticException e){
		System.out.println(e.getMessage());
	}
	finally
	{
		System.out.println("finally executes always");
	}
	System.out.println("nhgdhnedb");
	}

}
