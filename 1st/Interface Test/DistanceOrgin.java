import java.util.*;
import java.io.*;

public class DistanceOrgin implements Comparable<DistanceOrgin>{

    public int compareTo(DistanceOrgin obj) {
        
        return 0;
    }


    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("1st/Interface Test/points.txt"));
        int count = Integer.parseInt(scan.nextLine());
        String[] pointArr = new String[count];
        Integer[][] intPointArr = new Integer[count][2];
        for(int i = 0; i < count; i++)
        {
            String point = scan.nextLine();
            String[] pointSplit = point.split(" ");
            Integer[] intPoint = {Integer.parseInt(pointSplit[0]), Integer.parseInt(pointSplit[1])};
            pointArr[i] = "(" + pointSplit[0] + "," + pointSplit[1] + ")";
            intPointArr[i] = intPoint;
        }

        for(int i = 0; i < count; i++)
        {
            for(int j = 1; j < count; j++)
            {
                double dist1 = Math.sqrt(Math.pow(intPointArr[i][0], 2) + Math.pow(intPointArr[i][1], 2));
                double dist2 = Math.sqrt(Math.pow(intPointArr[i-1][0], 2) + Math.pow(intPointArr[i-1][1], 2));
                if(dist2 > dist1)
                {
                    
                }

            }
        }
    }
}
