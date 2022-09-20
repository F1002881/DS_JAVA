import java.util.*;
import java.io.*;

public class VowelCount {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("1st/Vowel Count/vowelCount.txt"));
        Character[] vowelList = {'a', 'e', 'i', 'o', 'u'};
        int count = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < count; i++)
        {
            int countVowels = 0;
            String name = scan.nextLine();
            for(int x = 0; x < name.length(); x++)
            {
                for(char vowel : vowelList)
                {
                    if(name.charAt(x) == vowel)
                        countVowels++;
                }
            }
            if(countVowels > name.length() - countVowels){
                System.out.println(name);
                System.out.println(1);
            }
            else{
                System.out.println(name);
                System.out.println(0);
            }
        }
    }
}
