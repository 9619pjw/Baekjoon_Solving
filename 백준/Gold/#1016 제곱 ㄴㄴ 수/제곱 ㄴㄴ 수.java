import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long min = Long.parseLong(st.nextToken());
        long MAX = Long.parseLong(st.nextToken());
        long diff = MAX - min + 1;
        boolean[] check = new boolean[(int)diff]; // min 과 MAX 사이에 제곱수 판별 배열

        for(long i = 2; i*i <= MAX; i++){ // 2의 제곱인 4부터 MAX보다 작은 값까지 반복
            long pow = i*i;  // 제곱수
            long start_index = min / pow;

            if(min % pow != 0) // 나머지가 존재시
                start_index++; // 1을 더해 min보다 큰 제곱수에서 시작됨.
            
            for(long j = start_index; pow * j <= MAX; j++){ // 제곱수를 true로 변경
                check[(int) ((j * pow) - min)] = true;
            }
        }

        int cnt = 0;    // 제곱수가 아닌 수 카운트
        for(int i = 0; i < diff; i++){ // check 배열에서 제곱이 아닌수 찾기
            if(!check[i])
                cnt++;
        }
        System.out.println(cnt);
        br.close();
    }    
}
