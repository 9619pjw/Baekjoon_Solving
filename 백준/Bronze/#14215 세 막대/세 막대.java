import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[]) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      int arr[] = new int[3];
      arr[0] = Integer.parseInt(st.nextToken());
      arr[1] = Integer.parseInt(st.nextToken());
      arr[2] = Integer.parseInt(st.nextToken());
      br.close();

      Arrays.sort(arr);

      while(true){
        if(arr[2] >= arr[0] + arr[1]){
          arr[2]--;
          continue;
        }
        else
          break;
      }

      System.out.println(arr[0]+arr[1]+arr[2]);  
  }
}