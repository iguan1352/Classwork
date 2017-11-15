
public class BinarySearch2 {

	public static void main(String[] args)
	{	
		int[] test1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] test2 = {1, 2, 3, 4, 5, 6, 7, 8};
		
		for(int i = -1; i < test1.length+1; i++)
		{
			System.out.println(BinarySearch(test1, i, 0, test1.length));
		}
		System.out.println();
		for(int i = -1; i < test2.length+1; i++)
		{
			System.out.println(BinarySearch(test2, i, 0, test2.length));
		}
		System.out.println();
	}

	public static int BinarySearch(int[] nums, int query, int first, int last)
	{
		if(last > first)
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
