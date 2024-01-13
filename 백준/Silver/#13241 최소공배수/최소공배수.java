import java.util.*;
import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
		
        long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		long c = gcd(Math.max(a, b), Math.min(a, b));
        br.close();
        
		System.out.println(a * b / c);
	}
	
	private static long gcd(long a, long b) {
		if(b == 0) return a;
		return gcd(b, a % b);
	}
}