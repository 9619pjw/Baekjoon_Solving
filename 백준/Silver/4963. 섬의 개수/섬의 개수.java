import java.util.*;
import java.io.*;

class Main {
    static int map[][];
    static boolean visited[][];
    static int W, H;
    // 8방향 이동
    static int dx[] = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int dy[] = {-1, 0, 1, -1, 1, -1, 0, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while(true){
            st = new StringTokenizer(br.readLine());
            W = Integer.parseInt(st.nextToken());
            H = Integer.parseInt(st.nextToken());

            if(W == 0 && H == 0) break;
            
            map = new int[H][W];
            visited = new boolean[H][W];
            int ans = 0;

            // 지도 입력받기
            for(int i = 0; i < H; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < W; j++){
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for(int i = 0; i < H; i++){
                for(int j = 0; j < W; j++){
                     // 방문하지 않은 육지의 경우
                    if(!visited[i][j] && map[i][j] == 1){
                        dfs(i,j);
                        ans++;
                    }

                }
            }
            // 결과물 출력
            System.out.println(ans);
        }
        br.close();
    }

    public static void dfs(int x, int y){
        visited[x][y] = true;

        for(int i = 0; i < 8; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            // out of range
            if(nx < 0 || ny < 0 || nx >= H || ny >= W ) continue;

            if(map[nx][ny] == 1 && !visited[nx][ny])
                dfs(nx, ny);
        }
    }
}