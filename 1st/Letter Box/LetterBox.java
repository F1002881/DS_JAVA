import java.util.*;
import java.io.*;

public class LetterBox {
    
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("1st/Letter Box/LetterBox.txt"));
        int count = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < count; i++)
        {
            String line = scan.nextLine();
            String letter = line.substring(0,1);
            int size = Integer.parseInt(line.substring(2));
            for(int x = 0; x < size; x++)
            {
                for(int y = 0; y < size; y++)
                {
                    System.out.print(letter);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
