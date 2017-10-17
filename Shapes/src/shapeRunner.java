
public class shapeRunner {
	public static void main(String [] args)
	{
		rectangle rect1 = new Rectangle(5,3);
		circle cir1 = new Circle(3);
		
		if(rect1.perimeter() > cir1.perimeter())
			System.out.println("Larger Perimeter: Rectangle");
		else
			System.out.println("Larger Perimeter: Circle");
		
		if(rect1.area() > cir1.area())
			System.out.println("Larger Area: Rectangle");
		else
			System.out.println("Larger Area: Circle");
	}
}
