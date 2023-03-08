import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int cnt = 0; // 소수의 개수

        while(st.hasMoreTokens()){ // 모든 토큰을 확인할 때까지 계속 진행함
            boolean isPrimeNum = true;
            int num = Integer.parseInt(st.nextToken());

            if(num == 1)
                continue; // 1은 소수에서 제외
            
            for(int i =2; i<= Math.sqrt(num); i++){
                if(num % i == 0){ // 1을 제외한 숫자로 나누어떨어지면
                    isPrimeNum =false; // 소수 아님.
                    break;
                }
            }
            if(isPrimeNum){ // 소수일 경우, cnt 증가
                cnt++;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}