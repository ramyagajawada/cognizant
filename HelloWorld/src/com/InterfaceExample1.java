package com;
class AirAutomobile implements Fly

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
	public int fly(int a) {
		// TODO Auto-generated method stub
		return 0;
	}
}	
	interface Fly
	{
		int maxspeed=13;//constants must be initialized coz it is public static anmd final
		int fly(int a);
	}

public class InterfaceExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirAutomobile aa=new AirAutomobile ();
		aa.setModelNo("airbus123");
		System.out.println("aero no"+aa.show());
		System.out.println(aa.fly(90));
		System.out.println("max speed"+Fly.maxspeed);
	}

}
