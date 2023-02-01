import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N= Integer.parseInt(br.readLine());
		
		Stack st = new Stack();		
       
		for(int i =0;i<N;i++) {
			String str = br.readLine(); // 명령어 입력
			String[] arr=str.split(" ");  // 공백으로 분리하여 push할 정수값 분리

		    switch(arr[0]) {	    // 입력받은 명령어로 case문 실행

			    case "push": 								
				    st.push(Integer.parseInt(arr[1])); // 스택에 arr[1] 저장
				    break;
                case "pop": 								
				    if(st.isEmpty()) // 비어있으면 -1 출력
                        System.out.println(-1); 
				    else 
                        System.out.println(st.pop());  
				    break;
			    case "size": 								
				    System.out.println(st.size());
				    break;
			    case "empty": 								
				    if(st.isEmpty()) // 비어있으면 1, 아니면 0 출력
                        System.out.println(1);
				    else 
                        System.out.println(0);
				    break;
			    case "top": 								
				    if(st.isEmpty()) // 비어있으면 -1, 아니면 맨 앞의 값 출력
                        System.out.println(-1);
				    else 
                        System.out.println(st.peek());
				    break;
                }
			
			}
			br.close();			
		}
}
