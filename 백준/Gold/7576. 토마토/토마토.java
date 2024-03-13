import java.io.*;
import java.util.*;

class Main {

    static int[][] tomato;
    static int N, M;
    static int[] dx = { -1, 1, 0, 0 }; //x방향배열-상하
    static int[] dy = { 0, 0, -1, 1 }; //y방향배열-좌우

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        tomato = new int[N][M];

        int cnt = 0, days = 0;

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                tomato[i][j] = Integer.parseInt(st.nextToken());
                if(tomato[i][j] == 1) queue.add(new int[] {i, j});
                else if(tomato[i][j] == 0) cnt++;
            }
        }

        while (cnt > 0 && !queue.isEmpty()) {
            for (int i = queue.size(); i > 0; i--) {
                int[] now = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int ny = now[0] + dy[j];
                    int nx = now[1] + dx[j];
                    if (ny < 0 || nx < 0 || ny >= N || nx >= M || tomato[ny][nx] != 0) {
                        continue;
                    }
                    cnt--;
                    tomato[ny][nx] = 1;
                    queue.add(new int[]{ny, nx});
                }
            }
            days++;
        }
        if(cnt == 0) {
            System.out.println(days);
        } else System.out.println(-1);
    }
}