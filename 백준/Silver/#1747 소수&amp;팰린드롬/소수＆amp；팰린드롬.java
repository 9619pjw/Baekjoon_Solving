import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[10000001];

		for(int i = 2; i < arr.length; i++){
			arr[i] = i;		// 배열 채워넣기
		}

		for(int i = 2; i < Math.sqrt(arr.length); i++){ // 제곱근까지만 수행
			if(arr[i] == 0){ // 소수는 넘어감
				continue;
			}
			for(int j = i + i ; j < arr.length; j += i){ // 배수 제거
				arr[j] = 0;
			}
		}

		int i = N;

		while(true){ // N부터 1씩 증가시키며 팰린드롬수인지 판별
			if(arr[i] != 0){ // 0인경우는 소수가 아니므로 논외
				int result = arr[i];
				if(isPalindrome(result)){
					System.out.println(result);
					break;
				}
			}
			i++;
		}
		br.close();
	}
	private static boolean isPalindrome(int target){
		char tmp[] = String.valueOf(target).toCharArray(); // 정수값을 char 배열로 변환
		int start = 0;
		int end = tmp.length - 1;

		while (start < end){
			if(tmp[start] != tmp[end]) // 시작과 끝 인덱스 값이 다르면 false
				return false;
			start++;
			end--;
		}
		return true;
	}
}