//(c) A+ Computer Science
//www.apluscompsci.com
import java.util.Scanner;
import java.io.*;

public class HistogramRunner {
	public static void main( String args[] ) throws IOException{
		Scanner scan = new Scanner(new File("2nd/Assignments/Histogram Exercise/histogram.dat"));
		while(scan.hasNextLine())
		{
			String line = scan.nextLine();
			if(line != null)
			{
				Histogram lineHist = new Histogram(line);
				System.out.print(lineHist);
			}
		}
	}
}