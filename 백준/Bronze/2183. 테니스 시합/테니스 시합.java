import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	public static int N;
	
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st = new StringTokenizer(br.readLine());
		 N = Integer.parseInt(st.nextToken());	//인원 수 N
		 StringBuilder sb = new StringBuilder();
		 sb.append(st.nextToken());
		 //승리 조건을 만족하면 게임 종료 
		 //-> 마지막 게임 승리자가 최종승자
		 System.out.println(sb.charAt(sb.length()-1));

	}
	
	

}