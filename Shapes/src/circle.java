
public class circle {
	public class Circle implements shape
	{
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
}


