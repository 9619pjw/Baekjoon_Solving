import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[3];
		int result = 1;
		for(int i =0; i<arr.length; i++){
			arr[i] = sc.nextInt();
			result *= arr[i];
		}

		String s = Integer.toString(result); // result값 문자열로 변환

		
		for(int i =0; i<10; i++){		// 0부터 9까지 반복
			int cnt = 0;				// 숫자가 몇번 쓰였는지 확인하는 변수 
			for(int j =0; j<s.length(); j++){
				if(s.charAt(j) - '0' == i) //입력받은 숫자가 i면 cnt 증가
					cnt++;
			}
			System.out.println(cnt);
		}
	}
}