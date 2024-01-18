import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[]) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      
      int N = Integer.parseInt(br.readLine());
      int arr[] = new int[N];
      int result[] = new int[N];
      int cnt = 0;
      for(int i = 0; i < arr.length ; i++){
        arr[i] = i+1;
      }

      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int i =0; i < N; i++){
        result[i] = Integer.parseInt(st.nextToken());
        if(result[i] != arr[i])
          cnt++;
      }
      
      bw.write(cnt + "\n");
      bw.flush();
      bw.close();
      br.close();
  }
}