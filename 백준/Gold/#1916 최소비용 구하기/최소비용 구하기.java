import java.io.*;
import java.util.*;

class Main{
	static int N, M; // 정점 수 N 간선 수 M
	static ArrayList<Node>[] list; // 인접 리스트로 그래프 표현
	static int[] dist; // 최단 거리
	static boolean[] visit; // 방문 여부
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;
		N = Integer.parseInt(br.readLine()); // 정점 수 입력
		M = Integer.parseInt(br.readLine()); // 간선 수 입력

		list = new ArrayList[N+1];
		dist = new int[N+1];
		visit = new boolean[N+1]; // 정점의 개수만큼 배열 선언

		Arrays.fill(dist, Integer.MAX_VALUE); // 최단 거리 배열을 큰 수로 초기화
		for(int i = 0; i <= N; i++){
			list[i] = new ArrayList<Node>(); // 그래프 정보 저장하는 인접 리스트 초기화
		}
		for(int i = 0; i < M; i++){	// 출발지, 도착지, 비용 입력하여 리스트에 추가
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			list[start].add(new Node(end, weight));
		}
		st = new StringTokenizer(br.readLine());

		int startIndex = Integer.parseInt(st.nextToken()); // 출발점 입력
		int endIndex = Integer.parseInt(st.nextToken()); // 도착점 입력
		
		bw.write(dijkstra(startIndex, endIndex) + "\n"); // 다익스트라 알고리즘 수행
		bw.flush();
		bw.close();
		br.close();
	}

	public static int dijkstra(int start, int end){
		PriorityQueue<Node> pq = new PriorityQueue<>(); // 우선순위 큐 선언
		pq.offer(new Node(start, 0)); // 출발 정점을 우선순위 큐에 삽입
		dist[start] = 0; // 출발지는 거리가 0
		while(!pq.isEmpty()){ // 모든 정점을 사용할 때까지
			Node nowNode = pq.poll(); // 큐에서 빼낸 현재 정점
			int now = nowNode.targetNode; 
			if(!visit[now]){ // 방문한 적이 없으면
				visit[now] = true; // 방문 표시
				for(Node n : list[now]){ // 현재 정점의 간선 개수 만큼 반복
					// 타겟 정점 방문 전 && 현재 선택노드 최단거리 + 비용 < 타겟 정점의 최단거리
					if(!visit[n.targetNode] && dist[n.targetNode] > dist[now] + n.value){
						dist[n.targetNode] = dist[now] + n.value; // 타겟 정점 최단 거리 업데이트
						pq.add(new Node(n.targetNode, dist[n.targetNode])); // 우선순위 큐에 타겟 정점 추가함
					}
				}
			}
		}
		return dist[end]; // 최단 거리 배열에서 목적지 길이 출력
	}
}

class Node implements Comparable<Node>{
	int targetNode; // 가리키는 간선
	int value; 		// 간선의 비용

	Node(int targetNode, int value){
		this.targetNode = targetNode;
		this.value = value;
	}
	@Override
	public int compareTo(Node o){ // 우선순위 큐 정렬 기준 재정의
		return value - o.value;
	}

}