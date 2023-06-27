import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		if(a < b){
			System.out.println("-1");
		}
		else{
			int x = (a+b) / 2;
			int y = (a-b) / 2;
			if(x+y == a && x-y == b)
				System.out.println(x + " " + y);
			else
				System.out.println("-1");
		}
		br.close();
	}
}