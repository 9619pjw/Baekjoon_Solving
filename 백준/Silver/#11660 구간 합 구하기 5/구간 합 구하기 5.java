import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <= N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        } // 2차원 배열 저장

        int D[][] = new int[N + 1][N + 1]; // 구간 합 저장할 배열 생성

        for (int i = 1; i <= N; i++) { // 구간 합 배열
            for (int j = 1; j <= N; j++) {
                D[i][j] = D[i][j - 1] + D[i - 1][j] - D[i - 1][j - 1] + arr[i][j];
            }
        }

        for (int i = 0; i < M; i++) { // 구간 합 출력
            st = new StringTokenizer(br.readLine(), " "); // 좌표값 입력받아서 출력
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int result = D[x2][y2] - D[x1 - 1][y2] - D[x2][y1 - 1] + D[x1 - 1][y1 - 1];
            System.out.println(result);
        }
        br.close();
    }
}
/*
============================================    
                    입력
============================================  
4 3		// 표의 크기 4 합을 구해야하는 횟수 3
1 2 3 4
2 3 4 5
3 4 5 6
4 5 6 7	// 표에 들어갈 숫자들
2 2 3 4	// (2,2) 부터 (3,4)까지 합침 
3 4 3 4	// (3,4) 부터 (3,4)까지 합침 
1 1 4 4	// (1,1) 부터 (4,4)까지 합침

============================================    
                    출력
============================================  
27
6
64
*/
