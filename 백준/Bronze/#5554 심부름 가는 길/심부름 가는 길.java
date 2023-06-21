import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		
		int tmp = a+b+c+d;
		int x = tmp / 60;
		int y = tmp - (x * 60);
		
		System.out.println(x);
		System.out.println(y);
	
		br.close();
	}
}