import java.io.*;
import java.util.*;

class Main{
    static int N, M, K, X; // 도시 개수, 간선 개수, 목표 거리, 시작점
    static int visited[]; // 방문거리 저장 배열
    static ArrayList<Integer>[] A; // 그래프 데이터 저장 인접리스트
    static List<Integer> ans; // 정답 리스트
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        A = new ArrayList[N+1];
        ans = new ArrayList<>();
        for(int i= 1 ; i<=N; i++){
            A[i] = new ArrayList<Integer>(); // 인접리스트의 각 ArrayList 초기화
        }
        
        for(int i =0; i<M; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            A[start].add(end);
        }

        visited = new int[N+1];
        for(int i =0; i<=N; i++){
            visited[i] = -1; //방문 배열 초기화
        }
        BFS(X);
        for(int i =0; i<=N; i++){ // 방문 거리가 K인 노드의 숫자를 ans 배열에 저장
            if(visited[i] == K){
                ans.add(i);
            }
        }
        if(ans.isEmpty()){ // ans배열이 비어있음 == 목표거리를 만족하는 도시가 없음
            System.out.println("-1");
        }else{
            Collections.sort(ans); // ans 배열 정렬 후 출력함
            for(int tmp : ans){
                System.out.println(tmp);
            }
        }
        br.close();
    }
    public static void BFS(int X){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(X); // 큐에 출발점 삽입
        visited[X]++; // 현재 방문여부 기록함

        while(!queue.isEmpty()){ 
            int now_Node = queue.poll(); // 큐에서 현재 노드 가져옴
            for(int i : A[now_Node]){ 
                if(visited[i] == -1){ // 큐에 데이터 삽입 후 방문거리를 기록함
                    visited[i] = visited[now_Node] + 1;
                    queue.add(i);
                }
            }
        }
    }
}