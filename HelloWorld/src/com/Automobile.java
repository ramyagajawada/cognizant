package com;

class Train extends Automobile implements Runnable
{
	String modelno;
	void setModelNo(String modelno)
	{
		this.modelno=modelno;
	}
	String show()
	{
		return modelno;
	}
	@Override
	public int runnable(int a) {
		// TODO Auto-generated method stub
		return 1;
	}
	
	}
	interface Runnable
	{
		int maxspeed=13;//constants must be initialized coz it is public static anmd final
		int runnable(int a);
	}
class Ship extends Automobile implements Swimmable
{
	String modelno;
	void setModelNo(String modelno)
	{
		this.modelno=modelno;
	}
	String show()
	{
		return modelno;
	}
	@Override
	public int swimmable(int a) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
interface Swimmable
{
	int speed=20;
	int swimmable(int a);
}
public class Automobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Train t=new Train();
		t.setModelNo("earthtrain123");
		System.out.println("train no"+t.show());
		System.out.println(t.runnable(90));
		System.out.println("max speed"+Runnable.maxspeed);
		Ship s=new Ship();
		s.setModelNo("watership123");
		System.out.println("ship no"+s.show());
		System.out.println(s.swimmable(90));
		System.out.println("max speed"+Swimmable.speed);
		
	}

}


	

