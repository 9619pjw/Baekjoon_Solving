import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int sum = 0;
		ArrayList<Integer> number = new ArrayList<Integer>(1002);
	
		for(int i = 1; i <= B; i++){ // 수열 생성
			if(number.size() > B) 
				break;
			for(int j = 1; j <= i; j++){
				number.add(i);
				if(number.size() > B)
					break;
			}
		}

		for(int i = A-1; i < B; i++){ // 누적합 구함
			sum += number.get(i);
		}
		System.out.println(sum);
		br.close();
	}
}