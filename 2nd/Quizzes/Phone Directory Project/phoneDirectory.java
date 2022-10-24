import java.util.*;
import java.io.*;

public class phoneDirectory {
    private Map<String, String> namePhoneMap;
    public phoneDirectory(Map<String, String> namePhoneMap)
    {
        this.namePhoneMap = namePhoneMap;
    }

    public void getMember(String number)
    {
        if(namePhoneMap.containsValue(number))
        {
            for(Map.Entry<String, String> member : namePhoneMap.entrySet()){
                if(member.getValue().equals(number))
                    System.out.println("Name: " + member.getKey());
            }
        }
        else
        {
            System.out.println("Invalid phone number");
        }
    }

    public String addMember(String name, String number)
    {
        if(namePhoneMap.containsKey(name))
        {
            return "Member already exists in the phone directory";
        }
        else
        {
            namePhoneMap.put(name, number);
            return "Member successfully added";
        }
        
    }

    public void setNumber(String name, String number)
    {
        if(namePhoneMap.containsKey(name))
        {
            namePhoneMap.put(name, number);
            System.out.println("Successfully changed member number");
        }
        else
        {
            System.out.println("Invalid member name");
        }
    }

    public void display()
    {
        Iterator<String> it = namePhoneMap.keySet().iterator();
        while(it.hasNext())
        {
            String name = it.next();
            String phone = namePhoneMap.get(name);
            System.out.print(name);
            for(int i = 0; name.length() + i < 30; i++)
            {
                System.out.print(" ");
            }
            System.out.println(phone);
        }
    }
    
    public void displayCode(String areaCode)
    {
        int count = 0;
        Iterator<String> it = namePhoneMap.keySet().iterator();
        while(it.hasNext())
        {
            String name = it.next();
            String phone = namePhoneMap.get(name);
            if(phone.substring(0, 3).equals(areaCode))
            {
                System.out.print(name);
                for(int i = 0; name.length() + i < 30; i++)
                {
                    System.out.print(" ");
                }
                System.out.println(phone);
                count++;
            }
        }
        if(count == 0)
        {
            System.out.println("No phone numbers of that area code");
        }
    }

    public void remMember(String name)
    {
        if(namePhoneMap.containsKey(name))
        {
            namePhoneMap.remove(name);
            System.out.println("Successfully removed member");
        }
        else
        {
            System.out.println("Invalid member name");
        }
    }

    public void sortLastName()
    {
        Map<String, String> tempMap = namePhoneMap;
        namePhoneMap = new TreeMap<String, String>(
            (Comparator<String>) (o1, o2) -> (o1.substring(o1.indexOf(" ") + 1)).compareTo(o2.substring(o2.indexOf(" ") + 1))
        );
        namePhoneMap.putAll(tempMap);
        System.out.println("Successfully sorted directory");
    }


    
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("2nd/Quizzes/Phone Directory Project/phoneDirectory.txt"));
        int numLines = Integer.parseInt(scan.nextLine());
        Map<String, String> namePhoneMap = new HashMap<String, String>();
        for(int i = 0; i < numLines; i++)
        {
            String line = scan.nextLine();
            String[] lineArr = line.split(" ");
            String name = "";
            String phone = "";
            for(int x = 0; x < lineArr.length; x++)
            {
                if(x == 0)
                {
                    name += lineArr[x] + " ";
                }
                else if(x == 1)
                {
                    name += lineArr[x];
                }
                else
                {
                    phone += lineArr[x];
                }
            }
            namePhoneMap.put(name, phone);
        }
        phoneDirectory direct = new phoneDirectory(namePhoneMap);
        Scanner user = new Scanner(System.in);
        while(true)
        {
            System.out.println("1. Look up a phone number\n2. Add a member along with a phone number\n3. Change a phone number of a certain existing member\n4. Display all the members and their phone numbers\n5. Display the members from a certain area code and their phone numbers\n6. Remove a member from the phone directory\n7. Sort by last name\n8. Exit Program");
            String line = user.nextLine();
            if(line.equals("1"))
            {
                System.out.println("Type phone number with dashes: ");
                direct.getMember(user.nextLine());
                System.out.println("");
            }
            else if(line.equals("8"))
            {
                user.close();
                break;
            }
           else if(line.equals("2"))
            {
                System.out.println("Type the member's name: ");
                String name = user.nextLine();
                System.out.println("Type the member's number: ");
                String number = user.nextLine();
                System.out.println(direct.addMember(name, number));
                System.out.println("");
            }
            else if(line.equals("3"))
            {
                System.out.println("Type the member's name: ");
                String name = user.nextLine();
                System.out.println("Type the member's new number: ");
                String number = user.nextLine();
                direct.setNumber(name, number);
                System.out.println("");
            }
            else if(line.equals("4"))
            {
                direct.display();
                System.out.println("");
            }
            else if(line.equals("5"))
            {
                System.out.println("Type the area code: ");
                String code = user.nextLine();
                direct.displayCode(code);
                System.out.println("");
            }
            else if(line.equals("6"))
            {
                System.out.println("Type the name of the member: ");
                String name = user.nextLine();
                direct.remMember(name);
                System.out.println("");
            }
            else if(line.equals("7"))
            {
                direct.sortLastName();
                System.out.println("");
            }
        }
    }
}
