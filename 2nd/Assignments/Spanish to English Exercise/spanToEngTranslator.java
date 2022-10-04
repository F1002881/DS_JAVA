import java.util.*;
import java.io.*;

public class spanToEngTranslator {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("2nd/Assignments/Spanish to English Exercise/sptoen.txt"));
        HashMap<String,String> dictionary = new HashMap<String,String>();
        while(scan.hasNext())
        {
            String line = scan.nextLine();
            if(!line.substring(line.indexOf(" ") + 1).contains(" "))
            {
                String spanWord = line.substring(0, line.indexOf(" "));
                String engWord = line.substring(line.indexOf(" ") + 1);
                dictionary.put(spanWord, engWord);
            }
            else
            {
                String[] wordArr = line.split(" ");
                for(String word: wordArr)
                {
                    System.out.print(dictionary.get(word) + " ");
                }
                System.out.println(" ");
            }
        }
    }
}
