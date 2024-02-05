import java.util.*;
import java.io.*;

class Main {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String str = br.readLine();
		boolean chk = false;
		for(int i=0;i<str.length()-1;i++) {
			int a = 1, b =1;
			
			for(int j = 0;j <= i;j++){
			  a *= str.charAt(j)-'0';  
			}
			
			for(int j = i+1; j < str.length();j++){
			  b *= str.charAt(j)-'0';  
			}
			
			if(a == b) {
				chk = true;
				break;
			}
			
		}
		
		System.out.println(chk?"YES":"NO");
		
	}
}