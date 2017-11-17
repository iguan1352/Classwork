
public class HorseBarn {
	private Horse[] newArray;
	
	public HorseBarn(Horse[] newArray)
	{
		this.newArray = newArray;
	}
	
	public int findHorseSpace(String name)
	{
		for(int i = 0; i < newArray.length; i++)
		{
			if(newArray[i] != null && newArray[i].getName() ==  name)
			{
				return i;
			}
		}
		return -1;
	}
	
	public String toString()
	{
		String printArray = "";
		for(int i = 0; i < newArray.length; i++)
		{
			if(newArray[i] == null)
				printArray += "[null]";
			else
				printArray += "[" + newArray[i].getName() + "]";
		}
		return printArray;
	}
	
	public void consolidate()
	{
		Horse[] orgArray = new Horse[this.newArray.length];
		int frontArray = 0;
		for(int i = 0; i < this.newArray.length; i++)
		{
			if(this.newArray[i] != null)
			{
				orgArray[frontArray] = this.newArray[i];
				frontArray++;
			}
		}
		this.newArray = orgArray;
	}
}
