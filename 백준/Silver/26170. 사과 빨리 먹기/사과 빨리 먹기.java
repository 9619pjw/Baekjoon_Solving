import java.util.*;
import java.io.*;

class Main{
    final static int INF = 987654321;
    static int [][] map = new int[6][6]; // 보드
    static int [][] visit = new int[6][6]; // 방문여부
    static int R; //현재 위치 x좌표
    static int C; //현재 위치 y좌표
    
    static int dx[] = {-1,1,0,0}; // 좌우 이동
    static int dy[] = {0,0,-1,1}; // 상하 이동
    static int cnt = INF; // 이동횟수

     public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 1; i<6; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 1; j<6; j++){
                map[i][j] = Integer.parseInt(st.nextToken()); // 사과 위치 입력
            }
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        visit[R+1][C+1] = 1; // 1씩 더해주어 배열위치 맞춰줌
        
        dfs(R+1,C+1,0); // 탐색 시작

        if(cnt == INF) // 현재 위치에서 사과를 찾을 수 없을 경우
            System.out.println(-1);
        else
            System.out.println(cnt - 1);
    }
    static void dfs(int x, int y, int apple){
        if(apple == 3){ // 사과 3개 발견시,
            cnt = Math.min(cnt, visit[x][y]); // 최소 이동거리 cnt에 저장
            return;
        }

        for(int i =0; i<4; i++){
            int nx = x + dx[i]; 
            int ny = y + dy[i]; // 상하좌우 이동

            if(nx<=0 || ny<=0 || nx >= 6|| ny>= 6) // 범위를 벗어나는 값일 경우
                continue;   // 다시 반복
            if(visit[nx][ny] != 0) // 방문한적 있으면
                continue;   // 다시 반복
            if(map[nx][ny] == -1) // 장애물 존재시
                continue;         // 다시 반복
            
            visit[nx][ny] = visit[x][y] + 1; // 이동횟수 1 추가
            if(map[nx][ny] == 1) // 사과 발견 시
                dfs(nx,ny,apple+1); // 사과 추가해주고 계속 탐색
            else                    // 사과 미발견 시
                dfs(nx,ny,apple); // 계속 탐색진행
            visit[nx][ny] = 0; // 경로 초기화 
        }
    }
}