//static block
class StaticBlock
{
static int a;
	static
	{
	a=10;
	System.out.println("static block"+a);
	}
	static void setA(int a)
	{
	a=5;
	System.out.println("static method"+a);
	}
	public static void main(String ar[])
	{
	System.out.println("ram");
	setA(10);
	}
}