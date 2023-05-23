import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		while(true){
			st = new StringTokenizer(br.readLine());

			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			if(A == 0 && B == 0)
				break;
			if(A % B == 0){
				System.out.println("multiple");
			}
			else if (B % A == 0){
				System.out.println("factor");
			}
			else{
				System.out.println("neither");
			}
		}
		br.close();
	}
}