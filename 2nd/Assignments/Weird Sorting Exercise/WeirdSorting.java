import java.util.*;
import java.io.*;

public class WeirdSorting {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("2nd/Assignments/Weird Sorting Exercise/weirdSort-1.dat"));
        int numLines = Integer.parseInt(scan.nextLine());
        String[] words = new String[numLines];
        for(int i = 0; i < numLines; i++)
        {
            words[i] = scan.nextLine();
        }

        for(int y = 1; y < numLines; y++)
        {
            for(int i = 0; i < numLines; i ++)
            {
                if(words[i-1].charAt(1) < words[i].charAt(1))
                {
                    String temp = words[i];
                    words[i] = words[i-1];
                    words[i-1] = temp;
                }
                else if(words[i-1].charAt(1) == words[i].charAt(1))
                {
                    if(words[i-1].charAt(3) < words[i].charAt(3))
                    {
                        String temp = words[i];
                        words[i] = words[i-1];
                        words[i-1] = temp; 
                    }
                }  
            }
        }

        for(String word : words)
        {
            System.out.println(word);
        }
    }
}
