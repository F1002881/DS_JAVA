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
            PriorityQueue<Integer> numQueue = new PriorityQueue<Integer>();
            for(int x = 0; x < lineArr.length; x++)
            {
                numQueue.add(Integer.parseInt(lineArr[x]));
            }
            Stack<Integer> revStack= new Stack<Integer>();
            while(!numQueue.isEmpty())
            {
                revStack.push(numQueue.remove());
            }
            while(!revStack.isEmpty())
            {
                System.out.print(revStack.pop() + " ");
            }
            System.out.println("");
        }
    }
}
