import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int x[][] = new int[N][2]; 
	
		for(int i =0; i<N; i++){ // 좌표값 입력받음
			String s[] = br.readLine().split(" ");
			x[i][0] = Integer.parseInt(s[0]);
			x[i][1] = Integer.parseInt(s[1]);
		}
		Arrays.sort(x, new Comparator<int[]>(){
			@Override // 정렬방식 재정의
			public int compare(int[] o1, int[] o2){
				if(o1[0] == o2[0]) // x 좌표가 같을 경우 y좌표 비교함
					return o1[1] - o2[1];
				else
					return o1[0]-o2[0];
			}
		});

		for(int i =0; i< N; i++){
			System.out.println(x[i][0] + " "+ x[i][1]);
		}

		br.close();
	}
}