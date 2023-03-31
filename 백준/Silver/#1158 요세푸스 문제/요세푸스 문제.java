import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		Queue<Integer> q = new LinkedList<>();
		for(int i =0; i<N; i++){
			q.add(i+1); // 큐에 주어진 사람만큼 넣어둠
		}

		System.out.print("<");
		while(N-- > 0){ // 큐가 빌때까지 계속 반복
			for(int i =0; i<K; i++){
				if(i == K-1){ // K번째 사람 발견 시
					if(N == 0) // N = 0이면 큐를 비움
						System.out.print(q.poll());
					else  // N != 0이면 큐의 내용물을 나열
						System.out.print(q.poll() + ", ");
				}else{
					q.add(q.poll()); // K번째 사람이 아니면 다시 큐에 삽입함
				}
			}
		}
		System.out.print(">");
		br.close();
	}
}