public class Main {
    public static void main(String[] args) {
        String line = "abcXabcXabc";
        char rem = 'X';
        while(line.indexOf(rem) > 0)
        {
            line = line.substring(0, line.indexOf(rem)) + line.substring(line.indexOf(rem) + 1);
        }
        System.out.println(line);
    }
}
