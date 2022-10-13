import java.util.*;
import java.io.*;

public class palindrome{
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("2nd/Assignments/Palindrome Exercise/palindrome.txt"));
        int numWords = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < numWords; i++)
        {
            String word = scan.nextLine();
            Stack<Character> invWordStack = new Stack<Character>();
            for(int x = word.length() - 1; x >= 0; x--)
            {
                invWordStack.push(word.charAt(x));
            }

            String invWord = "";
            for(char letter : invWordStack)
            {
                invWord += letter;
            }
            
            if(invWord.equals(word))
                System.out.println("palindrome");
            else
                System.out.println("not palindrome");
        }
    }
}