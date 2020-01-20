package com;
abstract class AbstractClass
{
	abstract void add(int a,int b);
void show()
{
		System.out.println("abstractclass");
}
}
class AbstractImp1 extends AbstractClass
{

	@Override
	void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}

}
public class AbstractExample {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractImp1 a=new AbstractImp1();
			a.add(2, 5);
	}

}


