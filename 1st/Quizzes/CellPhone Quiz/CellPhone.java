import java.util.*;
import java.io.*;

public class CellPhone {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("CellPhone-1.dat"));
        int snum = Integer.parseInt(scan.nextLine());

        int totalMin = 0;
        for(int i = 0; i < snum; i++)
        {
         String line = scan.nextLine();
         String [] arr = line.split(" ");

         int startHour = Integer.parseInt(arr[0].substring(0,arr[0].indexOf(":")));
         int stopHour = Integer.parseInt(arr[1].substring(0,arr[1].indexOf(":")));

         totalMin += 60 * (stopHour - startHour);

         int startMins = Integer.parseInt(arr[0].substring(arr[0].indexOf(":")+1));
         int stopMins = Integer.parseInt(arr[1].substring(arr[1].indexOf(":")+1));

         totalMin += stopMins - startMins;
        }

        System.out.println("TOTAL MINUTES: " + totalMin);
    }
}
