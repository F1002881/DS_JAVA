import java.util.*;
import java.io.*;

public class commonFirstLetters {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("2nd/Tests/Set Test/Common First Letters/commonFirstLetters.txt"));
        int numLines = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < numLines; i++)
        {
            String line = scan.nextLine().toLowerCase();
            String[] wordArr = line.split(" ");
            HashSet<Character> firstLetters = new HashSet<Character>();
            for(String word1 : wordArr)
            {
                HashMap<Character, Integer> letterCountMap = new HashMap<Character, Integer>();
                int count = 0;
                char firstLetter1 = word1.charAt(0);
                for(String word2: wordArr)
                {
                    char firstLetter2 = word2.charAt(0);
                    if(firstLetter1 == firstLetter2)
                    {
                        count++;
                    }
                }
                letterCountMap.put(firstLetter1, count);

                for (Map.Entry<Character, Integer> entry : letterCountMap.entrySet()) {
                    if(entry.getValue() >= 2)
                    {
                        firstLetters.add(entry.getKey());
                    }
                }
            }
            System.out.println(firstLetters);
        }
    }
}
