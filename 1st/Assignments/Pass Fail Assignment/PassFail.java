import java.util.*;
import java.io.*;

public class PassFail {
    
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("1st/Pass Fail/PassFail.txt"));
        scan.nextLine();
        while(scan.hasNextLine())
        {
            if(scan.hasNextInt())
            {
                System.out.println(scan.nextInt()); 
            }
        }
    }
}
/*
if(scan.nextInt() < 70)
{
    String line = scan.nextLine();
    String subject = line.substring(0, line.indexOf(' '));
    System.out.println(subject);
}
else
{
    scan.nextLine();
}
*/
