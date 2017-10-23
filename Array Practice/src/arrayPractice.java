
public class arrayPractice {
	
	public static void main(String[] args)
	{
		String foo = "foo";
		String foofoo = doubled(foo);
		
		System.out.println(foo);
		System.out.println(foofoo);
	}
	
	public static String doubled(String str1)
	{
		str1 = str1 + str1;
		return str1;
	}
}

