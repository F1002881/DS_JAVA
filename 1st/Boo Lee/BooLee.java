import java.util.*;
import java.io.*;

public class BooLee {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("booLee.txt"));
        int count = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < count; i++)
        {
            String line = scan.nextLine();
            String[] arr = line.split(" ");
            System.out.println(Arrays.toString(arr));
            String operation = arr[0];
        }
    }
}
