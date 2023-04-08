import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for(int i =0 ; i<N; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j<N; j++){
				int num = Integer.parseInt(st.nextToken()); // 우선순위 큐에 넣음
				pq.offer(num);
				 // 뽑아야하는 위치가 N-1번째 값이므로 
				 //우선순위 큐의 크기가 N보다 크면 맨앞의 값은 선택이 되질 않음
				if(pq.size()>N)
					pq.poll();
			}
		}
		System.out.println(pq.poll());
		br.close();
	}
}