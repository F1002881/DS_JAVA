import java.util.*;
import java.io.*;

public class SplitStack{
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("2nd/Assignments/Split Stack Exercise/splitStack.txt"));
        int numlines = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < numlines; i++)
        {
            String[] lineArr = scan.nextLine().split(" ");
            Stack<Integer> numStack = new Stack<Integer>();
            for(String num : lineArr)
            {
                if(Integer.parseInt(num) < 0)
                    numStack.push(Integer.parseInt(num));

            }
            for(String num : lineArr)
            {
                if(Integer.parseInt(num) > 0)
                    numStack.push(Integer.parseInt(num));
            }
            System.out.println(numStack);
        }
    }
}