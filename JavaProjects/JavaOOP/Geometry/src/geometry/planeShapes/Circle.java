package geometry.planeShapes;

public class Circle extends PlaneShape {
	
	private double radius;
	
	public Circle(double col, double row, double radius) {
		super(new PlaneVertex[] {new PlaneVertex(col, row)});
		this.setRadius(radius);
	}
	
	public double getCol() {
		return super.vertices.get(0).getCol();
	}	
	public double getRow() {
		return super.vertices.get(0).getRow();
	}	
	public double getRadius() {
		return this.radius;
	}	
	public void setRadius(double radius) {
		if (radius < 0)
			throw new IllegalArgumentException("The radius of a circle cannot be negative!");
		
		this.radius = radius;
	}
	
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}	
	
	@Override
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
	
	@Override
	public String toString() {
		return String.format("Circle - radius: %.2f, center: %.2f, %.2f",
				this.getRadius(), this.getCol(), this.getRow());
	}
}
