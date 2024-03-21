import java.util.*;
import java.io.*;

class Main {
    static char map[][];
    static int T, W, H;
    static int ans;
    // 4방향 이동
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());
            
            W = Integer.parseInt(st.nextToken());
            H = Integer.parseInt(st.nextToken());
            
            map = new char[W][H];

            // 지도 정보 입력
            for(int j = 0; j < W; j++){
                String str = br.readLine();
                map[j] = str.toCharArray();
            }

            ans = 0;
            for(int j = 0; j < W; j++){
                for(int k = 0; k < H; k++){
                    if(map[j][k] == '#'){
                        ans++;
                        dfs(j, k);
                    }
                }
            }
            System.out.println(ans);
        }
        br.close();
    }

    public static void dfs(int x, int y){
        // 방문한 곳 .로 변경해줌
        map[x][y] = '.';

        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(isIn(nx, ny) && map[nx][ny] == '#')
                dfs(nx, ny);
        }
    }

    // 범위 검사
    public static boolean isIn(int nx, int ny){
        return nx >= 0 && nx < W && ny >=0 && ny < H;
    }
}