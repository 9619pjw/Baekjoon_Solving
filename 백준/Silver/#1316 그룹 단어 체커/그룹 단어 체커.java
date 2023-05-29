import java.util.*;
import java.io.*;
 
class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		int count = 0;
		int N = Integer.parseInt(br.readLine());
 
		for (int i = 0; i < N; i++) {
			if (check()) {
				count++;
			}
		}
		System.out.print(count);
	}
 
	public static boolean check() throws IOException {
		boolean[] check = new boolean[26];
		int prev = 0;
		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			int now = str.charAt(i); // i번째 문장 저장
			
			
			if (prev != now) { // 앞선 문자와 i번째 문자가 다를 경우,
				if (!check[now - 'a']) { // 해당 문자가 처음 나올경우
					check[now - 'a'] = true;
					prev = now;	
				}
				else { // 해당 문자가 이미 나온적이 있는 경우
					return false;	
				}
			}
		}    
		return true;
	}
}