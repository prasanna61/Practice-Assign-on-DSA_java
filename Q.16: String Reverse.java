import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String t="";//t=s.reverse();
        int l=A.length()-1;
        /* Enter your code here. Print output to STDOUT. */
        for(int i=l;i>=0;i--) {
            t=t+A.charAt(i);
            
        }
        if (t.equals(A)) {
            System.out.println("Yes");
        }
        else {
                     System.out.println("No");
        }
    }
}



