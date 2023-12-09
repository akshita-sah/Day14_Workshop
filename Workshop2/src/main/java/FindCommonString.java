import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class StringCharacters{
    char[] c;
    StringCharacters(char[] c)
    {
        this.c = c;
    }
}

public class FindCommonString {
    /*
    For finding common strings, first we map each character from the string 1, next we traverse through
    all the elements of the second array and if that is present in first, we add it in the string.
     */
    public static String commonString(char[] charArray1,char[] charArray2)
    {
        Map<Character, Integer> a = new HashMap<>();
        String s = "";
        for(int i=0;i<charArray1.length;i++)
        {
            a.put(charArray1[i],1);
        }
        for(int i=0;i<charArray2.length;i++)
        {
            if(a.get(charArray2[i])!=null)
            {
                s = s + charArray2[i];
            }
        }
        return s;
    }

    public static void main(String[] args) {
        String a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two strings: ");
        a = sc.next();
        b = sc.next();
        System.out.println("The original strings are: "+a+" "+b);
        StringCharacters charArray1 = new StringCharacters(a.toCharArray());
        StringCharacters charArray2 = new StringCharacters(b.toCharArray());
        System.out.println("The common characters of the string are: "+commonString(charArray1.c,charArray2.c));
    }

}