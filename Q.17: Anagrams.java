import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        String s1=a.toLowerCase();
        String s2=b.toLowerCase();
        if(s1.length()==s2.length()) {
            char[] ch1=s1.toCharArray();
            char[] ch2=s2.toCharArray();
            java .util.Arrays.sort(ch1);
            java.util.Arrays.sort(ch2);
            return java.util.Arrays.equals(ch1,ch2);
        }
            else {
                return false;
            }
        }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
