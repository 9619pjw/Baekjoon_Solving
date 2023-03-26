import java.util.*;
import java.io.*;

class Main{
	static int N; // 정점의 개수
	static int M; // 간선의 개수
	static int cnt = 0; // 연결 요소의 개수
	
	static int map[][]; // 간선 배열
	static int visit[]; // 방문노드 배열
	
	static void DFS(int v){	
		visit[v] = 1; // 방문 표시를 함
		
		for(int i = 1; i <= N; i++){
			if(map[v][i] == 1 && visit[i] != 1){ // 간선 연결되어있고 방문한적 없는 노드면 
				DFS(i); // 계속 탐색함
			}
		}
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); // 정점의 개수
		M = Integer.parseInt(st.nextToken()); // 간선의 개수
		map = new int[N+1][N+1]; // 간선 배열 생성
		visit = new int[N+1]; // 방문 배열 생성
		for(int i =1; i<=M; i++){
			st = new StringTokenizer(br.readLine()); // 간선의 양 끝 점 입력
			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());
			map[v1][v2] = map[v2][v1] = 1; // 그래프 간선 연결
		}
		for(int i = 1 ; i<=N; i++){
			if(visit[i] != 1){ // 방문한적 없는 정점이면
				DFS(i); // 해당 정점에서 탐색 시작
				cnt++; // 연결 요소 개수 증가시켜줌
			}
		}
		System.out.println(cnt);
		br.close();
	}
}