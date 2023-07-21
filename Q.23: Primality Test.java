import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        
        Scanner sc=new Scanner(System.in);
        BigInteger B=new BigInteger(sc.nextLine());
        boolean flag=B.isProbablePrime(1);
        System.out.println(flag?"prime":"not prime");
        sc.close();
    }
}
