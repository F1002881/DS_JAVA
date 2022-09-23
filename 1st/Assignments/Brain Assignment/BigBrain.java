import java.util.*;
import java.io.*;

public class BigBrain {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("1st/Assignments/Brain Assignment/brains-1.in"));
        int totalCases = Integer.parseInt(scan.nextLine());

        for(int i = 0; i < totalCases; i++)
        {
            double eBrainSize = Double.parseDouble(scan.nextLine());
            int totalComps = Integer.parseInt(scan.nextLine());
            TreeSet<Double> compsSizes = new TreeSet<Double>();
            String[] comps = new String[totalComps];
            for(int y = 0; y < totalComps; y++)
            {
                String line = scan.nextLine();
                double compSize = Double.parseDouble(line.substring(line.indexOf(" ") + 1));
                String compName = line.substring(0, line.indexOf(" "));
                if(compSize > eBrainSize)
                {
                    eBrainSize = compSize + 1;
                }
                comps[y] = compSize + " " + compName;
                compsSizes.add(compSize);
            }

            Set<Double> sortedCompsSizes = compsSizes.descendingSet();
            int count = 0;
            for(Double sortedSize : sortedCompsSizes)
            {
                for(int x = 0; x < comps.length; x++)
                {
                    double compsSize = Double.parseDouble(comps[x].substring(0, comps[x].indexOf(" ")));
                    if(compsSize == sortedSize)
                    {
                        String temp = comps[x];
                        comps[x] = comps[count];
                        comps[count] = temp;

                    }
                }
                count++;
            }

            System.out.println(eBrainSize + " Mr.E");
            for(String comp : comps)
            {
                System.out.println(comp);
            }
            System.out.println("");
        }
    }
}
