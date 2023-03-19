import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); // 출력할 결과물 저장

		Stack<Integer> st = new Stack<Integer>();

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int start = 1; // 시작점
		boolean result = true;

		for (int i = 0; i < arr.length; i++) {
			int a = arr[i]; // 현재 수열의 수
			if (a >= start) { // 현재 수열의 값 >= 오름차순 자연수 ... 값이 같아질때까지 push
				while (a >= start) {
					st.push(start++);
					sb.append("+\n");
				}
				st.pop();
				sb.append("-\n");
			} else { // 현재 수열의 값 < 오름차순 자연수 ... pop연산으로 원소 꺼냄
				int n = st.pop();
				if (n > a) { // pop 결과값이 현재 수열의 수보다 크면
					System.out.println("NO"); // NO 출력
					result = false;
					break;
				} else {
					sb.append("-\n");
				}
			}
		}
		if (result)
			System.out.println(sb.toString());
		br.close();
	}
}