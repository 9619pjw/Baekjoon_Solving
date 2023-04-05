import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Long> pq = new PriorityQueue<>((o1, o2)->{
			return o1 > o2 ? 1 : -1; // 오름차순 정렬
		}); 
		st = new StringTokenizer(br.readLine());
		
		for(int i =0; i<N; i++){
			pq.add(Long.parseLong(st.nextToken())); // 큐에 숫자를 넣음
		}

		for(int i =0; i<M ; i++){
			long x = pq.poll(); 
			long y = pq.poll();
			long result = x + y; // 가장 작은 수 두개를 꺼내어 합체
			pq.add(result);
			pq.add(result); // 합체한 값을 두개 넣어줌
		}

		long sum = 0;
		while(!pq.isEmpty()){
			sum += pq.poll(); // 큐가 빌때까지 내용물을 꺼내어 합해줌
		}

		System.out.println(sum);
		br.close();
	}
}