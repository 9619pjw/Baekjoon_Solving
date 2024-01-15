import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[]) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();

      int N = Integer.parseInt(br.readLine());
      int arr[] = new int[N];

      for(int i = 0; i < N; i++){
        arr[i] = Integer.parseInt(br.readLine());
      }

      Arrays.sort(arr);
      int gc = 0;
      for(int i = 0; i < N-1; i++){
        int dis = arr[i+1] - arr[i];
        gc = gcd(dis, gc);
      }

      sb.append((arr[N-1]-arr[0])/gc+ 1 - (arr.length));
      System.out.println(sb);
      br.close();
    }

    public static int gcd(int a, int b){
      if(b == 0)
        return a;
      return gcd(b, a%b);
    }
}