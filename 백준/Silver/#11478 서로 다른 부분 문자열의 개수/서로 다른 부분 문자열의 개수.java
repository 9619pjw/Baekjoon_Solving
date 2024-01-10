import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[]) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      sb.append(br.readLine());
      br.close();

      Set<String> set = new HashSet<>();
      for(int i = 0; i < sb.length(); i++){
        for(int j = i+1; j <= sb.length(); j++ ){
          String s = sb.substring(i, j);
          // 정해진 길이만큼 쪼개진 문자열을 집합에 추가
          set.add(s);
        }
      }
      System.out.println(set.size());
  }
}