import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int c[] = new int[a]; // 입력받은 문자열 값 저장할 배열
		int sum = 0;
		String s = sc.next();
			
		for(int j =0; j<a; j++){
			if(s.charAt(j) >= 'A' || s.charAt(j) <='Z') //입력받은 문자가 알파벳인 경우
				c[j] = s.charAt(j) - 64;	// 배열 c에 해당 알파벳의 점수를 저장
			}
		for(int j =0; j<a;j++){
				sum += c[j];			// 배열 c에 저장된 알파벳의 점수를 모두 더해줌
		}
		System.out.println(sum);
	}
}