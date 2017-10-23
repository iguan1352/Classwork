package shapes;

public class ShapeRunner {
	
	public static void main(String [] args)
	{
		Shape rectangle1 = new Rectangle(10,4);
		Shape circle1 = new Circle(3);
		Shape triangle1 = new Triangle(4,2,3,3);
		Shape square1 = new Square(10);
		Shape parallelogram1 = new Parallelogram(10,5,7);
		
		System.out.println("First test out the hard coded shape array.\n\n");
		Shape[] shapeArr = { circle1, rectangle1, square1,parallelogram1,triangle1 };

			
		for (Shape shape : shapeArr) {
			System.out.println(shape);
		}
		System.out.println("\nDid the three shapes above add up to the total printed here?\n");
		System.out.println("Total Area: " + ShapeUtilities.sumArea(shapeArr)); // 168.26
		System.out.println("Total Perimeter: " + ShapeUtilities.sumPerimeter(shapeArr)); // 86.84
		System.out.println("\nDid the three shapes above add up to the total printed here?\n");

		System.out.println("\n\n Now testing the random array.\n");

		shapeArr = new Shape[10];

		// Why are we using a for loop instead of a for-each loop here?
		for (int i = 0; i < shapeArr.length; i++) {
			shapeArr[i] = ShapeUtilities.getRandomShape();
		}

		for (Shape shape : shapeArr) {
			System.out.println(shape);
		}

		System.out.println("\nTotal Area: " + ShapeUtilities.sumArea(shapeArr));
		System.out.println("Total Perimeter: " + ShapeUtilities.sumPerimeter(shapeArr));

	}

}
