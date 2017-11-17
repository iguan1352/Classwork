
public class Mustang implements Horse{
	private int num;
	private String name;
	
	public Mustang(String name, int num)
	{
		this.name = name;
		this.num = num;
	}

	@Override
	public String getName() 
	{
		return name;
	}
	
	public int getWeight()
	{
		return num;
	}
}
