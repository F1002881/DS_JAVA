//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Axel Fontaine

//ArrayList of ints
//or
//array of ints

import java.util.ArrayList;
import static java.lang.System.*;

public class IntQueue
{
	//option 2
	private ArrayList<Integer> listOfInts;

	public IntQueue()
	{
		listOfInts = new ArrayList<Integer>();
	}

	public void add(int item)
	{
		listOfInts.add(item);
	}

	public int remove()
	{
		return listOfInts.remove(0);
	}

	public boolean isEmpty()
	{
		if(listOfInts.size() > 0)
		{
			return false;
		}
		return true;
	}

	public int peek()
	{
		return listOfInts.get(0);
	}

	public String toString()
	{
		return "";
	}
}