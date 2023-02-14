import java.util.*;
import java.io.*;

class Main{
    static int map[][];
    static int visit[]; // dfs용
    static int visit2[]; // bfs용
    static int queue[]; // bfs에서 사용할 큐
    static int rear, front;
    static int N; // 정점의 개수
    static int M; // 간선의 개수
    static int V; // 탐색 시작할 정점

    static void dfs(int start){
        
        visit[start] = 1;
        for(int i =1; i<N+1; i++){
            if(map[start][i] == 1 && visit[i] == 0){
                System.out.printf("%d ", i);
                dfs(i);
            }
        }
    }

    static void bfs(int start){
        visit2[start] = 1;
        System.out.print(start + " ");
        queue[rear++] = start;

        while(front < rear){
            start = queue[front++];
            for(int i =1; i<N+1; i++){
                if(map[start][i] == 1 && visit2[i] == 0){
                    visit2[i] =1;
                    System.out.printf("%d ", i);
                    queue[rear++] = i;
                }
            }
        }
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        map = new int[N+1][N+1];
        visit = new int[N+1];
        visit2 = new int[N+1];
        queue = new int[N+1];

        for(int i = 1; i<=M; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
            int v1 = Integer.parseInt(st1.nextToken());
            int v2 = Integer.parseInt(st1.nextToken());

            map[v1][v2] = map[v2][v1] = 1;
        }
        System.out.print(V + " ");
        dfs(V);
        System.out.println();
        bfs(V);
        System.out.println();

        br.close();
    }
}