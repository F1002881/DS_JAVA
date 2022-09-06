
public class Classroom{
    
    public static int numPass(Student[] arr)
    {
        int count = 0;
        for(Student s: arr)
        {
            if(s.getFinalGrade() > 69)
            {
                count++;
            }
        }
        return count;
    }

    public static String nameHighest(Student[] arr)
    {
        Student highest = arr[0];
        for(Student s: arr)
        {
            if(s.getFinalGrade() > highest.getFinalGrade())
            {
                highest = s;
            }
        }
        return highest.getName();
    }

    public static int exceedLimAbsences(Student[] arr, int limit)
    {
        int count = 0;
        for(Student s: arr)
        {
            if(s.getAbsences() > limit)
            {
                count++;
            }
        }
        return count;
    }

    public static String getFirstName(Student[] arr, String lastN)
    {
        String firstN = "No student with given last name";
        for(Student s: arr)
        {
            String lastName =  s.getName().substring(s.getName().indexOf(' '));
            if( lastName == lastN)
            {
                firstN = s.getName().substring(0, s.getName().indexOf(' '));
            }
        }
        return firstN;
    }

    public static void roundUp(Student[] arr)
    {
        for(Student s: arr)
        {
            if(s.getFinalGrade() == 69)
            {
                s.setFinalGrade(70);
            }
        }
    }

    public static void numExempt(Student[] arr)
    {
        int count = 0;
        for(Student s: arr)
        {
            if(s.getFinalGrade() >= 86 && s.getAbsences() < 3)
            {
                System.out.println(s.getName());
                count++;
            }
        }
        System.out.println(count + " students eligable for exemption.");
    }

    public static void remLimit(Student[] arr, int limit)
    {
        int count = 0;
        for(int x = 0; x < arr.length; x++)
        {
            if(arr[x].getAbsences() > limit)
            {
                count++;
            }
        }
    }

    public static Student studentFromName(Student[] arr, String name)
    {
        for(Student s: arr)
        {
            if(s.getName() == name)
            {
                return s;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Steve Robinson", 96, 1);
        Student s2 = new Student("Maria Debala", 84, 0);
        Student s3 = new Student("Bill Shroeder", 72, 4);
        Student s4 = new Student("David Belarus", 69, 2);
        Student s5 = new Student("Andrew Monroe", 100, 3);
        Student s6 = new Student("Jacob Villareal", 62, 4);

        Student[] sArr = {s1, s2, s3, s4, s5, s6};


        System.out.println(numPass(sArr));
        System.out.println(nameHighest(sArr));
        System.out.println(exceedLimAbsences(sArr, 2));
        System.out.println(getFirstName(sArr, "Debala"));
        roundUp(sArr);
        numExempt(sArr);
        remLimit(sArr, 2);
        System.out.println(studentFromName(sArr, "Maria Debala"));

    }
}
