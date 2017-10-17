import java.util.Random;
public class shapeUtilities {
	public static double sumPerimeter(shape[] shapeArr)
	{
		double sum = 0;
		for(int x = 0; x < shapeArr.length; x++)
		{
			sum = shapeArr[x].perimeter() + sum;
		}
		return sum;
	}
	
	public static double sumArea(shape[] shapeArr)
	{
		double sum = 0;
		for(int x = 0; x < shapeArr.length; x++)
		{
			sum = shapeArr.area() + sum;
		}
		return sum;
	}
	
	public static shape getRandomShape() 
	{
		Random r = new Random();
		int x = r.nextInt(100);
		switch(x)
		{
			case 0:
				return new rectangle(r.nextInt(100)+1,r.nextInt(100)+1);
			case 1:
				return new Circle(r.nextInt(100)+1);
			default:
				return new rectangle(r.nextInt(100)+1,r.nextInt(100)+1)
		}
	}
}

