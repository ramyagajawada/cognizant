package emp;

public class Shape {
	
		String shapeName;
		int shapeId;
		
		@Override
		public String toString() {
			return "Shape [shapeName=" + shapeName + ", shapeId=" + shapeId + "]";
		}
		
		public Shape(String shapeName, int shapeId) {
			super();
			this.shapeName = shapeName;
			this.shapeId = shapeId;
		}
		
		public String getShapeName() {
			return shapeName;
		}
		public void setShapeName(String shapeName) {
			this.shapeName = shapeName;
		}
		public int getShapeId() {
			return shapeId;
		}
		public void setShapeId(int shapeId) {
			this.shapeId = shapeId;
		}
		
	

}
