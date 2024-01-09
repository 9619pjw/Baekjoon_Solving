import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[]) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      StringTokenizer st = new StringTokenizer(br.readLine());
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());

      Set<Integer> set1 = new HashSet<Integer>();
      Set<Integer> set2 = new HashSet<Integer>();

      st= new StringTokenizer(br.readLine());
      for(int i = 0; i < A; i++){
        set1.add(Integer.parseInt(st.nextToken()));
      }
      
      st = new StringTokenizer(br.readLine());
      for(int i = 0; i < B; i++){
        set2.add(Integer.parseInt(st.nextToken()));
      }

      int result = 0;
      
      for(int num : set1){
        if(!set2.contains(num)){
          result++;
        }
      }

      for(int num : set2){
        if(!set1.contains(num)){
          result++;
        }
      }

      System.out.println(result);
  }
}
