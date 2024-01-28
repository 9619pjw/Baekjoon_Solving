import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine()); // 조약돌 색상 수
        int stones[] = new int[M]; // 각 색상별 조약돌 수
        int totalcnt = 0; // 조약돌 총 개수

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i<M; i++){
            stones[i] = Integer.parseInt(st.nextToken());
            totalcnt += stones[i];
        }
        int K = Integer.parseInt(br.readLine()); // 몇번 뽑을지 선택

        // 가능한 모든 경우의 수
        double totalSituation = 1;
        for(int i =0; i<K; i++){
            totalSituation *= (totalcnt - i);
        }

        // 같은 색상이 나오는 경우의 수
        double sum = 0;
        for(int i =0; i < M; i++){
            if(stones[i] < K) continue; // 목표 개수보다 작으면 SKIP

            double tmp = 1;             // 경우의 수 구해서 합하기
            for(int j =0; j < K; j++){
                tmp *= (stones[i] - j);
            }
            sum += tmp;
        }
        System.out.println(sum / totalSituation);
        br.close();
    }
}