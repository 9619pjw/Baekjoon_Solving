import java.util.*;
import java.io.*;

class Main{
	static int N; // 노드 개수
	static int M; // 간선 개수
	static boolean visited[]; // 방문 유무 
	static int answer[]; // 정답 배열
	static ArrayList<Integer> A[]; // 그래프 데이터 저장 인접 리스트
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		A = new ArrayList[N+1];
		answer = new int[N+1];

		for(int i = 1; i<=N; i++){ // A 인접 리스트의 각 ArrayList 초기화.
			A[i] = new ArrayList<>(); 
		}

		for(int i =0; i < M; i++){ // A 인접리스트에 그래프 데이터 저장함.
			st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			A[S].add(E);
		}

		for(int i = 1; i <= N; i++){
			visited = new boolean[N+1]; // 방문 배열 초기화
			BFS(i); // 너비우선 탐색 실행
		}
		
		int maxVal = 0;
		for(int i = 1; i <= N; i++){ // answer 배열에서 가장 큰 수 찾기
			maxVal = Math.max(maxVal, answer[i]);
		}

		for(int i = 1; i <= N; i++){ // answer 배열에서 maxVal와 같은 값을 가진 index를 정답으로 출력
			if (answer[i] == maxVal)
				System.out.print(i + " ");
		}
		bw.flush();
		bw.close();
		br.close();
	}

	public static void BFS(int index){
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(index); // 큐에 출발노드 더함
		visited[index] = true;
		while(!queue.isEmpty()){ // 큐가 빌때까지
			int now_node = queue.poll(); // 큐의 노드 데이터 가져옴
			for(int i : A[now_node]){  
				if(visited[i] == false){ //  방문여부 확인 후
					visited[i] = true; // 방문기록 남김
					answer[i]++; 	   // 정답 배열값 증가
					queue.add(i);	   // 큐에 데이터 삽입
				}
			}
		}
	}
}