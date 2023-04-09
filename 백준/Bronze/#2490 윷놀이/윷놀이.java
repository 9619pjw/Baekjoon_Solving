import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0 ; i< 3 ; i++){
			int [] arr = new int[4];
			int cnt = 0;
			char result;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j =0 ; j<arr.length; j++){
				arr[j] = Integer.parseInt(st.nextToken());
				if(arr[j] == 0){
					cnt++;
				}
			}

			switch(cnt){
				case 1 :
					result  = 'A';
					break;
				case 2 : 
					result = 'B';
					break;
				case 3 :
					result = 'C';
					break;
				case 4 :
					result = 'D';
					break;
				default :
					result = 'E';
					break;
			}
			System.out.println(result);
		}
		br.close();
	}
}