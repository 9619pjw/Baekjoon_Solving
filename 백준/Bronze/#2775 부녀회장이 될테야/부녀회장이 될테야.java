import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스
		int[][] room = new int[15][15];
		
		for (int i = 0; i < T; i++) {
			int f = Integer.parseInt(br.readLine()); // 층 수
			int n = Integer.parseInt(br.readLine()); // 호 수
			
			for (int j = 1; j <= n; j++) {
				room[0][j] = j;
			}
			for (int j = 1; j <= f; j++) {
				for (int k = 1; k <= n ; k++) {
					room[j][k] = room[j][k - 1] + room[j - 1][k];
				}
			}
			System.out.println(room[f][n]);
		}
	}
}