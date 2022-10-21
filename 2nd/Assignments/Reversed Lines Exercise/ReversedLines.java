import java.util.*;
import java.io.*;

public class ReversedLines {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("2nd/Assignments/Reversed Lines Exercise/reverseLines.txt"));
        int numLines = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < numLines; i++)
        {
            String line = scan.nextLine();
            String revLine = "";
            for(int x = line.length() - 1; x >= 0; x--)
            {
                revLine += line.charAt(x); 
            }
            System.out.println(revLine);
        }
    }
}
