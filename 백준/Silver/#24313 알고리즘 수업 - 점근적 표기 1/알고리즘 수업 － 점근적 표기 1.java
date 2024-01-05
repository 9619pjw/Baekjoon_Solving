import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[]) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());

      int C = Integer.parseInt(br.readLine());
      int D = Integer.parseInt(br.readLine());

      br.close();
      
      if((A*D) + B <= (C * D) && C >= A){
        System.out.println(1);
      }
      else{
        System.out.println(0);
      }
  }
}