import java.io.*;

class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		
		
		while(true) {
			
			boolean check = true;
			
			for(int i = 0; i < N.length(); i++) {
				if(N.charAt(i) != '4' && N.charAt(i) != '7') {
					check = false;
					break;
				}
			}
			//해당 값이 4와 7이라면 check는 true일 것이고, true라면 반복문 종료
			//false라면 해당 값에 -1을 해준다. 입력받은건 String이기 때문에 형변환을 해줘서 빼주고, 다시 형변환
			if(check == true) break;
			else N = String.valueOf(Integer.parseInt(N) - 1);
		}
		System.out.println(N);
	}

}