package access1;
interface Person
{
	 void eat();

}
public class AnonymousInnerClassExample {
public static void main(String ar[])
{
	Person p=new Person()
			{
		public void eat()
		{
			System.out.println("nice fruits");
		}
			};
			p.eat();
}

}
