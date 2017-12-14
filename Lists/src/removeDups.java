import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class removeDups {
	public static void main(String[] args)
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 2, 2, 2, 3, 1, 1, 0, 9, 3, 2));
		removeDuplicates(list1);
		System.out.println(list1);
	}
	
	public static void removeDuplicates(List<Integer> nums)
	{
		Collections.sort(nums);
		boolean remove = false;
		while(!remove)
		{
			for(int i = 0; i < nums.size()-1; i++)
			{
				int numDups = 0;
				if(nums.get(i) == nums.get(i+1))
				{
					nums.remove(i);
					numDups++;
				}
				for(int j = 0; j < nums.size()-1; j++)
				{
					if(nums.get(j) == nums.get(j+1))
					{
						nums.remove(j);
						numDups++;
					}
				}
				if(numDups == 0)
				{
					remove = true;
				}
			}
		}
	}
}
