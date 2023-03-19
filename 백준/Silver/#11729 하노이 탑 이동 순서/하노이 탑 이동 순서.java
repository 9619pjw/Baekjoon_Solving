import java.util.*;
import java.io.*;

class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int start = 1; // 출발지
	static int temp = 2; // 임시막대
	static int end = 3; // 도착지

	public static void main(String[] args) throws IOException {

		int N = Integer.parseInt(br.readLine());
		bw.write((int) Math.pow(2, N) - 1 + "\n"); // 이동횟수 출력
		hanoi(N, start, end, temp);
		bw.flush();
		bw.close();
		br.close();
	}

	public static void hanoi(int a, int st, int ed, int tmp) throws IOException { // 원반개수, 출발지, 도착지, 임시장소

		if (a == 1) { // 원반의 개수가 한개라면
			bw.write((String.format("%d %d \n", st, ed))); // 바로 도착지로 옮김
			return;
		} else {
			hanoi(a - 1, st, tmp, ed); // a-1개의 원반을 임시장소에 저장
			bw.write(String.format("%d %d \n", st, ed)); // 가장 큰 마지막 하나를 도착지에 저장
			hanoi(a - 1, tmp, ed, st); // a-1개의 원반을 도착지에 저장
		}
	}
}