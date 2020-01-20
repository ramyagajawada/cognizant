class StaticMethodExample
{
static int num;
int c;//instance variable
static void setStatic(int a)
{
num=a;
//System.out.println(num);
}
void setRef(int num)
{
System.out.println(num);
}
public static void main(String ar[])
{
setStatic(10);
StaticMethodExample e=new StaticMethodExample();

e.setRef(10);
}
}