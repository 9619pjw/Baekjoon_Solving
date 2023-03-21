import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		// 우선순위 큐의 정렬기준 재정의
		PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
			int first_value = Math.abs(o1);
			int second_value = Math.abs(o2);
			if (first_value == second_value) { // 절댓값이 같다면
				return o1 > o2 ? 1 : -1; // 음수 우선 정렬함
			} else {
				return first_value - second_value;
			}
		});

		for (int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(br.readLine());
			if (tmp == 0) { // 입력값이 0이면
				if (pq.isEmpty()) { // 큐가 비어있으면 0출력
					System.out.println("0");
				} else { // 큐에 내용물 있으면 꺼냄
					System.out.println(pq.poll());
				}
			} else {
				pq.add(tmp); // 큐에 입력값 추가
			}
		}
		br.close();
	}
}