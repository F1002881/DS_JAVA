import java.util.*;
import java.io.*;

public class RemDupsSort {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("2nd/Quizzes/Duplicate Letters Quiz/duplicate.dat"));
        int numLines = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < numLines; i++)
        {
            String line = scan.nextLine();
            TreeSet<Character> letterSet = new TreeSet<Character>();
            for(int x = 0; x < line.length(); x++)
            {
                char letter = line.charAt(x);
                if(letter.equals(' ') == false)
                {
                    letterSet.add(letter);
                }
            }

            for(char letter : letterSet)
            {
                System.out.print(letter);
            }
            System.out.println("");
        }
    }
}
