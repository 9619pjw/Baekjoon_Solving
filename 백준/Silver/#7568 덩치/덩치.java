import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2]; // 몸무게와 키를 저장할 배열
        int rank[] = new int[N]; // 등수를 저장할 배열
        for(int i =0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken()); // 몸무게
            arr[i][1] = Integer.parseInt(st.nextToken()); // 키
            rank[i] = 1; // 랭크는 1로 초기화
        }
        
        for(int i =0; i<N; i++){
            for(int j = 0; j<N; j++){
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){ // 덩치가 작은사람의 등수를 증가시킴
                    rank[i]++;
                }
            }
        }
        for(int i =0; i<N; i++){
            System.out.println(rank[i]);
        }
        br.close();
    }
}