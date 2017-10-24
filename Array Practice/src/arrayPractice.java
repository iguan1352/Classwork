
public class arrayPractice {
	
	public static void main(String[] args)
	{
		/*String foo = "foo";
		String foofoo = doubled(foo);
		
		System.out.println(foo);
		System.out.println(foofoo); */
		
		String[] flavors = new String[2];
		flavors[0] = "chocolate";
		flavors[1] = "vanilla";
		
		//doubledArray(flavors);
		
		//System.out.println(flavors[0]);
		
		printArr(doubledArray(flavors));
	
	}
	
	public static String doubled(String str1)
	{
		str1 = str1 + str1;
		return str1;
	}
	
	public static String[] doubledArray(String[] arr1)
	{
		for(int x = 0;x < arr1.length;x++)
		{
			arr1[x] = doubled(arr1[x]);
		}
		
		/*for(int x : arr1)
		{
			arr1[x] = doubled(arr1[x]);
		}*/
		return arr1;
	}
	
	private static void printArr(Object[] arr1)
	{
		for(Object x : arr1)
		{
			System.out.println(x);
		}
	}
}

