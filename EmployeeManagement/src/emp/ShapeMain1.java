package emp;

public class ShapeMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle r=new Rectangle("rectangle", 56, 3, 3);
System.out.println(r.Area());
Square s=new Square("square", 5, 5, 3);
System.out.println(s.Area());
Circle c = new Circle("circle", 2,5);
System.out.println(c.Area());
System.out.println(r);
System.out.println(s);
System.out.println(c);

	}

}
