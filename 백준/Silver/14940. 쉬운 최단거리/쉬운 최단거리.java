import java.io.*;
import java.util.*;

class Main {
    static int arr[][];         // 지도
    static int result[][];      // 거리
    static boolean visited[][]; // 방문 여부
    static int N, M;
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        result =  new int[N][M];
        visited = new boolean[N][M];

        int x = 0;
        int y = 0;

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 2){ // 목표 지점
                    x = i;
                    y = j;
                }else if(arr[i][j] == 0){ // 갈 수 없는 땅
                    visited[i][j] = true; 
                }
            }
        }
        
        bfs(x,y);

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(!visited[i][j]) // 도달할 수 없는 위치
                    result[i][j] = -1;
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        br.close();
    }

    public static void bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y});
        visited[x][y] = true;

        while(!queue.isEmpty()){
            int tmp[] = queue.poll();
            for(int i = 0; i < 4; i++){ // 상하좌우 이동
                int a = tmp[0] + dx[i];
                int b = tmp[1] + dy[i];

                if(a >= 0 && a < N && b >= 0 && b < M){   // 범위 검사
                    if(!visited[a][b] && arr[a][b] == 1){ // 아직 방문 안한곳이면 이동함
                        visited[a][b] = true;
                        result[a][b] = result[tmp[0]][tmp[1]]+1;
                        queue.add(new int[] {a, b});
                    }
                }
            }
        }
    }
}