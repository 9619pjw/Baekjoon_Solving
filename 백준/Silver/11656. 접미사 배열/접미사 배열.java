import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.StringBuilder;
import java.util.Arrays;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] s = br.readLine().split(""); // 문자열 입력
		String[] answer = new String[s.length];		

		for(int i =0; i<s.length; i++){
			StringBuilder sb = new StringBuilder();
			for(int j =i; j<s.length; j++){ // 0부터 입력받은 문자열 길이까지 진행
				sb.append(s[j]); // StringBuilder에 s[j] 추가함. 맨앞의 한글자씩 줄어듬
			}
			answer[i] = sb.toString(); // StringBuilder로 저장받은것 문자열로 바꿔서 저장
		}

		Arrays.sort(answer);	// answer 정렬

		for(String str : answer){
			bw.write(str + "\n");	// answer 출력
		}

		bw.flush();
		bw.close();
		br.close();
	}
}