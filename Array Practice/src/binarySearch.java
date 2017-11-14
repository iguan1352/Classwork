
public class binarySearch {

	public static void main(String[] args)
	{	
		int[] test1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] test2 = {0, 4, 5, 6, 12, 15, 17, 23, 29};
		
		System.out.println(BinarySearch(test1, 3, 0, test1.length));
		System.out.println(BinarySearch(test2, 23, 0, test2.length));
		System.out.println(BinarySearch(test1, 1, 0, test1.length));
		System.out.println(BinarySearch(test2, 25, 0, test2.length));
	}

	public static int BinarySearch(int[] nums, int query, int first, int last)
	{
		if(last >= first)
		{
			int index = (first+last)/2;
			int guess = nums[index];
			
			if(guess == query)
			{
				return index;
			}
			if(guess > query)
			{
				return BinarySearch(nums, query, first, index-1);
			}
			return BinarySearch(nums, query,index+1, last);
		}
		return -1;
	}
}
