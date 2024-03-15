import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static int graph[][];
    static final int INF = 999999999;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new int[N+1][N+1];

        // 그래프 초기화
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                graph[i][j] = INF;
                if( i == j ) graph[i][j] = 0;
            }
        }

        // 간선 정보 저장
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        // 플로이드 워셜
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                for(int k = 1; k <= N; k++){
                    graph[j][k] = Math.min(graph[j][k], graph[j][i] + graph[i][k]);
                }
            }
        }

        // 케빈 베이컨의 수가 가장 작은 사람 구하기
        int tmp = INF;
        int result = 0;

        for(int i = 1; i <= N; i++){
            int total = 0;
            for(int j = 1; j <= N; j++){
                total += graph[i][j];
            }
            if (tmp > total){
                tmp = total;
                result = i;
            }
        }

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}