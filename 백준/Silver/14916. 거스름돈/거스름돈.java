import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int N = Integer.parseInt(br.readLine());
		int result = 0;

		while(true){
			if(N % 5 == 0){ // 5로 나누어떨어질 경우
				result += N / 5;
				System.out.println(result);
				break;
			} else {  // 5로 안나누어떨어지면 2를 뺀다
				N -= 2;
				result++;
			}

			if(N < 0){
				System.out.println(-1);
				break;
			}
		}
        br.close();
    }
}