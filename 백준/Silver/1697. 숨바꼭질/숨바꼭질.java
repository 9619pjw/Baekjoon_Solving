import java.io.*;
import java.util.*;

class Main {

    private static final int MAX_STEP = 100001; // 자주 사용하는 상수값 따로 빼두기

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()); // 수빈이의 위치
        int k = Integer.parseInt(st.nextToken()); // 동생의 위치

        // 방문 여부 저장
        boolean[] visited = new boolean[MAX_STEP];
        // 걸음 수 저장
        int[] dp = new int[MAX_STEP];
        // 수빈이가 갈 수 있는 방식들 저장하는 큐
        Queue<Integer> subinPosQ = new LinkedList<>();
        visited[n]=true;
        subinPosQ.add(n);

        while(!subinPosQ.isEmpty()){
            int nowPos = subinPosQ.poll();

            // set moving array
            int[] moves = {nowPos+1, nowPos-1, nowPos*2};

            // moving
            for(int step : moves){
                // 범위 체크
                if(step<0 || MAX_STEP<=step) continue;

                // 방문 체크
                if (visited[step]) 
                    continue;
                visited[step] = true;

                // 걸음수 설정
                dp[step] = dp[nowPos]+1;

                // 발견하면 나오도록 셋팅 (불필요한 부분까지 체크하는 것 방지)
                if(k==step) 
                    break;

                // 큐에 추가
                subinPosQ.add(step);
            }
        }
        System.out.println(dp[k]);
        br.close();
    }
}