//Created by Ivy Guan on November 8, 2017

public class copyArrays {

	public static void main(String[] args)
	{
		int[] intArray = new int[10];
		
		for(int i = 0; i < intArray.length; i++)
		{
			intArray[i] = (int)(Math.random()* 10);
		}
		
		int[] copy = copyArray(intArray);
		
		//copy[copy.length-1] = -7; makes the last digit in the new array -7
		//copy[copy.length-1] = -7; just indicates that it is a copy not the actual array
		
		System.out.println("Array 1: ");
		printArray(intArray);
		
		System.out.println("Copy of Array 1: ");
		printArray(copy);
	}
	
	public static int[] copyArray(int[] intArray)
	{
		int[] copy = new int[intArray.length];
		for(int i = 0; i < intArray.length; i++)
		{
			copy[i] = intArray[i];
		}
		return copy;
	}
	
	public static void printArray(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("["+ arr[i]+"] ");
		}
		System.out.println();
	}
}
