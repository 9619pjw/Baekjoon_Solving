import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine()); // 수열의 크기
		int[] A = new int[N]; // 수열 배열
		int[] result = new int[N]; // 결과값 배열
		StringTokenizer s = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(s.nextToken()); // 입력값 수열에 저장
		}

		Stack<Integer> st = new Stack<>();
		st.push(0);// 처음에는 항상 스택이 비어있으므로 최초값을 push해 초기화함

		for (int i = 1; i < N; i++) {
			while (!st.isEmpty() && A[st.peek()] < A[i]) { // 스택이 비어있지 않고 현재 수열이 스택 top 인덱스가 가리키는 수열보다 큰 경우
				result[st.pop()] = A[i]; // 정답 배열에 오큰수를 현재 수열로 저장
			}
			st.push(i); // 신규 데이터 push
		}
		while (!st.empty()) { // 반복문 종료 후 스택 비우는 작업
			result[st.pop()] = -1;
		}

		for (int i = 0; i < N; i++) {
			bw.write(result[i] + " "); // 결과값 출력함
		}
		bw.flush();
		bw.close();
		br.close();
	}
}