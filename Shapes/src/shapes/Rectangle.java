package shapes;

public class Rectangle implements Shape{
		private double length;
		private double width;
		
		public Rectangle(double length,double width)
		{
			this.length = length;
			this.width = width;
		}
		
		public double perimeter()
		{
			return (length*2 + width*2);
		}
		
		public double area()
		{
			return(length * width);
		}
		
		@Override
		public String toString() 
		{
			return "Rectangle Width: " + width + " Length: " + length + " Area: " + this.area() + " Perimeter: " + this.perimeter();
		}
		
}
/* public class Rectangle implements Shape {

private int length;
private int width;

public Rectangle(int length, int width) {
	this.length = length;
	this.width = width;
}


public double calculateArea() {
	// To be written by student
	return 0.0;
}


public double calculatePerimeter() {
	// To be written by student
	return 0.0;
}


public String toString() {
	return "Rectangle Width: " + width + " Length: " + length + " Area: " + this.calculateArea() + " Perimeter: "
			+ this.calculatePerimeter();
}
}*/