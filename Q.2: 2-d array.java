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

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close();
        int hourglass_sum=0;
        int largest_sum=Integer.MIN_VALUE;
        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++) {
                hourglass_sum+=arr.get(i).get(j);
                hourglass_sum+=arr.get(i).get(j+1);
                hourglass_sum+=arr.get(i).get(j+2);
                hourglass_sum+=arr.get(i+1).get(j+1);
                hourglass_sum+=arr.get(i+2).get(j);
                hourglass_sum+=arr.get(i+2).get(j+1);
                hourglass_sum+=arr.get(i+2).get(j+2);
                
                if(hourglass_sum>largest_sum) 
            largest_sum=hourglass_sum;
            hourglass_sum=0;
            }
        }
    System.out.println(largest_sum);
    }
}
