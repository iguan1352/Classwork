package shapes;

public class Parallelogram extends Rectangle {

	double base;
	double height;
	double side;

	public Parallelogram(double base,double height,double side) 
	{
		super(base, height);
		this.base = base;
		this.height = height;
		this.side = side;
	}

	@Override
	public double perimeter()
	{
		return (side*2 + base*2);
	}
	
	@Override
	public double area()
	{
		return(base * height);
	}
	
	@Override
	public String toString() 
	{
		return "Parallelogram Base: " + base + " Parallelogram Height: " + height + " Parallelogram Side: " + side + 
				" Area: " + this.area() + " Perimeter: " + this.perimeter();
	}


}
