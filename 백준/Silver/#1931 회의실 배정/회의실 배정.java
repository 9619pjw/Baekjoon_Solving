import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int A[][] = new int[N][2]; // 회의정보 담을 배열
		
		for(int i = 0; i < N; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			A[i][0] = Integer.parseInt(st.nextToken()); // 시작 시간
			A[i][1] = Integer.parseInt(st.nextToken()); // 종료 시간
		}

		// 현재 회의의 종료시간이 빠를수록 다음 회의와 겹치지 않을 확률이 높아짐
		// 종료시간이 빠른 순서대로 정렬 후 겹치지 않는 회의실을 적절히 선택함
		Arrays.sort(A, new Comparator<int[]>(){
			@Override
			public int compare(int[] S, int[] E) {
				if(S[1] == E[1]) // 종료시간이 같은 경우, 시작시간을 비교함
					return S[0] - E[0];
			return S[1] - E[1]; // 종료시간을 비교하여 어떤걸 배치할지 결정
			}
		});

		int cnt = 0; // 회의 횟수
		int end = -1;
		for(int i = 0; i < N; i++){
			if(A[i][0] >= end){ // 겹치지 않는 다음 회의가 나온 경우
				end = A[i][1]; // 종료시간 갱신
				cnt++; // 회의 개수 증가
			}
		}
		System.out.println(cnt);
		br.close();
	}
}