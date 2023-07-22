import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  public static void main(String[] args) throws FileNotFoundException {
    // File file = new File("./src/input.txt");
    Scanner in = new Scanner(System.in);
    int bitSetWidth = in.nextInt();
    int numOps = in.nextInt();
    BitSet bit1 = new BitSet(bitSetWidth);
    BitSet bit2 = new BitSet(bitSetWidth);

    while(numOps-- > 0){
      String op = in.next();
      int first = in.nextInt();
      int second = in.nextInt();
      if(in.hasNext()) in.nextLine();
      switch(op){
        case "AND": {
          if(first == 1) bit1.and(bit2);
          else bit2.and(bit1);
          break;

        }
        case "OR": {
          if(first == 1) bit1.or(bit2);
          else bit2.or(bit1);
          break;

        }
        case "SET": {
          if(first == 1) bit1.set(second);
          else bit2.set(second);
          break;

        }
        case "XOR": {
          if(first == 1) bit1.xor(bit2);
          else bit2.xor(bit1);
          break;

        }
        case "FLIP": {
          if(first == 1) bit1.flip(second);
          else bit2.flip(second);
          break;

        }

      }
      System.out.println(bit1.cardinality() +
        " " + bit2.cardinality());

    }
    in.close();

  }

}
