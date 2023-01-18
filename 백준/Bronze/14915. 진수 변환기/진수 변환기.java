import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();  // 입력받은 수
		int b = sc.nextInt();  // n진수
		Stack st= new Stack(); // 나머지를 역순으로 출력하기 위해 스택 사용 
		
		do{ // 몫이 0이 될때까지 반복
			int tmp = a%b;
			if(tmp < 10) 		// 나머지가 10보다 작으면 
				st.push(tmp);   // 스택에 나머지값 저장
			else{			// 나머지가 10보다 큰 경우 변환시킴
				switch(tmp){
					case 10:
						st.push('A');
						break;
					case 11:
						st.push('B');
						break;
					case 12:
						st.push('C');
						break;
					case 13:
						st.push('D');
						break;
					case 14:
						st.push('E');
						break;
					case 15:
						st.push('F');
						break;
				}
			}	
			a /= b; // 계속 나눠줌
		}while(a != 0);
		while(!st.isEmpty()){
			System.out.print(st.pop());			// 스택의 내용물을 전부 꺼냄
		}
	}
}
