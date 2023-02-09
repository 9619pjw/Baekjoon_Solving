import java.util.List;
import java.util.ArrayList;
import java.io.*;
class Main{
    static int[] parent; // 부모 
    static int[] visit; // 방문
    static List<Integer>[] list;// 각 노드에 리스트 생성

    static int N; // 노드의 개수

    static void dfs(int v){
        visit[v] = 1;

        for(int i : list[v]){ // 각 노드에 연결된 노드들 확인
            if(visit[i] != 1){ // 노드 방문 안했으면
                parent[i] = v; // 부모 노드 지정
                dfs(i); // 해당 노드 탐색함
            }
        }
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        list = new ArrayList[N+1];
        parent = new int[N+1];
        for(int i =1; i<=N; i++){
            list[i] = new ArrayList<>(); // 각 노드에 배열 리스트 생성
        }
        visit = new int[N+1]; 

        for(int i =0; i<N-1; i++){
            String s[] = br.readLine().split(" "); // 연결된 노드 입력함
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);

            list[x].add(y);
            list[y].add(x);
        }
        dfs(1); // 1부터 탐색 시작

        for(int i =2; i<=N; i++){ // 2번노드부터 부모노드 순서대로 출력함
            System.out.println(parent[i]);
        }

    }

}