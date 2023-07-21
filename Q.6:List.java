import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<N;i++) {
            list.add(sc.nextInt());
        }
        int q=sc.nextInt();
        int x=0,y=0;
        for(int i=0;i<q;i++) {
            String query=sc.next();
            if(query.equals("Insert")) {
            x=sc.nextInt();
            y=sc.nextInt();
            list.add(x,y);
            }
            if(query.equals("Delete")) {
                x=sc.nextInt();
                list.remove(x);
            }
        }
        for(int i:list)
            System.out.print(i+" ");
    }
}
