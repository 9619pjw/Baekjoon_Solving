import java.util.*;
import java.io.*;

class Main {
    static final int INF = (int) 1e9;
    static int graph[][]; // 최단거리
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        N = Integer.parseInt(br.readLine());
        graph = new int[N+1][N+1];

        // 값 입력받기
        for(int i = 1; i <= N; i++){
            String str = br.readLine();

            for(int j = 1; j <= N; j++){
                char ch = str.charAt(j-1);

                if(ch == 'Y')
                    graph[i][j] = 1;
                else if(i != j)
                    graph[i][j] = INF;
            }
        }
        
        // 플로이드 워셜
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                for(int k = 1; k <= N; k++){
                    if(i == j || j == k || k == i) continue;
                    graph[j][k] = Math.min(graph[j][k], graph[j][i] + graph[i][k]);
                }
            }
        }

        int result = 0;

        for(int i = 1; i <= N; i++){
            int tmp = 0;
            for(int j = 1; j <= N; j++){
                if(i == j) continue;

                else if (graph[i][j] <= 2)
                    tmp++;
            }
            result = Math.max(result, tmp);
        }

        bw.write(result +"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}