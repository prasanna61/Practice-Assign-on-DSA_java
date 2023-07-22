import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        String[] str=s.split("[ !,?._'@]+");
        int size=str.length;
        for(String C:str) {
            if(C.isEmpty()) {
                size--;
            }
        }
        System.out.println(size);
        for(String C:str) {
            if(!C.isEmpty())
                System.out.println(C);
        }                               
    }
}
