import java.util.*;
import java.io.*;


public class BalanceSort {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("customers.txt"));
        int count = Integer.parseInt(scan.nextLine());
        String[] customerArr = new String[count];
        for(int i = 0; i < count; i++)
        {
            customerArr[i] = scan.nextLine();
        }
        for(int i = 0; i < count; i++)
        {
            for(int j = 1; j < count; j++)
            {
                String[] splitArr1 = customerArr[j].split(" ");
                String[] splitArr2 = customerArr[j - 1].split(" ");
                if(Double.parseDouble(splitArr2[2]) > Double.parseDouble(splitArr1[2]))
                {
                    String temp = customerArr[j];
                    customerArr[j] = customerArr[j - 1];
                    customerArr[j - 1] = temp;
                }
            }
        }

        for(int i = 0; i < count; i++)
        {
            System.out.println(customerArr[i]);
        }
    }
}
