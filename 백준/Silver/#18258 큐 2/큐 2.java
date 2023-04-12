import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		LinkedList<Integer> q = new LinkedList<>();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
        
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine());
			switch(st.nextToken()) {	
			
			case "push":
				q.offer(Integer.parseInt(st.nextToken()));	
				break;
			
			case "pop" :
				//  poll은 가장 앞에 있는 요소를 삭제하며
				//  삭제할 원소가 없을 경우 예외를 던지는 것이 아닌 null을 반환한다.
				Integer item = q.poll();	
				if(item == null)
					sb.append(-1).append('\n');
				else
					sb.append(item).append('\n');
				break;
				
			case "size":	
				sb.append(q.size()).append('\n');
				break;
	
			case "empty":
				if(q.isEmpty()) 
					sb.append(1).append('\n');
				else 
					sb.append(0).append('\n');
				break;
				
			case "front":
				Integer ite = q.peek();// peek()은 큐에 꺼낼 요소가 없을 경우 null을 반환한다.
				if(ite == null)
					sb.append(-1).append('\n');
				else
					sb.append(ite).append('\n');
				break;
				
			case "back":
				// peekLast()은 큐에 꺼낼 요소가 없을 경우 null을 반환한다.
				Integer it = q.peekLast();	 
				if(it == null) 
					sb.append(-1).append('\n');
				else 
					sb.append(it).append('\n');
				break;
			}
		}
		System.out.println(sb);
		br.close();
	}
}