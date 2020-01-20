package emp;
class Car
{
	int carNum;
	int run()
	{
		return 60;
		
	}
}
class FordCar extends Car
{
	int run()
	{
		return super.run()+40;
	}
}
public class AutoMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FordCar fd=new FordCar();
System.out.println(fd.run());
	}

}
