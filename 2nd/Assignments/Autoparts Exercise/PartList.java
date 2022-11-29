//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Axel Fontaine

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class PartList {
	private TreeMap<Part, Integer> partsMap;

	public PartList() {
	}

	public PartList(String fileName) {
		this();
		partsMap = new TreeMap<Part, Integer>();
		try {
			Scanner file = new Scanner(new File(fileName));
			// add code here to read from the file
			// and add Parts to the map
			partsMap.put(new Part(file.nextLine()), 1);
			while (file.hasNextLine()) {
				String line = file.nextLine();
				Part p = new Part(line);
				if (!partsMap.containsKey(p)) {
					partsMap.put(p, 1);
				} else {
					partsMap.put(p, partsMap.get(p) + 1);
				}
			}

		} catch (IOException e) // Most specific exceptions must be listed 1st
		{
			out.println(e);
		} catch (RuntimeException e) {
			out.println(e);
		} catch (Exception e) {
			out.println(e);
		} finally {
			// no code needed here
		}
	}

	public String toString() {
		String output = "";
		for (Part key : partsMap.keySet()) {
			output += key + " - " + partsMap.get(key);
			output += "\n";
		}
		return output;
	}
}