//(c) A+ Computer Science
//www.apluscompsci.com
import java.util.Scanner;
import java.io.*;

public class HistogramRunner {
	public static void main( String args[] ) throws IOException{
		Scanner scan = new Scanner(new File("2nd/Assignments/Histogram Exercise/histogram.dat"));
		while(scan.hasNext() )
		{
			String line = scan.next();
			if(line != null)
			{
				Histogram lineHist = new Histogram(line);
				System.out.println(lineHist);
			}
		}
	}
}