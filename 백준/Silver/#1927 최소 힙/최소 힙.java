import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 연산의 개수 입력

		PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2)->{
			return o1 > o2 ? 1 : -1; // 정렬 기준 재정의
		});

		for(int i =0; i<N; i++){
			int tmp = Integer.parseInt(br.readLine());
			if(tmp == 0){ // 입력값이 0 인경우
				if(pq.isEmpty()){ // 큐가 비어있을 경우 0, 내용물이 있을 경우 가장 작은 값을 출력 
					System.out.println("0"); 
				}else{
					System.out.println(pq.poll());
				}
			}else{
				pq.add(tmp);
			}
		}
		br.close();
	}
}