import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[]) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int N = Integer.parseInt(br.readLine());
      int arr[] = new int[N];    // 원본 배열
      int result[] = new int[N]; // 정렬 배열

      HashMap<Integer, Integer> rankMap = new HashMap<Integer, Integer>();

      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int i =0; i < arr.length; i++){
        arr[i] = result[i] = Integer.parseInt(st.nextToken());
      }
      br.close();

      Arrays.sort(result);

      int rank = 0;
      for(int i : result){ // 순위를  0부터 매김
        if(!rankMap.containsKey(i)){ // 중복되지 않는 원소만 순위 매김
          rankMap.put(i, rank);
          rank++;
        }
      }

      StringBuilder sb = new StringBuilder();
      for(int key : arr){
        int ranking = rankMap.get(key); // 원본 배열 원소에 대한 순위를 가져옴
        sb.append(ranking).append(' ');
      }
      
      System.out.println(sb);
  }
}