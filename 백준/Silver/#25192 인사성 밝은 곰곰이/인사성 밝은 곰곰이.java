import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[]) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      
      HashSet<String> set = new HashSet<>();

      int N = Integer.parseInt(br.readLine());
      int cnt = 0;

      for(int i = 0; i < N; i++){
        String s = br.readLine();

        if(s.equals("ENTER")){ // ENTER 입력 시, 집합 초기화
          cnt += set.size();
          set = new HashSet<>();
        } else {
          set.add(s);
        }
      }
      cnt += set.size();

      bw.write(cnt + "\n");
      br.close();
      bw.flush();
      bw.close();
  }
}