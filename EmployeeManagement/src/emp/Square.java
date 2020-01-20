package emp;

public class Square extends Shape{
	int length;
	int width;
	@Override
	public String toString() {
		return "Square [length=" + length + ", width=" + width + ", shapeName=" + shapeName + ", shapeId=" + shapeId
				+ "]";
	}
	
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
	
public Square (String shapeName, int shapeId, int length, int width) {
		super(shapeName, shapeId);
		this.length = length;
		this.width = width;
	}
double Area()
{
	return length*width;
}

}
