import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스 입력
		while(T-- > 0){
			StringTokenizer st = new StringTokenizer(br.readLine());

			int N = Integer.parseInt(st.nextToken()); // 문서의 개수
			int M = Integer.parseInt(st.nextToken()); // 몇번째로 인쇄되었는지 궁금한 문서가 현재 Queue에서 몇번째에 놓여있는지
			
			LinkedList<int[]> q = new LinkedList<>();  // 큐 구현
			st = new StringTokenizer(br.readLine());
			for(int i =0; i<N; i++){ // {초기위치, 중요도} 형식으로 큐에 저장
				q.offer(new int[] {i, Integer.parseInt(st.nextToken())}); 
			}

			int cnt = 0;

			while (!q.isEmpty()){
				int[] front = q.poll(); // 큐에서 첫번째로 뽑은 원소
				boolean isMax = true; // front 원소가 가장 큰 원소인지 판별하는 변수

				for(int i = 0; i < q.size(); i++){ // 큐에 남아있는 원소들과 중요도를 비교
					if(front[1] < q.get(i)[1]){ // 첫번째로 뽑은 원소의 중요도 < 큐에 있는 i번째 원소의 중요도
						q.offer(front);			// 뽑은 원소와 i 이전의 원소들을 뒤로 보냄
						for(int j =0; j<i; j++){
							q.offer(q.poll());
						}
						isMax = false; // front 원소가 가장 큰 원소가 아니였으므로 탐색 마침
						break;
					}
				}
				if(isMax == false){	 // front 원소가 가장 큰 원소가 아니므로 다시 반복
					continue;
				}

				cnt++;
				if(front[0] == M) // 찾고자 하는 원소면 해당 테스트 케이스 종료함
					break;
			}
			sb.append(cnt).append('\n');
		}
		System.out.println(sb);
		br.close();
	}
}