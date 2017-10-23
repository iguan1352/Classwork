package shapes;

public class Triangle implements Shape{
	
	private double height;
	private double base;
	private double side1;
	private double side2;
	
	public Triangle(double height,double base,double side1,double side2)
	{
		this.height = height;
		this.base = base;
		this.side1 = side1;
		this.side2 = side2;
	}
	
	@Override
	public double perimeter()
	{
		return (side1 + side2 + base);
	}
	
	@Override
	public double area()
	{
		return (0.5 * height * base);
	}
	
	@Override
	public String toString()
	{
		return "Triangle Side1: " + side1 + " Triangle Side2: " + side2 + " Triangle Base: " + base + " Triangle Height: " + height + 
				" Area: " + this.area() + " Perimeter: " + this.perimeter();
	}

}
