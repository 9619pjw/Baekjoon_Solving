import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i =0; i<a; i++) {
			int sum = 0;
			
			String s = sc.next();		// 사용자에게 문자열 입력받음
			int [] arr = new int[26];   // 알파벳의 개수만큼 배열 생성
			
			for(int j =0; j<s.length(); j++) {
				arr[s.charAt(j) -'A'] = 1;	// 입력받은 알파벳은 1로 설정
			}
			
			for(int j = 0; j<26; j++) {
				if(arr[j] == 0) {		// 입력받지 못한 알파벳이 발견되면
					sum = sum+j+65;		// 해당 알파벳의 인덱스 + 65
				}
			}
			System.out.println(sum);
		}
	}
}