import java.math.BigInteger;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger N = new BigInteger(br.readLine());
        BigInteger left = BigInteger.ONE; // left = 1
        BigInteger right = N;             // right = N
        BigInteger n = BigInteger.ONE;
        
        while(n.compareTo(N)!= 0){ // n과 N이 같아질때까지 반복
            n = left.add(right).divide(BigInteger.TWO); // 중간값 구하기
            if(n.pow(2).compareTo(N) == 0){ // n의 제곱 == N일 경우 종료
                break;
            }else if(n.pow(2).compareTo(N) == 1){ // n의 제곱 > N일 경우,  
                right = n; // right = n으로 조정
            }else if(n.pow(2).compareTo(N) == -1){ // n의 제곱 < N일 경우, 
                left = n; // left = n으로 조정
            }
        }
        System.out.println(n);
        br.close();
    }
}