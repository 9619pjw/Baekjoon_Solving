import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		while(true){
			int N = Integer.parseInt(br.readLine());
			if(N == -1)
				break;
			else
				sum += N;
		}

		System.out.println(sum);
		br.close();
	}
}