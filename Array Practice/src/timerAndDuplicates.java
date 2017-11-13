
public class timerAndDuplicates {

	public static void main(String[] args) 
	{
		int[] test1 = {1, 4, 4, 5, 2, 4, 2, 5};
		int[] test2 = {34, 2, 7, 7, 7};
		int[] test3 = {};
		
		long startTime = System.nanoTime(); //record start time
		System.out.println(countUnique(test1)); //Should print 4
		long endTime = System.nanoTime(); //record stop time
		long totalTime = endTime - startTime; //calculate total time
		System.out.println("Time taken in nanoseconds: " + totalTime);
		
		System.out.println(countUnique(test2)); //should print 3
		System.out.println(countUnique(test3)); //should print 0
	}
	
	public static int countUnique(int[] numbers) 
	{
		int count = 0;
		
		for(int i = 0; i < numbers.length; i++)
		{
			//Assume the number is unique at first
			boolean unique = true;
			
			//check all the subsequent numbers
			for(int j = i + 1; j <  numbers.length; j++)
			{
				if(numbers[i] == numbers[j])
				{
					unique = false; //if we found an equivalent
					break;
				}
			}
			
			if(unique)
			{
				count++;
			}
		}
		return count;
	}

}
