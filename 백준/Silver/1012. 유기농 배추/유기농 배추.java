import java.io.*;
import java.util.*;

class Main{
    static int[][] map;   // 경로
    static int[][] bugged; // 벌레먹은 사과
    static int T; // 테스트 케이스
    static int M; // 가로길이
    static int N; // 세로길이
    static int K; // 위치개수
    static int cnt; // 벌레개수

    static int dx[] = {1,-1,0,0}; // 좌우 이동
    static int dy[] = {0,0,1,-1}; // 상하 이동
   
    static void dfs(int x, int y){
        bugged[x][y] = 1; // 벌레먹음

        int nx, ny;
        for(int i =0; i<4; i++){   //인접한 사과 감염됐는지 확인
            nx = x + dx[i];
            ny = y + dy[i];

            if(nx<0 || ny<0 || nx >=N || ny>= M) // 범위를 벗어나는 값일 경우
                continue;   // 다시 반복
            if(map[nx][ny] == 1 && bugged[nx][ny]==0) {// 경로 연결 & 벌레감염 안됐을때
                dfs(nx,ny); // 계속 탐색함
            }
      
        }
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수 입력
        for(int i =1; i<=T; i++){
            String s[] = br.readLine().split(" ");
            M = Integer.parseInt(s[0]); // 가로 입력
            N = Integer.parseInt(s[1]); // 세로 입력
            K = Integer.parseInt(s[2]); // 사과 개수 입력
			
            map = new int[N][M];
            bugged = new int[N][M];

            for(int j =0; j<K; j++){ // 사과 위치 지정
                String s2[] = br.readLine().split(" ");
                int x = Integer.parseInt(s2[0]);
                int y = Integer.parseInt(s2[1]);

                map[y][x] =  1; // 경로 연결
            }
            cnt = 0;
            for(int j =0; j<N; j++){ 
                for(int k =0; k<M; k++){
                    if(map[j][k] == 1 && bugged[j][k] == 0){ //경로연결 && 벌레 감염 안됐을 경우
                        dfs(j,k);   // 계속 탐색 진행
                        cnt++;     // 벌레 추가함
                    }
                }
            }
            System.out.println(cnt); // 벌레개수 출력
        }
        br.close();
    }
}