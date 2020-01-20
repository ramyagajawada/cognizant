package emp;

public class Circle extends Shape{
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", shapeName=" + shapeName + ", shapeId=" + shapeId + "]";
	}



	double radius;
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	

	public Circle(String shapeName, int shapeId, double radius) {
		super(shapeName, shapeId);
		this.radius = radius;
	}
	double Area()
	{
		return 3.14*radius*radius;
	}

	
}
