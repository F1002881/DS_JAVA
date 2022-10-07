import java.util.*;
import java.io.*;


public class electionWinner {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("2nd/Quizzes/Who Won the Election Quiz/election.txt"));
        int numElections = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < numElections; i++)
        {
            int numVotes = Integer.parseInt(scan.nextLine());
            TreeMap<String, Integer> candidatesMap = new TreeMap<String, Integer>();
            for(int x = 0; x < numVotes; x++)
            {
                String candidate = scan.nextLine();
                if(candidatesMap.get(candidate) == null)
                    candidatesMap.put(candidate, 1);
                else
                    candidatesMap.put(candidate, candidatesMap.get(candidate) + 1);
            }

            String candidateWon = "None";
            for(Map.Entry<String, Integer> entry : candidatesMap.entrySet())
            {
                if(entry.getValue() > numVotes / 2)
                    candidateWon = entry.getKey();
            }
            
            if(candidateWon != "None")
                System.out.println(candidateWon + " won the election.");
            else
                System.out.println("Nobody won! A special runoff election will be held.");
        }
    }
}