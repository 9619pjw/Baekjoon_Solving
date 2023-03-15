/*
 * 
방향 그래프가 주어지면 
주어진 시작점에서 다른 모든 정점으로의 최단경로를 구하는 프로그램
===================================================
                    입력                           
===================================================
5 6		    // 정점의 개수 V 간선의 개수 E
1		    // 시작 정점의 번호
5 1 1		// u에서 v로 가는 가중치 w인 간선 생성
1 2 2
1 3 3
2 3 4
2 4 5
3 4 6
===================================================
                    출력
===================================================
0	// i번째 줄에 i번 정점으로의 최단 경로의 경로값을 출력. 
2   // 시작점 본인은 0, 경로없으면 INF 
3
7
INF
*
*/
import java.util.*;
import java.io.*;

class Main {
    static int V, E, K; // 노드 개수, 간선 개수, 출발 노드
    static int dist[]; // 거리 배열
    static boolean visited[]; // 방문 표시 배열
    static ArrayList<Edge> list[]; // 그래프 정보 저장
    static PriorityQueue<Edge> q = new PriorityQueue<Edge>(); // 최단거리 저장

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        V = Integer.parseInt(st.nextToken()); // 노드 개수
        E = Integer.parseInt(st.nextToken()); // 간선 개수
        K = Integer.parseInt(br.readLine()); // 출발 노드
        dist = new int[V + 1]; // 거리 배열 생성
        visited = new boolean[V + 1]; // 방문 표시 배열 생성
        list = new ArrayList[V + 1]; // 그래프 정보 저장하는 인접리스트 생성

        for (int i = 1; i <= V; i++) {
            list[i] = new ArrayList<Edge>(); // 그래프 저장하는 인접리스트 초기화
        }
        for (int i = 0; i <= V; i++) {
            dist[i] = Integer.MAX_VALUE; // 거리 배열 초기화
        }

        for (int i = 0; i < E; i++) { // 가중치가 있는 인접리스트 초기화
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            list[u].add(new Edge(v, w)); // u에서 v로 가는 가중치 w인 간선 생성
        }
        q.add(new Edge(K, 0)); // K를 시작점으로 설정
        dist[K] = 0;            // 시작점의 거리는 0
        while (!q.isEmpty()) { // 큐가 빌때까지 반복
            Edge current = q.poll(); // 큐에서 현재 노드를 뺌
            int c_v = current.vertex; // 현재 선택된 노드
            if (visited[c_v]) // 현재 선택된 노드가 방문된 적이 있으면 큐에 넣지않음
                continue;
            visited[c_v] = true; // 방문했음으로 변경

            for (int i = 0; i < list[c_v].size(); i++) { // 현재 선택된 노드의 간선 개수만큼 반복
                Edge tmp = list[c_v].get(i); // 현재 노드를 임시변수에 저장
                int next = tmp.vertex; // 타겟 노드 정보 업데이트 
                int value = tmp.value;
                // 최소 거리 업데이트
                if (dist[next] > dist[c_v] + value) { // 타겟 노드 최단거리 > 타겟 노드 방문 전 & 현재 선택된 노드 최단거리+비용
                    dist[next] = value + dist[c_v]; // 타겟 노드에 최단 거리 업데이트
                    q.add(new Edge(next, dist[next])); // 우선순위 큐에 타겟 노드 추가함
                }
            }
        }
        for (int i = 1; i <= V; i++) { // 완성된 거리 배열을 탐색 후 출력
            if (visited[i])
                System.out.println(dist[i]);
            else
                System.out.println("INF");
        }
        br.close();
    }
}

class Edge implements Comparable<Edge> {
    int vertex; // 가리키는 노드
    int value; // 간선의 가중치

    Edge(int vertex, int value) {
        this.vertex = vertex;
        this.value = value;
    }

    public int compareTo(Edge e) { // 우선순위 큐 정렬 기준을 위해 compareTo 함수 구현
        if (this.value > e.value)
            return 1;
        else
            return -1;
    }
}