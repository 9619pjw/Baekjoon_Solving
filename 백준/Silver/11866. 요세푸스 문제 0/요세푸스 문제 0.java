import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		Queue<Integer> q = new LinkedList<>();

		for(int i =0; i<N; i++){
			q.add(i+1); // 큐에 1부터 N까지 넣어줌
		}
		System.out.print("<");
		while(N-- >0){ // N명의 사람이 모두 제거될때 까지 계속 반복함
			for(int i =0; i<K; i++){
				if(i == K-1){ // K번째 사람 발견 시
					if(N == 0) // N == 0이면 큐를 비워줌
						System.out.print(q.poll());
					else // N != 0이면 큐의 내용물을 꺼내어 나열함
						System.out.print(q.poll() + ", ");
				}else{
					q.add(q.poll()); // K번째 사람이 아닌 경우 다시 큐에 삽입함 
				}
			}
		}
		System.out.print(">");
	}
}