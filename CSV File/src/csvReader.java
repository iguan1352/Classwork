import java.io.BufferedReader; 
import java.io.IOException; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.Paths; 
import java.util.ArrayList; 
import java.util.List;

public class csvReader {
	
	public static void main(String[] args)
	{
		List<Song> songs = readSongsFromCSV("songlist.csv");
		
		for(Song i : songs)
		{
			System.out.println(i);
		}
	}
	
	private static List<Song> readSongsFromCSV(String fileName)
	{
		List<Song> songs = new ArrayList<>();
		Path pathToFile = Paths.get(fileName);
		
		try(BufferedReader file = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII))
		{
			String line = file.readLine();
			
			while(line != null)
			{
				String[] attributes = line.split(",");
				
				Song song = createSong(attributes);
				songs.add(song);
				
				line = file.readLine();
			}
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		return songs;
	}

	private static Song createSong(String[] metaData)
	{
		String name = metaData[0];
		String artist = metaData[1];
		
		return new Song(name, artist);
	}
	
}

