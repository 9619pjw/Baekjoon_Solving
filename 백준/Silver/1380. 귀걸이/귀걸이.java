import java.util.*;
import java.io.*;

public class Main {    
	public static void main(String[] args) throws Exception { 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));         
		
		int scenarioNum = 0; // 현재 시나리오 번호
		
		while(true){
			// 시나리오 종료 조건
			int num = Integer.parseInt(br.readLine());
			if(num == 0) break;
			else scenarioNum++;
			
			// 여학생 이름 목록
			List<String> student = new ArrayList<String>();

			// 여학생들의 이름 입력 후 저장
			for(int i = 0; i < num; i++) {
				student.add(br.readLine());
			}

			// 잃어버린 학생들 목록
			List<Integer> lostStudent = new ArrayList<Integer>();

			for(int i = 0; i < (num * 2) - 1; i++){
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				int n = Integer.parseInt(st.nextToken());

				if(lostStudent.contains(n)){ // 목록에 있는 경우, 되돌려줌
					lostStudent.remove((Integer) n);
				} else {					// 목록에 없는 경우, 잃어버린 학생임.
					lostStudent.add(n); 
				}

			}

			int lostStudentNum = lostStudent.get(0); // 잃어버린 학생의 번호
			System.out.println(scenarioNum + " " + student.get(lostStudentNum - 1));	
		}   
	}
}