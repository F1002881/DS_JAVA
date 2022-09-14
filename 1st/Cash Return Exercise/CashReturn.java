import java.util.*;
import java.io.*;

public class CashReturn {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("CashReturn.dat"));
        int num = Integer.parseInt(scan.nextLine());
        double q = 0.25;
        double d = 0.10;
        double n = 0.05;
        double p = 0.01;
        for(int i = 0; i < num; i++)
        {
           double amount = scan.nextDouble();
           String amountString = String.valueOf(amount);
           int decimalIndex = amountString.indexOf(".");
           double decimal = Double.parseDouble(amountString.substring(decimalIndex));
           double amountOwed = 0;
           if(decimal > 0)
           {
            amountOwed = 1 - decimal;
           }
           System.out.println(amountOwed);
        
           int countQ = 0;
           int countD = 0;
           int countN = 0;
           int countP = 0;
           while(amountOwed - q >= 0){
            amountOwed -= q;
            countQ++;
           }
           while(amountOwed - d >= 0){
            amountOwed -= d;
            countD++;
           }
           while(amountOwed - n >= 0){
            amountOwed -= n;
            countN++;
           }
           while(amountOwed - p >= 0){
            amountOwed -= p;
            countP++;
           }
           System.out.println("Q: " + countQ + " D: " + countD + " N: " + countN + " P: " + countP);
        }
    }
}
