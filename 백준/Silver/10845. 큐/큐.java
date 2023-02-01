import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N= Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		int lastNum=-1;// 마지막 값을 따로 변수로 선언함. 정수 없으면 -1
       
		for(int i =0;i<N;i++) {
			String str = br.readLine(); // 명령어 입력
			String[] arr=str.split(" ");  // 공백으로 분리하여 push할 정수값 분리

		    switch(arr[0]) {	    // 입력받은 명령어로 case문 실행

			    case "push": 								
				    q.add(Integer.parseInt(arr[1])); // 큐에 arr[1] 저장
				    lastNum=Integer.parseInt(arr[1]); // 마지막 값 초기화
				    break;
                case "pop": 								
				    if(q.isEmpty()) // 비어있으면 -1 출력
                        System.out.println(-1); 
				    else 
                        System.out.println(q.poll());  
				    break;
			    case "size": 								
				    System.out.println(q.size());
				    break;
			    case "empty": 								
				    if(q.isEmpty()) // 비어있으면 1, 아니면 0 출력
                        System.out.println(1);
				    else 
                        System.out.println(0);
				    break;
			    case "front": 								
				    if(q.isEmpty()) // 비어있으면 -1, 아니면 맨 앞의 값 출력
                        System.out.println(-1);
				    else 
                        System.out.println(q.peek());
				    break;
			    case "back": 								
				    if(q.isEmpty()) // 비어있으면 -1, 아니면 마지막 값 출력
                        System.out.println(-1);
				    else 
                        System.out.println(lastNum);
				    break;
                }
			
			}
			br.close();			
		}
}
