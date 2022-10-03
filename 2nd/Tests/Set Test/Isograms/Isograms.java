import java.util.*;
import java.io.*;

public class Isograms {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("2nd/Tests/Set Test/Isograms/Isogram.txt"));
        int numLines = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < numLines; i++)
        {
            String line = scan.nextLine();
            TreeSet<Character> letterSet = new TreeSet<Character>();
            for(int x = 0; x < line.length(); x++)
            {
                letterSet.add(line.charAt(x));
            }
            if(letterSet.size() == line.length())
            {
                System.out.println("isogram");
            }
            else{
                System.out.println("not isogram");
            }
        }
    }
}
