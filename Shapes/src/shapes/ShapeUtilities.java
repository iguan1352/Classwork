package shapes;
import java.util.Random;

public class ShapeUtilities {
	public static double sumPerimeter(Shape[] shapeArr)
	{
		double sum = 0;
		for(int x = 0; x < shapeArr.length; x++)
		{
			sum = shapeArr[x].perimeter() + sum;
		}
		return sum;
	}
	
	public static double sumArea(Shape[] shapeArr)
	{
		double sum = 0;
		for(int x = 0; x < shapeArr.length; x++)
		{
			sum = shapeArr[x].area() + sum;
		}
		return sum;
	}
	
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
/*
 	public class ShapeUtilities {

	
	  Creates a random shape from the choices.
	 @return Shape Student Work: Update with your own shape.

	public static Shape randomShape() {
		Random rand = new Random();
		int x = rand.nextInt(3);

		switch (x) {
		case 0:
			return new Circle(rand.nextInt(100));
		case 1:
			return new Rectangle(rand.nextInt(50), rand.nextInt(50));
		case 2:
			return new Square(rand.nextInt(50));
		default:
			return new Circle(rand.nextInt(100));
		}

	}


	 adds up the area of all the shapes in the array
	
	@param shapes
	@return double

	public static double sumArea(Shape[] shapes) {
		// To be written by student
		return 0.0;
	}


	  adds up the perimeter of all the shapes in the array
	
	@param shapes
	 @return double
	
	public static double sumPerimeter(Shape[] shapes) {
		// To be written by student
		return 0.0;
	}

}*/

