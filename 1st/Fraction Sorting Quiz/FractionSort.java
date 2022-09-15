import java.util.*;
import java.io.*;

public class FractionSort {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("1st/Fraction Sorting Quiz/fractions.txt"));
        int count = Integer.parseInt(scan.nextLine());
        String[] fractArr = new String[count];
        Double[] decimalFractArr = new Double[count];
        for(int i = 0; i < count; i++)
        {
            String[] fractSplit = scan.nextLine().split(" ");
            fractArr[i] = fractSplit[0] + "/" + fractSplit[1];
            decimalFractArr[i] = Double.parseDouble(fractSplit[0]) / Double.parseDouble(fractSplit[1]);
        }

        for(int i = 0; i < count; i++)
        {
            for(int j = 1; j < count; j++)
            {
                if(decimalFractArr[j] < decimalFractArr[j-1])
                {
                    String temp1 = fractArr[j];
                    Double temp2 = decimalFractArr[j];
                    fractArr[j] = fractArr[j-1];
                    decimalFractArr[j] = decimalFractArr[j-1];
                    fractArr[j-1] = temp1;
                    decimalFractArr[j-1] = temp2;
                }
            }
        }

        System.out.println(Arrays.toString(fractArr));

    }
}
