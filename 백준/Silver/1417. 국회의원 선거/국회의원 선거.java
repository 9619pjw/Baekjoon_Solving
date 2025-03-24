import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int cnt = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < N - 1 ; i++){
            pq.add(Integer.parseInt(br.readLine()));
        }

        int result = 0;
        // 비교한 후보가 더 클 경우, 후보의 표를 줄임임
        while(!pq.isEmpty() && pq.peek() >= cnt){
            ++cnt;
            pq.add(pq.poll()-1);
            ++result;
        }

        System.out.println(result);
        br.close();
    }
}