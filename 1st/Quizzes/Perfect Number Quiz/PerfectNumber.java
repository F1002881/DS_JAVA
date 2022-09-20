import java.util.*;
import java.io.*;

public class PerfectNumber {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("1st/Perfect Number/PerfectNumber.txt"));
        while(scan.hasNextLine())
        {
            int num = Integer.parseInt(scan.nextLine());
            int sum = 0;
            for(int i = 1; i < num; i++)
            {
                if(num % i == 0)
                {
                    sum += i;
                }
            }
            if(sum == num)
            {
                System.out.println(num + " is a perfect number.");
            }
            else
            {
                System.out.println(num + " is not a perfect number.");
            }
        }
    }
}
