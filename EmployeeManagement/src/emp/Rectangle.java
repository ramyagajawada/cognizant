package emp;

public class Rectangle extends Shape {
	
	int length;
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", shapeName=" + shapeName + ", shapeId=" + shapeId
				+ "]";
	}




	int width;
	



	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	
	
	public Rectangle(String shapeName, int shapeId, int length, int width) {
		super(shapeName, shapeId);
		this.length = length;
		this.width = width;
	}




	double Area() {
		// TODO Auto-generated constructor stub
		return length*width;
	}
	
		
	}
	

