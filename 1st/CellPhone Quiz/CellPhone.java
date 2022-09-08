import java.util.*;
import java.io.*;

public class CellPhone {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("1st/CellPhone Quiz/CellPhone-1.dat"));
        int snum = Integer.parseInt(scan.nextLine());

        int totalMin = 0;
        for(int i = 0; i < snum; i++)
        {
         String line = scan.nextLine();
         String [] arr = line.split(" ");
         int startTime = Integer.parseInt(arr[0].substring(0,arr[0].indexOf(":")));
         int stopTime = Integer.parseInt(arr[1].substring(0,arr[1].indexOf(":")));
         totalMin += 60 * (stopTime - startTime);
         int min1 = Integer.parseInt(arr[0].substring(arr[0].indexOf(":")+1));
         int min2 = Integer.parseInt(arr[1].substring(arr[1].indexOf(":")+1));
         totalMin += min2 - min1;
        }
        System.out.println ("TOTAL MINUTES: "+totalMin);
    }
}
