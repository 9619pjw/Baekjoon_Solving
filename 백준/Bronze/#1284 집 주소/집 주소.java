import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int cnt = 0;
			String s = br.readLine();

			if(s.equals("0"))
				break;
			for(int i =0; i<s.length(); i++){
				String ans = s.substring(i, i+1); // 정수 한자리 추출하여 검사

				if(ans.equals("1"))
					cnt += 2;
				else if (ans.equals("0"))
					cnt += 4;
				else
					cnt += 3;
			}
			System.out.println(cnt + s.length() + 1); // 여백 포함해서 더해줌
		}
		br.close();
	}
}