//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.Map;
import java.util.TreeMap;

public class Histogram
{
	private Map<String,Integer> histogram = new TreeMap<String,Integer>();

	public Histogram( String line )
	{
		for(int i = 0; i < line.length(); i++)
		{
			int count = 1;
			String initial = line.charAt(i) + "";
			if(initial.equals(" ") == false)
			{
				histogram.put(initial, count);
				for(int j = 0; j < line.length(); j++)
				{
					String selected = line.charAt(j) + "";
					if(selected.equals(initial))
						histogram.put(selected, count++);
				}
			}
		}
	}
	
	public int getValue( String s )
	{
		for(Map.Entry<String, Integer> character : histogram.entrySet())
		{
			if(character.getKey().equals(s))
				return character.getValue();
		}
		return 0;
	}

	public String toString()
	{
		String output = "char   1---5----01---5\n";
		for(Map.Entry<String, Integer> character : histogram.entrySet())
		{
			output += character.getKey() + "      ";
			for(int i = character.getValue(); i > 0; i--)
			{
				output += "*";
			}
			output += "\n";
		}
		return output + "\n\n";
	}
}