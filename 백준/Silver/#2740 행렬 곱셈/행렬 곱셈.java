import java.util.*;
import java.io.*;

class Main{
    static int N;
    static int M;
    static int K;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken()); // 행렬의 행, 열
        int[][] A = new int[N][M];
        
        for(int i = 0 ; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<M ;j++){
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int[][] B = new int [M][K];
        
        for(int i = 0 ; i<M; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<K ;j++){
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int [][] result = new int[N][K]; // 결괏값을 담을 행렬
        
        for(int i = 0; i<N; i++){
            for(int j =0; j<K; j++){
                int sum = 0;
                for(int k=0; k< M; k++){
                    sum += A[i][k] * B[k][j];
                    result[i][j] = sum;
                }
            }
        }

        for(int i =0; i<N; i++){
            for(int j =0; j<K; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        br.close();
    }
}