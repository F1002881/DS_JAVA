import java.util.*;
import java.io.*;


public class WordTester{
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("wordList.txt"));
        int count = Integer.parseInt(scan.nextLine());
        Word[] arr = new Word[count];
        for(int i = 0; i < count; i++)
        {
            String line = scan.nextLine();
            Word w = new Word(line);
            arr[i] = w;
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
