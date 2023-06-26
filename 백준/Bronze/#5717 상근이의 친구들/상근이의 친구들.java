import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		while(true){
			st= new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int F = Integer.parseInt(st.nextToken());
			if ( M == 0 && F == 0)
				break;
			else
				System.out.println(M + F);
		}

		br.close();
	}
}