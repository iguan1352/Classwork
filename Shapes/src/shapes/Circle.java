package shapes;

public class Circle implements Shape{
		private double radius;
		private double pi = 3.14;
		public Circle(double radius)
		{
			this.radius = radius;
		}
		public double perimeter()
		{
			return (2 * radius * pi);
		}
		public double area()
		{
			return (radius * radius * pi);
		}
}
/*public Circle(int radius) {
	// to be implemented by student
}

@Override
public double calculateArea() {
	// to be implemented by student
	return 0.0;
}

@Override
public double calculatePerimeter() {
	// to be implemented by student
	return 0.9;
}

@Override
public String toString() {
	// to be implemented by student
	return "";
}*/