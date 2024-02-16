import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int M;
    static char arr[][]; // 타일 배열
    static boolean visited[][]; // 방문 배열
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new char[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i < N; i++){
            String s = br.readLine();
            for(int j = 0; j < M; j++){
                arr[i][j] = s.charAt(j);
            }
        }
        int cnt = 0;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(!visited[i][j]){ // 방문하지 않은 경우
                    if(arr[i][j] == '-'){ // - 모양이면 가로로 탐색
                        dfsWeight('-', i, j);
                    }else{ // | 모양이면 세로로 탐색
                        dfsHeight('|', i, j);
                    }
                    cnt++;
                }
            }
        }


        bw.write(cnt + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
    public static void dfsWeight(char c, int x, int y){
       if(c != '-')
           return;

       visited[x][y] = true;

       if(y + 1 >= M)
           return;

       dfsWeight(arr[x][y+1], x, y+1);
    }

    public static void dfsHeight(char c, int x, int y){
        if(c != '|')
            return;

        visited[x][y] = true;

        if(x + 1 >= N)
            return;

        dfsHeight(arr[x+1][y], x+1, y);
    }
}