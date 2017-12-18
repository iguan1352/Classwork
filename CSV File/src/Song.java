
public class Song {
	private String name;
	private String artist;
	
	public Song(String name, String artist)
	{
		this.name = name;
		this.artist = artist;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getArtist()
	{
		return artist;
	}
	
	public String toString()
	{
		return "Song Name: " + name + ",   Artist Name: " + artist;
	}
}
