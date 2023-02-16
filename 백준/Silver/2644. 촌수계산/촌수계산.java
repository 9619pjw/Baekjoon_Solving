import java.util.*;
import java.io.*;

class Main{
    static int map[][];
    static boolean isFinish;
    static int N; // 전체 사람의 개수
    static int M; // 부모 자식 간 관계의 개수
    static int start, end; // 촌수 계산 대상

    static void bfs(){ 
        Queue<int[]> queue = new LinkedList<>();
        boolean isVisit[] = new boolean[map.length]; // 방문 표시
        isFinish = false; // 끝에 도착했는지 확인

        queue.offer(new int[] {start, 1}); 
        isVisit[start] = true; // 시작점 방문 표시함

        while(!queue.isEmpty() && !isFinish){ // 큐에 내용물 있고 끝점도달 안했으면
            int q[] = queue.poll();
            for(int i = 1; i<map.length; i++){
                if(map[q[0]][i] == 1 && !isVisit[i]){
                    if(i == end){
                        System.out.println(q[1]);
                        isFinish = true;
                        break;
                    }
                    isVisit[i] = true;
                    queue.offer(new int[] {i, q[1]+1});
                }
            }
        }
        
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine()); // 전체 사람의 수

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        start = Integer.parseInt(st.nextToken()); // 부모
        end = Integer.parseInt(st.nextToken()); // 자식
        M = Integer.parseInt(br.readLine()); // 관계의 수
       

        map = new int[N+1][N+1];

        for(int i = 1; i<=M; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
            int v1 = Integer.parseInt(st1.nextToken());
            int v2 = Integer.parseInt(st1.nextToken());

            map[v1][v2] = map[v2][v1] = 1;
        }
        bfs();
        if(!isFinish)
            System.out.println(-1);

        br.close();
    }
}