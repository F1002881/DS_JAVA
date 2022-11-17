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
			if(initial != " ")
			{
				histogram.put(initial, count);
				for(int j = 0; j < line.length(); j++)
				{
					String selected = line.charAt(j) + "";
					if(selected == initial)
						histogram.put(selected, count++);
				}
			}
		}
	}
	
	public int getValue( String s )
	{
		return 0;
	}

	public String toString()
	{
		for(Map.Entry<String, Integer> character : histogram.entrySet())
		{
			
		}
		return null;
	}
}