import java.util.*;
import java.io.*;

class Main {
    static int N, M, R;
    static int cnt;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int visited[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        visited = new int[N+1];
        for(int i = 0; i <= N; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for(int i = 1; i <= N; i++){
            Collections.sort(graph.get(i), Collections.reverseOrder());
        }

        cnt = 1;
        dfs(R);

        for(int i = 1; i < visited.length; i++){
            System.out.println(visited[i]);
        }
        br.close();
    }

    public static void dfs(int start){
        visited[start] = cnt;

        for(int i = 0; i < graph.get(start).size(); i++){
            int now = graph.get(start).get(i);
            if(visited[now] == 0){
                cnt++;
                dfs(now);
            }
        }
    }
}