import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>(); // 대기열
        Stack<Integer> s = new Stack<>(); // 추가 대기열

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            q.offer(Integer.parseInt(st.nextToken()));
        }

        int start = 1; // 간식먹는 순서

        while(!q.isEmpty()){
            if(q.peek() == start){ // 대기열에 간식먹는 순서 있으면
                q.poll();
                start++;
            } else if(!s.isEmpty() && s.peek() == start){ // 임시 대기열에 간식먹는 순서가 있으면
                s.pop();
                start++;
            } else{ // 대기열에 간식먹는 순서가 아니면 임시 대기열로 이동
                s.push(q.poll());
            }
        }
        while(!s.isEmpty()){
            if(s.peek() == start){
                s.pop();
                start++;
            } else {
                System.out.println("Sad");
                return;
            }
        }
        System.out.println("Nice");    
        br.close();
    }
}