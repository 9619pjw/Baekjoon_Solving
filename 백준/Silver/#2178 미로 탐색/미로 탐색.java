import java.util.*;
import java.io.*;

class Main{
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static boolean[][] visited;
    static int[][] A;
    static int N, M;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        A = new int[N][M];
        visited = new boolean[N][M]; // 방문 기록 저장 배열

        for(int i =0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken(); // 미로생성
            for(int j =0; j<M; j++){
                A[i][j] = Integer.parseInt(line.substring(j, j+1)); // 입력받은 문자열을 잘라서 배열에 저장함
            }
        }
        BFS(0,0); // 탐색 시작
        System.out.println(A[N-1][M-1]); //지나야 하는 최소 칸 수 출력함
        br.close();
    }

    public static void BFS(int i, int j){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {i, j}); // 시작 노드 큐에 삽입
        while(!queue.isEmpty()){
            int now[] = queue.poll(); // 큐에서 노드 데이터 가져옴
            visited[i][j] = true; // 방문한 노드로 표시

            for(int k =0; k<4; k++){
                int x = now[0] + dx[k];
                int y = now[1] + dy[k]; // 상하좌우 탐색

                if(x>=0 && y>=0 && x<N && y<M){ // 좌표 유효성 검증
                    if(A[x][y] != 0 && !visited[x][y]){ // 갈수 있는 칸 & 방문여부 검사
                        visited[x][y] = true; // 방문 표시함
                        A[x][y] = A[now[0]][now[1]] +1; // 깊이 업데이트
                        queue.add(new int[] {x, y}); // 큐에 데이터 삽입
                    }
                }
            }
        }
    }
}