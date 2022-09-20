import java.util.*;
import java.io.*;


public class OddNames {
    public static void main(String[] args) throws IOException{
            Scanner scan = new Scanner(new File("1st/Odd Names/oddNames.txt"));
            String num = scan.nextLine();
            int count = Integer.parseInt(num);
            int sum = 0;
            for(int i = 0; i < count; i++)
            {
                String name = scan.nextLine();
                if(name.length() % 2 == 1)
                {
                    sum++;
                }
            }
            System.out.println("The number of odd names is: " + sum);
    }
}
