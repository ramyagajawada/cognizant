package emp;

public class CustomException extends Exception{
	CustomException(String s){
		super(s);	
	}

	 static class Test
	{
		static void msg(int age) throws CustomException
		{
			if(age<18)
				throw new  CustomException("not valid");
			else{
				System.out.println("valid");
		}
		}
public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	msg(60);
}
catch(Exception e)
{
	System.out.println("error occured"+e);
}
}
}
}

	


