import java.util.*;
import java.io.*;

class Main{
    static boolean visited[]; // 방문 표시
    static ArrayList<Integer>[] A; // 그래프 데이터 저장 인접 리스트
    static boolean arrive;// 도착확인 변수
    static int N; // 노드 개수
    static int M; // 간선 개수
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 노드 개수 입력
        M = Integer.parseInt(st.nextToken()); // 간선 개수 입력
        A = new ArrayList[N]; // 그래프 데이터 저장 인접리스트 선언
        visited = new boolean[N]; // 방문 표시 배열 선언
        
        for(int i =0; i<N; i++){
            A[i] = new ArrayList<Integer>(); // A 인접 리스트의 각 ArrayList 초기화
        }
        for(int i = 0; i<M; i++){ // A 인접 리스트에 그래프 데이터 저장
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            A[S].add(E);
            A[E].add(S);
        }

        for(int i =0; i<N; i++){ // 노드의 개수만큼 반복
            DFS(i,1); // depth 1부터 시작
            if (arrive) // depth 가 5에 도달할 시 반복문 종료
                break; 
        }
        if(arrive)
            System.out.println("1");
        else
            System.out.println("0"); // 5의 깊이가 없다면 0 출력
    
        br.close();
    }

    public static void DFS(int now, int depth){
        if( depth == 5 || arrive){ // depth가 5가되면 프로그램 종료
            arrive = true;
            return;
        }
        visited[now] = true; // 방문 배열에 현재 노드 방문 기록
        for(int i : A[now]){ // 현재 노드에 연결된 노드 중에서 방문하지 않은 노드 DFS
            if(!visited[i]){
                DFS(i,depth + 1); // 재귀 호출 될때마다 depth를 1씩 증가
            }
        }
        visited[now] = false;
    }
}