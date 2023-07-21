import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int d;
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> List=new ArrayList<>();
                ArrayList<Integer> innerList=null;

        for(int i=0;i<n;i++) {
            innerList=new ArrayList();
            d=sc.nextInt();
            for(int j=0;j<d;j++){
                innerList.add(sc.nextInt());
            }
            List.add(innerList);
        }
        int query=sc.nextInt();
        int x=0,y=0;
        for(int i=0;i<query;i++) {
            x=sc.nextInt();
            y=sc.nextInt();
        try {
            System.out.println(List.get(x-1).get(y-1));
        } catch(Exception e) {
            System.out.println("ERROR!");
        }
        }
    }
}
