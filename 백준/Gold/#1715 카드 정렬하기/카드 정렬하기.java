import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>(); // 우선순위 큐에 오름차순으로 데이터 삽입

		for(int i = 0; i < N; i++){ // 작은 카드부터 합해나가야 가장 효율적인 비교가 가능하다.
			int data = Integer.parseInt(br.readLine());
			pq.add(data);
		}
		int tmp = 0;  // 우선순위 큐에서 뺀 값 저장할 임시 변수 선언
		int tmp2 = 0; // 우선순위 큐에서 뺀 값 저장할 임시 변수 선언
		int sum = 0; // 누적 합

		while(pq.size() != 1){ // 우선순위 큐 사이즈가 1이 될 때까지
			tmp = pq.poll(); 
			tmp2 = pq.poll(); 
			sum += tmp + tmp2; 
			pq.add(tmp+tmp2); // 더해준 값 다시 우선순위 큐에 삽입함
		}

		System.out.println(sum);
		br.close();
	}
}