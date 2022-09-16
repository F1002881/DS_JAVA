import java.util.*;
import java.io.*;

public class DistanceOrigin implements Comparable<DistanceOrigin>{
    public int x;
    public int y;

    public DistanceOrigin(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int compareTo(DistanceOrigin pt) {
        double dist1 = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
        double dist2 = Math.sqrt(Math.pow(pt.x, 2) + Math.pow(pt.y, 2));
        if(dist1 > dist2)
            return 1;
        else if(dist2 > dist1)
            return -1;
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
                DistanceOrigin p1 = new DistanceOrigin(intPointArr[j][0], intPointArr[j][1]);
                DistanceOrigin p2 = new DistanceOrigin(intPointArr[j-1][0], intPointArr[j-1][1]);
                if(p1.compareTo(p2) < 0)
                {
                    String temp1 = pointArr[j];
                    Integer[] temp2 = intPointArr[j];
                    pointArr[j] = pointArr[j-1];
                    intPointArr[j] = intPointArr[j-1];
                    pointArr[j-1] = temp1;
                    intPointArr[j-1] = temp2; 
                }
            }
        }
        
        System.out.println(Arrays.toString(pointArr));
    }
}
