import java.util.*;
import java.io.*;

class Main{
	static boolean visited[]; // 방문 기록 저장 배열
	static int[] distance; // 거리 저장 배열
	static ArrayList<Edge>[] A; // 그래프 데이터 저장 인접 리스트
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int V = Integer.parseInt(br.readLine()); // 정점의 개수 입력
		A = new ArrayList[V+1];	// 정점의 개수만큼 인접 리스트 생성
		
		for(int i = 1 ; i <= V; i++){
			A[i] = new ArrayList<Edge>(); // 인접 리스트의 각 ArrayList 초기화
		}
		for(int i = 0; i < V; i++){
			st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken()); // 메인 정점
			while(true){
				int E = Integer.parseInt(st.nextToken()); // 연결될 정점
				if(E == -1) // -1 입력 시 더 이상 노드 없음
					break;
				int D = Integer.parseInt(st.nextToken()); // 정점 간 거리
				A[S].add(new Edge(E,D)); // 그래프 데이터 저장함
			}
		}

		distance = new int[V+1];	// 거리 저장 배열 생성
		visited = new boolean[V+1]; // 방문 저장 배열 생성
		BFS(1);		// 임의의 점을 시작으로 실행
		
		int Max = 1;	// 거리배열 최댓값 저장할 변수 선언
		for(int i = 2; i <= V; i++){
			if(distance[Max] < distance[i])
				Max = i;
		}

		distance = new int[V+1]; 	// 거리 저장 배열 초기화
		visited = new boolean[V+1]; // 방문 저장 배열 초기화
		BFS(Max);		// 새로운 시작점으로 탐색 시작

		Arrays.sort(distance); // 거리 배열 정렬
		System.out.println(distance[V]); // 최장 경로 출력
		br.close();
	}
	private static void BFS(int idx){
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(idx);	// 큐에 시작 정점 삽입
		visited[idx] = true; // 현재 정점 방문 기록

		while(!q.isEmpty()){ 
			int now_node = q.poll(); // 큐에서 현재 정점 데이터 가져옴
			for(Edge i : A[now_node]){
				int e = i.e;
				int v = i.value;
				if(!visited[e]){ // 연결된 정점 중 방문하지 않은 정점인 경우
					visited[e] = true; // 방문 표시
					q.add(e); // 큐에 삽입
					distance[e] = distance[now_node] + v; // 현재 정점의 거리 + 간선의 가중치로 거리 배열 갱신
				}
			}
		}
	}
}
class Edge{
	int e; // 목적지
	int value; // 간선 가중치
	public Edge(int e, int value){
		this.e = e;
		this.value = value;
	}
}