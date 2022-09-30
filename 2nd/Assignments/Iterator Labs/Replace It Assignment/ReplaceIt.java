import java.util.*;
import java.io.*;

public class ReplaceIt {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("2nd/Iterator Labs/Replace It Assignment/replaceIt.txt"));
        int numLines = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < numLines; i ++)
        {
            String line = scan.nextLine();
            String[] lineArr = line.split(" ");
            String letters = lineArr[0];
            String remLetter = lineArr[1];
            String repLetter = lineArr[2];
            ArrayList<String> letterList = new ArrayList<String>();
            for(int x = 0; x < letters.length(); x++)
            {
                letterList.add("" + letters.charAt(x));
            }

            ListIterator<String> it = letterList.listIterator();
            while(it.hasNext())
            {
                if(it.next().equals(remLetter))
                {
                    it.set(repLetter);
                }
            }
            System.out.println(letterList);
        }
    }
}
