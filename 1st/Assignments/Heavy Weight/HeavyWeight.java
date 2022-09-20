import java.util.*;
import java.io.*;

public class HeavyWeight {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("1st/Heavy Weight/HeavyWeight.txt"));
        int limit = Integer.parseInt(scan.nextLine());
        int sum = 0;
        while (scan.hasNextLine())
        {
            int weight = Integer.parseInt(scan.nextLine());
            if(weight > limit)
            {
                sum++;
            }
        }
        System.out.println("The number of people whose weight exceed the limit is: " + sum);

    }
}
