import java.util.*;
import java.io.*;

public class Main {
    static int N, M;      // 도시의 개수 N, 버스의 개수 M
    static int graph[][]; // 지도 배열
    static final int INF = 999999999; // 상한값
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        
        graph = new int[N+1][N+1];


        // 그래프 초기화
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                graph[i][j] = INF;
                if( i == j ) graph[i][j] = 0;
            }
        }

        // 간선 정보 저장
        for(int i = 1; i <= N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= N; j++){
                int a = Integer.parseInt(st.nextToken());
                graph[i][j] = a;
            }
        }

        // 플로이드 워셜 알고리즘
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                for(int k = 1; k <= N; k++){
                    if(graph[j][i] == 1 && graph[i][k] == 1)
                        graph[j][k] = 1; 
                }
            }
        }

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                bw.write(graph[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}