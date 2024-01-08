import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[]) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      

      StringTokenizer st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());

      // 숫자, 이름 Map
      HashMap<Integer, String> hash1 = new HashMap<Integer,String>();
      
      // 이름, 숫자 Map
      HashMap<String, Integer> hash2 = new HashMap<String, Integer>();


      for(int i = 1; i <= N; i++){
        String s = br.readLine();
        hash1.put(i, s);
        hash2.put(s, i);
      }
      
      
      StringBuilder sb = new StringBuilder();

      for(int i = 0; i < M; i++){
        String s = br.readLine();

        // 첫번째 입력값이 숫자일 경우,
        if(s.charAt(0) >= 49 && s.charAt(0)<=57){
            sb.append(hash1.get(Integer.parseInt(s))).append("\n");
        }else{
            sb.append(hash2.get(s)).append("\n");
        }
      }
      br.close();
      System.out.println(sb);
    }
}
