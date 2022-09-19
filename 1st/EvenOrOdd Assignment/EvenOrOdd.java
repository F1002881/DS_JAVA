import java.util.*;
import java.io.*;

public class EvenOrOdd {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("1st/EvenOrOdd Assignment/oddeven.dat"));
        while(scan.hasNextLine())
        {
            HashSet<Integer> odds = new HashSet<Integer>();
            HashSet<Integer> evens = new HashSet<Integer>();

            String[] all = scan.nextLine().split(" ");
            for(String num: all)
            {
                if(Integer.parseInt(num) % 2 == 0)
                {
                    evens.add(Integer.parseInt(num));
                }
                else
                {
                    odds.add(Integer.parseInt(num));
                }
            }
            System.out.println("ODDS : " + odds);
            System.out.println("EVENS : " + evens);
            System.out.println("");
        }
    }
}
