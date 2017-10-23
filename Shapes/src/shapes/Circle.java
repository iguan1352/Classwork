package shapes;

public class Circle implements Shape{
		
		private double radius;
		private double pi = 3.14;
		
		public Circle(double radius)
		{
			this.radius = radius;
		}
		
		@Override
		public double perimeter()
		{
			return (2 * radius * pi);
		}
		
		@Override
		public double area()
		{
			return (radius * radius * pi);
		}
		
		@Override
		public String toString()
		{
			return "Circle Radius: " + radius + " Area: " + this.area() + " Perimeter: " + this.perimeter();
		}
}
