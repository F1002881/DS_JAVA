import java.util.*;
import java.io.*;

public class Expunge {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("2nd/Assignments/Expunge Exercise/expunge.txt"));
        int numLines = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < numLines; i++)
        {
            String line = scan.nextLine();
            String[] lineArr = line.split(" ");
            PriorityQueue<Integer> numQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
            for(int x = 0; x < lineArr.length; x++)
            {
                numQueue.add(Integer.parseInt(lineArr[x]));
            }
            while(!numQueue.isEmpty())
            {
                System.out.print(numQueue.remove() + " ");
            }
            System.out.println("");
        }
    }
}
