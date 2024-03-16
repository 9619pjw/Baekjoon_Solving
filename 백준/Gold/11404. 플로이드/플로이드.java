import java.util.*;
import java.io.*;

public class Main {
    static int N, M;      // 도시의 개수 N, 버스의 개수 M
    static int graph[][]; // 지도 배열
    static final int INF = 999999999; // 상한값
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        
        graph = new int[N+1][N+1];

        // 그래프 초기화
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                graph[i][j] = INF;
                if( i == j ) graph[i][j] = 0;
            }
        }

        // 간선 정보 저장
        for(int i = 1; i <= M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(graph[a][b] > c) // 해당 노선이 이미 있는 경우, 최솟값으로 갱신하기
                graph[a][b] = c;
        }

        // 플로이드 워셜 알고리즘
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                for(int k = 1; k <= N; k++){
                    graph[j][k] = Math.min(graph[j][k], graph[j][i] + graph[i][k]);
                }
            }
        }

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                if(graph[i][j] == INF)
                    System.out.print(0 + " ");
                else 
                    System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
        br.close();
    }
}