import java.util.*;
import java.io.*;

public class WeirdSort{
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("1st/Weird Sorting Assignment/weirdSort.dat"));
        int count = Integer.parseInt(scan.nextLine());
        String alph = "abcdefghijklmnopqrstuvwxyz";
        String[] wordArr = new String[count];
        for(int i = 0; i < count; i++)
        {
            wordArr[i] = scan.nextLine();
        }

        for(int i = 0; i < count; i++)
        {
            for(int j = 1; j < count; j++)
            {
                int secondNum1 = alph.indexOf(wordArr[j].charAt(1));
                int fourthNum1 = alph.indexOf(wordArr[j].charAt(3));
    
                int secondNum2 = alph.indexOf(wordArr[j-1].charAt(1));
                int fourthNum2 = alph.indexOf(wordArr[j-1].charAt(3));

                if(secondNum1 < secondNum2)
                {
                    String temp = wordArr[j-1];
                    wordArr[j-1] = wordArr[j];
                    wordArr[j] = temp;
                }
                else if(secondNum1 == secondNum2)
                {
                    if(fourthNum1 < fourthNum2)
                    {
                        String temp = wordArr[j-1];
                        wordArr[j-1] = wordArr[j];
                        wordArr[j] = temp;
                    }
                }
            }
        }

        for(int i = 0; i < count; i++)
        {
            System.out.println(wordArr[i]);
        }
    }
}