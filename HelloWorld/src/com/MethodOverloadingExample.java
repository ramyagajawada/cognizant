package com;
class Addition
{
	int add(int a,int b)
	{
		return a+b;
	}
	double add(double a,int b)
	{
		return a+b;
	
	}
	double add(double a,double b)
	{
		return a+b;
	}
	
}

public class MethodOverloadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Addition a=new Addition();
System.out.println(a.add(10,10));
System.out.println(a.add(10.5,4));
System.out.println(a.add(3.4, 3.1));
	}

}
