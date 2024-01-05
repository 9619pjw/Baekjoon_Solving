import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[]) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      long N = Long.parseLong(br.readLine());

      System.out.println((N * (N-1) * (N-2) / 6));
      System.out.println(3);
  }
}