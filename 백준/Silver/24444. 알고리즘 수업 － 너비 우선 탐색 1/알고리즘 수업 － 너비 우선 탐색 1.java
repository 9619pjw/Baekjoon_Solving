import java.util.*;
import java.io.*;

class Main {
    static boolean visited[];
    static int N, M, R; // 정점의 수, 간선의 수, 시작 정점
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];
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
            Collections.sort(graph.get(i));
        }

        bfs(R);
        br.close();
    }
    public static void bfs(int R){
        Queue<Integer> queue = new LinkedList<>();
        int cnt = 0;
        int result[] = new int[N+1];
        queue.add(R);

        visited[R] = true;
        result[R] = ++cnt;

        while(!queue.isEmpty()){
            int now = queue.poll();

            for(int i = 0; i < graph.get(now).size(); i++){
                int next =  graph.get(now).get(i);
                if(!visited[next]){
                    queue.add(next);
                    visited[next] = true;
                    result[next] = ++cnt;
                }
            }
        }

        for(int i = 1; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}