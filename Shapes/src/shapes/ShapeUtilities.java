package shapes;
import java.util.Random;

public class ShapeUtilities {
	
	//adds up the perimeter of all the shapes in the array
	public static double sumPerimeter(Shape[] shapeArr)
	{
		double sum = 0;
		for(int x = 0; x < shapeArr.length; x++)
		{
			sum = shapeArr[x].perimeter() + sum;
		}
		return sum;
	}
	
	//adds up the area of all the shapes in the array
	public static double sumArea(Shape[] shapeArr)
	{
		double sum = 0;
		for(int x = 0; x < shapeArr.length; x++)
		{
			sum = shapeArr[x].area() + sum;
		}
		return sum;
	}
	
	//Creates a random shape from the choices.
	public static Shape getRandomShape() 
	{
		Random rand = new Random();
		int x = rand.nextInt(100);
		switch(x)
		{
			case 0:
				return new Rectangle(rand.nextInt(100)+1,rand.nextInt(100)+1);
			case 1:
				return new Circle(rand.nextInt(100)+1);
			case 2:
				return new Square(rand.nextInt(50));
			default:
				return new Rectangle(rand.nextInt(100)+1,rand.nextInt(100)+1);
		}
	}
}


