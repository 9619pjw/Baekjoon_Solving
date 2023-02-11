import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int result = 0;

        for(int i =1; i<N; i++){
            int num = i; // 1부터 N까지의 숫자 
            int sum = 0;

            while(num !=0){
                sum += num%10; // 각 자릿수 더하기
                num /= 10;
            }
            
            if(sum + i == N){ // i값과 각 자릿수 누적합이 같을 경우 (생성자를 찾았을 경우)
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}