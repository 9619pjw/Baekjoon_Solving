import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String sr = sc.nextLine();
		Stack st = new Stack();
		boolean inout = false;

		for(int i =0; i<sr.length(); i++){
			if(sr.charAt(i) == '<'){			// <가 입력된 경우,
				inout = true; // 괄호 내부로 진입
				while(!st.isEmpty()){ // 스택이 차있을 경우,
					System.out.print(st.pop()); // 스택의 내용물을 출력한다
				}
				System.out.print(sr.charAt(i)); // < 출력
			}else if (sr.charAt(i) == '>'){ // >가 입력된 경우,
				inout = false;				// 괄호 외부로 나옴
				System.out.print(sr.charAt(i)); // > 출력해줌
			}else if(inout){				// 현재 괄호 내부일 때,
				System.out.print(sr.charAt(i)); // 입력된 순서대로 출력함
			}else{							// 현재 괄호 외부일 때,
				if(sr.charAt(i) == ' '){	// 입력값이 공백 문자의 경우,
					while(!st.isEmpty()){	
						System.out.print(st.pop()); // 스택이 차있으면 스택의 내용물을 꺼냄
					}
					System.out.print(sr.charAt(i)); // 공백 문자 출력
				}else{						// 입력값이 공백 문자가 아니면
					st.push(sr.charAt(i));	// 스택에 집어넣음 <- 거꾸로 출력시키기 위해 스택에 넣어둠
				}
			}
		}
		while(!st.isEmpty()){			
			System.out.print(st.pop());	// 나머지 스택에 있는 내용을 모두 출력
		}
	}
}
