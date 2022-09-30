import java.util.*;
import java.io.*;

public class RemoveIt {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("2nd/Iterator Labs/Remove It Assignment/removeIt.txt"));
        int numLines = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < numLines; i++)
        {
            ArrayList<String> letterList = new ArrayList<String>();
            String line = scan.nextLine();
            String[] lineArr = line.split(" ");
            String remLetter = lineArr[1];
            String letters = lineArr[0];
            for(int x = 0; x < letters.length(); x++)
            {
                letterList.add("" + letters.charAt(x));
            }

            ListIterator<String> it = letterList.listIterator();
            while(it.hasNext())
            {
                if(it.next().equals(remLetter))
                {
                    it.remove();
                }
            }
            System.out.println(letterList);
        }
    }
}
