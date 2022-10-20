import java.util.*;
import java.io.*; 

public class Mirror {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("2nd/Assignments/Mirror Exercise/Mirror.txt"));
        int numLines = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < numLines; i++)
        {
            String line = scan.nextLine();
            String[] lineArr = line.split(" ");
            Queue<Integer> revNumQueue = new LinkedList<Integer>();
            for(int x = lineArr.length - 1; x >= 0; x--)
            {
                revNumQueue.add(Integer.parseInt(lineArr[x]));
            }
            for(String num : lineArr)
            {
                System.out.print(num + " ");
            }
            while(!revNumQueue.isEmpty())
            {
                System.out.print(revNumQueue.remove() + " ");
            }
            System.out.println("");
        }
    }
}
