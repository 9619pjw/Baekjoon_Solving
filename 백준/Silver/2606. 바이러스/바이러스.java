import java.util.Scanner;

public class Main {
	static int[][] arr;
	static boolean[] virused; // 감염된 컴퓨터 나타냄
	static int N; // 컴퓨터 개수
	static int numNet; // 컴퓨터 쌍의 개수
	static int cnt = -1; // 1번 컴퓨터를 제외한 방문 횟수
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); 
		numNet = sc.nextInt();
		arr = new int[N+1][N+1]; 
		virused = new boolean[N+1];
		for(int i = 0; i<numNet; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a][b] = arr[b][a] = 1;
		}
		dfs(1); // 1번 컴퓨터부터 탐색 시작
		for(int i = 0; i<virused.length; i++) {
			if(virused[i]) { // 감염됐을 경우
				cnt++;	// cnt 증가
			}
		}
		System.out.println(cnt);
	}
	static void dfs(int start) {
		virused[start] = true; // 감염된 pc
		for(int i = 1; i<N+1; i++) {
			if(arr[start][i] == 1 && !virused[i]) { // 간선이 연결됐고 감염이 안됐으면 
					virused[i] = true; // 감염상태로 바꿔줌
					dfs(i); // 계속 탐색함
				}
			}
		}
}
