import java.util.*;
import java.io.*;

public class Armstrong{
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("1st/Armstrong/Armstrong.txt"));
        int count = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < count; i++)
        {
            int num = Integer.parseInt(scan.nextLine());
            String numStr = "" + num;
            int numDigits = 0;
            for(int x = 0; x < numStr.length(); x++)
            {
                numDigits ++;
            }
            int total = 0;
            int temp_num = num;
            while(temp_num > 0)
            {
                int digit = temp_num % 10;
                temp_num /= 10;
                total += Math.pow(digit, numDigits);
            }

            if(total == num)
                System.out.println("Armstrong");
            else
                System.out.println("Not Armstrong");
        }
    }
}