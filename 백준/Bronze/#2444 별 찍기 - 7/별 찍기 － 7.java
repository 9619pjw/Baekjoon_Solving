import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		for(int i = 0; i < N-1; i++){
			for(int j = i ; j < N-1; j++){
				System.out.print(" ");
			}
			for(int j = i*2; j>=0; j--){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = N-1; i >= 0; i--){
			for(int j = i ; j < N-1; j++){
				System.out.print(" ");
			}
			for(int j = i*2; j>=0; j--){
				System.out.print("*");
			}
			System.out.println();
		}

		br.close();
	}
}