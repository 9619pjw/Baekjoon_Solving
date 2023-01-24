import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[] arr = new String[N];

		for(int i =0; i<N; i++){	//문자열 입력받음
			arr[i] = sc.next();
		}
		
		Arrays.sort(arr, new Comparator<String>(){
			@Override		//배열의 정렬 기준 변경
			public int compare(String o1, String o2){
				if(o1.length() == o2.length()) // 길이가 같을 경우, 
					return o1.compareTo(o2);  // 오름차순 정렬
				else						// 길이가 다른 경우,
					return o1.length() - o2.length(); // 양수 ... 위치 변경 음수... 그대로 둠
			}
		});

		System.out.println(arr[0]);
		for(int i =1; i<N;i++){
			if(!arr[i].equals(arr[i-1])){ // 중복이 아닐때만 출력
				System.out.println(arr[i]);
			}
		}
	}
}